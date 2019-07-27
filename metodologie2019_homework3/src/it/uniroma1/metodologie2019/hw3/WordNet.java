package it.uniroma1.metodologie2019.hw3;

import java.nio.file.Files;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.io.IOException;
import java.util.stream.Collectors;


/**
 * Represents a version of WordNet.
 */
public class WordNet implements Iterable<Synset> {

  /**
   * Maps the String indicating the version with each version of WordNet.
   */
  private static final Map<String, WordNet> instancesWN = new HashMap<>();

  /**
   * Represents the partial relative path needed to reach the WN database files.
   */
  private static final String WN_DICT_PATH = "wordnet-releases/releases/WordNet-";

  /**
   * Represents the version.
   */
  private final String version;

  /**
   * Maps the ID of each Synset to a list of Pair values, an ID and a WordNetRelation;
   * Links the ID of a Synset to the ones of the Synsets related to it, specifying the WordNetRelation.
   */
  private final Map<String, List<Pair<String, WordNetRelation>>> WNi;

  /**
   * Maps each ID to its respective Synset.
   */
  private final Map<String, Synset> WNits;

  /**
   * Maps each synonym to the List of ID of the Synsets in which it appears.
   */
  private final Map<String, List<String>> WNstli;


  /**
   * Constructs a WordNet instance by finding the right database files and streaming their content.
   * @param version [the version of the WordNet instance]
   */
  private WordNet(String version) {
    this.version = version;
    this.WNi = new HashMap<>();
    this.WNits = new HashMap<>();
    this.WNstli = new HashMap<>();



    String WN_PATH = WN_DICT_PATH  + version + "/dict";
    String[] WN_FILENAMES = new String[]{
      "data.noun",
      "data.verb",
      "data.adj",
      "data.adv"
    };


    try {
      for (String filename : WN_FILENAMES) {
        Path path = Paths.get(WN_PATH + "/" + filename);
        Stream<String> lines = Files.lines(path);

        lines.filter(s -> !(s.startsWith(" "))).forEach(line -> {
          Pair<Synset, List<Pair<String, WordNetRelation>>> result = parseSynsetFromString(line);
          WNi.put(result.getFirst().getID(), result.getSecond());
          WNits.put(result.getFirst().getID(), result.getFirst());
        });
        lines.close();
      }
    } catch(IOException e) {
      // e.printStackTrace();
      throw new IllegalArgumentException("Invalid version provided");
    }
  }

  /**
   * Returns a Stream of Synsets.
   * @return [a Stream of Synsets.]
   */
  public Stream<Synset> stream() {
    return WNits.values().stream();
  }

  /**
   * Returns an iterator of Synsets.
   * @return [an iterator of Synsets]
   */
  public Iterator<Synset> iterator() {
    return WNits.values().iterator();
  }


  /**
   * Gets related Synsets of the input Synset, with the input relation.
   * @param  rS [The input Synset]
   * @param  r  [The type of WordNetRelation]
   * @return    [the List containing the Synsets related to rS through a relation r]
   */
  public List<Synset> getRelatedSynsets(Synset rS, String r) {
    WordNetRelation wnR = WordNetRelation.get(r);
    LinkedList<Synset> relSynsets = new LinkedList<>();
    for (Pair<String, WordNetRelation> p : WNi.get(rS.getID())) {
      if (p.getSecond().equals(wnR)) {
        relSynsets.add(getSynsetFromID(p.getFirst()));
      }
    }
    return relSynsets;
  }

  /**
  * Gets related Synsets of the input Synset.
  * @param  rS [The input Synset]
  * @return    [the List containing the Synsets related to rS]
   */
  public List<Synset> getRelatedSynsets(Synset rS) {
    LinkedList<Synset> relSynsets = new LinkedList<>();
    for (Pair<String, WordNetRelation> p : WNi.get(rS.getID())) {
      relSynsets.add(getSynsetFromID(p.getFirst()));
    }
    return relSynsets;
  }


  /**
   * Gets the Synset that contain the String lemma.
   * @param  lemma [String that has to be contained in the Synsets]
   * @return       [the List of the Synsets containing lemma]
   */
  public List<Synset> getSynsets(String lemma) {
    return WNstli.getOrDefault(lemma, new LinkedList<>()).stream().map(id -> getSynsetFromID(id)).collect(Collectors.toList());
  }


  /**
   * Gets the Synset of POS equal to pos that contain the String lemma.
   * @param  lemma [String that has to be contained in the Synsets]
   * @param  pos   [POS of the Synsets]
   * @return       [the List of the Synsets of POS equal to pos and containing lemma]
   */
  public List<Synset> getSynsets(String lemma, POS pos) {
    return getSynsets(lemma).stream().filter(s -> s.getPOS().equals(pos)).collect(Collectors.toList());
  }


  /**
   * Gets a specific Synset from an ID.
   * @param  id [the ID of the Synset]
   * @return    [the Synset with an ID equal to id]
   */
  public Synset getSynsetFromID(String id) {
    return WNits.get(id);
  }


  /**
   * Gets the version of te WordNet instance.
   * @return [the version of the WordNet instance]
   */
  public String getVersion() {
    return version;
  }


  /**
   * Gets the WordNet instance with the wanted version.
   * @param  version [the version wanted]
   * @return         [the WordNet instance of version version if it already exists, it creates one and returns it otherwise]
   */
  public static WordNet getInstance(String version) {
    if (!instancesWN.containsKey(version)) {
      try {
        instancesWN.put(version, new WordNet(version));
      } catch (Exception e) {
        return null;
      }
    }
    return instancesWN.get(version);
  }


  /**
   * Parses a Synset from a line of a WordNet database file.
   * @param  line [String representing the line of the database file]
   * @return      [a Pair of a Synset and a list representing its related Synsets]
   */
  private Pair<Synset, List<Pair<String, WordNetRelation>>> parseSynsetFromString(String line) {
    String[] parts = line.split("\\|");
    String[] synsetData = parts[0].split(" ");

    String offset = synsetData[0];
    POS pos = POS.fromStringToPOS(synsetData[2]);
    String ID = offset + pos.toString();

    final int w_off = 4;
    int w_cnt = Integer.parseInt(synsetData[w_off - 1], 16);
    LinkedList<String> synonyms = new LinkedList<>();
    for (int i = 0, e = w_cnt * 2; i < e; i += 2) {
      String lemma = synsetData[w_off + i];
      List<String> lemmas = WNstli.getOrDefault(lemma, new LinkedList<>());
      lemmas.add(ID);
      WNstli.put(lemma, lemmas);
      synonyms.add(lemma);
    }

    int p_off = w_off + w_cnt * 2 + 1;
    int p_cnt = Integer.parseInt(synsetData[p_off - 1], 10);
    List<Pair<String, WordNetRelation>> relationList = new LinkedList<>();
    for (int i = 0, e = p_cnt * 4; i < e; i += 4) {
      String relType = synsetData[p_off + i];
      String relOffset = synsetData[p_off + i + 1];
      POS relPos = POS.fromStringToPOS(synsetData[p_off + i + 2]);
      String relId = relOffset + relPos.toString();
      WordNetRelation relRel = WordNetRelation.get(relType);
      relationList.add(new Pair<>(relId, relRel));
    }

    String[] synsetGloss = parts[1].split("\"", 2);
    String glossStr = synsetGloss[0].trim();
    int gend = glossStr.length();
    while (gend > 0 && (glossStr.charAt(gend - 1) == ';' || glossStr.charAt(gend - 1) == ':')) {
      gend--;
    }
    glossStr = glossStr.substring(0, gend);
    Gloss gloss = new Gloss(glossStr);

    HashSet<Example> examples = new HashSet<>();
    if (synsetGloss.length == 2) {
      String exampleStr = "\"" + synsetGloss[1].trim();
      int li = 0;
      while (li < exampleStr.length()) {
        while (li < exampleStr.length() && exampleStr.charAt(li) != '"') li++;
        int is = li;
        while (is < exampleStr.length() && exampleStr.charAt(is) == '"') is++;
        int ie = is + 1;
        while (ie < exampleStr.length() && exampleStr.charAt(ie) != '"') ie++;
        li = ie + 1;

        if (is < exampleStr.length() && ie - is >= 1) {
          Example example = new Example(exampleStr.substring(is, ie));
          examples.add(example);
        }
      }
    }

    Synset s = new Synset(ID, offset, pos, synonyms, gloss, examples);
    return new Pair<>(s, relationList);
  }
}
