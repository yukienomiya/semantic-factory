import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Multimappa<T, S> {
  Map<T, Set<S>> map;

  public Multimappa() {
    map = new HashMap<>();
  }

  public boolean put(T key, S value) {
    if (!map.containsKey(key)) {
      Set<S> setOfK = new HashSet<>();
      setOfK.add(value);
      map.put(key, setOfK);
      return true;
    }
    else {
      Set<S> setOfK = map.get(key);
      if (setOfK.contains(value)) return false;
      setOfK.add(value);
      return true;
    }
  }

  public Set<S> get(T key) {
    return map.get(key);
  }

  public boolean contains(T key, S value) {
    if (!map.containsKey(key)) return false;
    else {
      Set<S> setOfK = map.get(key);
      if (setOfK.contains(value)) return true;
      return false;
    }
  }

  public Set<S> setIntersection(T key, Set<S> set) {
    Set<S> setOfK = map.get(key);
    Set<S> newV = new HashSet<>();
    for (S s : set) {
      if (setOfK.contains(s)) {
        newV.add(s);
      }
    }
    return newV;
  }

  public void intersect(T key, Set<S> set) throws IllegalArgumentException {
    if (!map.containsKey(key)) throw new IllegalArgumentException();
    if (set == null) {
      map.remove(key);
    }
    else {
      map.replace(key, setIntersection(key, set));
    }
  }

  public void intersectMultiMappa(Multimappa<T, S> m2) {
    for (T k : m2.keySet()) {
      if (!map.containsKey(k)) {
        map.remove(k);
      }
      else {
        map.replace(k, setIntersection(k, get(k)));
      }
    }
  }
}
