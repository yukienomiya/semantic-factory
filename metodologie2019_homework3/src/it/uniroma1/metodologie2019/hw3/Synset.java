package it.uniroma1.metodologie2019.hw3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents a Synset.
 */
public class Synset {

  /**
   * Represents the key that uniquely identifies each Synset.
   * It's created by concatenating the offset and the String abbreviation of the POS.
   */
  private final String ID;

  /**
   * Represents the offset of the Synset.
   */
  private final String offset;

  /**
   * Represents the Part Of Speech of the Synset.
   */
  private final POS POS;

  /**
   * Represents the gloss of the Synset.
   */
  private final Gloss gloss;

  /**
   * Represents the List of synonyms contained in the Synset.
   */
  private final LinkedList<String> synonyms;

  /**
   * Represents the Set of examples contained in the Synset.
   */
  private final HashSet<Example> examples;


  /**
   * Constructs a Synset.
   * @param ID       [Represents the ID of the Synset]
   * @param offset   [Represents th eoffset of the Synset]
   * @param POS      [Represents the POS of the Synset]
   * @param synonyms [Represents the List of synonyms contained in the Synset]
   * @param gloss    [Represents the gloss of the Synset]
   * @param examples [Represents the Set of examples contained in the Synset]
   */
  public Synset(String ID, String offset, POS POS, LinkedList<String> synonyms, Gloss gloss, HashSet<Example> examples) {
    this.ID = ID;
    this.offset = offset;
    this.POS = POS;
    this.synonyms = new LinkedList<>(synonyms);
    this.gloss = gloss;
    this.examples = new HashSet<>(examples);
  }

  /**
   * Returns the ID of the Synset.
   * @return [the ID of the Synset]
   */
  public String getID() {
    return ID;
  }

  /**
   * Returns the offset of the Synset.
   * @return [the offset of the Synset]
   */
  public String getOffset() {
    return offset;
  }

  /**
   * Returns the POS of the Synset.
   * @return [the POS of the Synset]
   */
  public POS getPOS() {
    return POS;
  }

  /**
   * Returns the Gloss of the Synset.
   * @return [the Gloss of the Synset]
   */
  public Gloss getGloss() {
    return gloss;
  }

  /**
   * Returns the synonyms of the Synset.
   * @return [the List of Strings that represent the synonyms of the Synset]
   */
  public List<String> getSynonyms() {
    return synonyms;
  }

  /**
   * Returns the examples of the Synset.
   * @return [the Set of Strings that represent the examples of the Synset]
   */
  public HashSet<String> getExamples() {
    HashSet<String> result = new HashSet<>();
    for (Example e : examples) {
      result.add(e.toString());
    }
    return result;
  }

  /**
   * Checks whether the List of synonyms contains the input parameter.
   * @param  syn the String that represents the synonym that has to be checked.
   * @return   {@code true} if syn appears in the List, {@code false} otherwise.
   */
  public boolean contains(String syn) {
    return synonyms.contains(syn);
  }

  /**
   * Generates the hashCode of the Synset, based on the hashCode of the ID.
   * @return [the hashCode of the Synset]
   */
  @Override
  public int hashCode() {
    return ID.hashCode();
  }

  /**
   * Checks whether this Synset equals to the specified object.
   * @param  o [the object to compare to the Synset]
   * @return   [{@code true} if this Gloss equals the other one; {@code false} otherwise]
   */
  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Synset s = (Synset)o;
    return ID.equals(s.getID());
  }

  /**
   * Returns a String representation of this Synset.
   * @return [a String representation of this Synset]
   */
  @Override
  public String toString() {
    return ID.toString();
  }

}
