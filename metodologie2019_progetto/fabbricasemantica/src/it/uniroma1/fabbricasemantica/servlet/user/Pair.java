package it.uniroma1.fabbricasemantica.servlet.user;

import java.util.Objects;

public class Pair<F, S> {
  private final F first;
  private final S second;

  public Pair(F first, S second) {
    this.first = first;
    this.second = second;
  }

  public F getFirst() {
    return first;
  }

  public S getSecond() {
    return second;
  }

  @Override
  public String toString() {
    return first + " - " + second;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Pair)) return false;
    Pair<?, ?> p = (Pair<?, ?>) o;
    return first.equals(p.first) && second.equals(p.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, second);
  }
}
