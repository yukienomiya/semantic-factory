package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.HTMLElement;

/**
 * TODO(yukienomiya): Add JavaDoc
 */
public abstract class BasicBuilder<T extends HTMLElement> {
  protected T element;
  private Boolean built = false;

  protected BasicBuilder() {}

  /**
   * TODO(yukienomiya): Add JavaDoc
   */
  final public T build() {
    if (built) {
      throw new Error("Build method should be called only once");
    }
    built = true;
    return element;
  }
}
