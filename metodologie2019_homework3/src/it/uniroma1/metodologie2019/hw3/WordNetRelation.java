package it.uniroma1.metodologie2019.hw3;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a relation between two Synsets.
 */
public class WordNetRelation {

  /**
   * Maps each possible kind of relation with its String symbol.
   */
  private static final Map<String, WordNetRelation> instances = new HashMap<>();

  /**
   * Symbol of the relation.
   */
  private final String name;

  /**
   * Constructs a WordNetRelation from the input string.
   * @param name [String containing the symbol of the relation]
   */
  private WordNetRelation(String name) {
    this.name = name;
  }

  /**
   * Gets the WordNetRelation which has the String name as symbol.
   * If the relation can't be found in the map it's added, then returned.
   * @param  name [description]
   * @return      [the WordNetRelation which has the String name as symbol]
   */
  public static WordNetRelation get(String name) {
    if (!instances.containsKey(name)) {
      instances.put(name, new WordNetRelation(name));
    }
    return instances.get(name);
  }

  /**
   * Returns a String representation of this Relation.
   * @return [a String representation of this Relation]
   */
  @Override
  public String toString() {
    return name.toString();
  }

  /**
   * Generates the hashCode of this Relation;
   * @return [the hashCode of this Relation]
   */
  @Override
  public int hashCode() {
    return name.hashCode();
  }

  /**
   * Checks whether this Relation equals to the specified object.
   * @param  o [the object to compare to the Relation]
   * @return   [{@code true} if this Relation equals the other one; {@code false} otherwise]
   */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof WordNetRelation)) return false;
    WordNetRelation r = (WordNetRelation)o;
    return name.equals(r.name);
  }
}
