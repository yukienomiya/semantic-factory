public class Coppia<T extends Comparable<T>> implements Comparable<Coppia<T>> {
  private T x;
  private T y;

  public Coppia(T x, T y) {
    this.x = x;
    this.y = y;
  }

  public T getFirst() {
    return x;
  }

  public T getSecond() {
    return y;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Coppia<?> coppia = (Coppia<?>)o;
    return this.x.equals(coppia.x) && this.y.equals(coppia.y);
  }

  @Override
  public int hashCode() {
    return (x.hashCode() + y.hashCode()) / 2;
  }

  @Override
  public int compareTo(Coppia<T> c) {
    return x.compareTo(c.x);
  }

  @Override
  public String toString() {
    return "[ " + x.toString() + ", " + y.toString() + "]";
  }
}
