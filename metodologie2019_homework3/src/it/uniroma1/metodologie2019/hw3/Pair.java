package it.uniroma1.metodologie2019.hw3;

import java.util.Objects;

/**
 * Creates a Pair of related values.
 */
public class Pair<F, S> {
  private final F first;
  private final S second;

  /**
   * Creates a new Pair.
   * @param first  [First value, of type F]
   * @param second [Second value, of type S]
   */
  public Pair(F first, S second) {
    this.first = first;
    this.second = second;
  }

  /**
   * Returns the first value of the Pair.
   * @return [the first value of the Pair]
   */
  public F getFirst() {
    return first;
  }

  /**
   * Returns the second value of the Pair.
   * @return [the second value of the Pair]
   */
  public S getSecond() {
    return second;
  }

  /**
   * String representation of this Pair
   * @return [a String representation of this Pair, formatted as: (first, second)]
   */
  @Override
  public String toString() {
    return "(" + first + ", " + second + ")";
  }

  /**
   * Checks whether this Pair equals to the specified object.
   * @param  o [the object to compare to the Pair]
   * @return   [{@code true} if this Pair equals the other one; {@code false} otherwise]
   */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Pair)) return false;
    Pair<?, ?> p = (Pair<?, ?>) o;
    return first.equals(p.first) && second.equals(p.second);
  }

  /**
   * Calculates the hashCode for this Pair.
   * The HashCode is based on the HashCode of the two values.
   * @return [the hashCode of this Pair]
   */
  @Override
  public int hashCode() {
    return Objects.hash(first, second);
  }
}
