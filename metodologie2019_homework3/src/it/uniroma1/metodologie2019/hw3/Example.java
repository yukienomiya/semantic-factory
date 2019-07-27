package it.uniroma1.metodologie2019.hw3;

/**
 * Handles an Example.
 * One or more Example may be included in a Synset to clarify its concept.
 */
public class Example {

		/**
		 * Represents the text of the Example.
		 */
	  private final String example;

		/**
		 * Constructs an Example from a text in input.
		 * @param example [String containing the text]
		 */
	  public Example(String example) {
	    this.example = example;
	  }

		/**
		 * Calculates the HashCode for this Example.
		 * The HashCode is based on the HashCode of the original text.
		 * @return [the hashCode of this Example]
		 */
	  @Override
	  public int hashCode() {
	    return example.hashCode();
	  }

		/**
		 * Returns a String representation of this Example.
		 * @return [a String representation of this Example]
		 */
	  @Override
	  public String toString() {
	    return example;
	  }

		/**
		 * Checks whether this Example equals to the specified object.
		 * @param  o [the object to compare to the Example]
		 * @return   [{@code true} if this Example equals the other one; {@code false} otherwise]
		 */
	  @Override
	  public boolean equals(Object o) {
	    return example.equals(o);
	  }
}
