import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collezione<T extends Comparable<T>> {
  Set<Coppia<T>> set;

  public Collezione() {
    set = new TreeSet<>();
  }

  public void aggiungi(Coppia<T> c) {
    set.add(c);
  }

  public void elimina(Coppia<T> c) {
    if (set.contains(c)) set.remove(c);
  }

  public Set<Coppia<T>> getCoppiePerX(T t) {
    return set.stream().filter(c -> c.getFirst().equals(t)).collect(Collectors.toSet());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Coppia<T> c : set) {
      sb.append(c.toString());
    }
    return sb.toString();
  }
}
