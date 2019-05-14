package it.uniroma1.metodologie2019.hw3;

/**
 * Handles a Gloss.
 * Each Synset has one Gloss that explains its concept.
 */
public class Gloss {

		/**
		 * Represents the text of the Gloss.
		 */
	  private final String gloss;

		/**
		 * Constructs a Gloss from a text in input.
		 * @param gloss [String containing the text]
		 */
	  public Gloss(String gloss) {
	    this.gloss = gloss;
	  }

		/**
		 * Calculates the HashCode for this Gloss.
		 * The HashCode is based on the HashCode of the original text.
		 * @return [the HashCode of this Gloss]
		 */
	  @Override
	  public int hashCode() {
	    return gloss.hashCode();
	  }

		/**
		 * Returns a String representation of this Gloss.
		 * @return [a String representation of this Gloss]
		 */
	  @Override
	  public String toString() {
	    return gloss;
	  }

		/**
		 * Checks whether this Gloss equals to the specified object.
		 * @param  o [the object to compare to the Gloss]
		 * @return   [{@code true} if this Gloss equals the other one; {@code false} otherwise]
		 */
	  @Override
	  public boolean equals(Object o) {
	    return gloss.equals(o);
	  }

}
