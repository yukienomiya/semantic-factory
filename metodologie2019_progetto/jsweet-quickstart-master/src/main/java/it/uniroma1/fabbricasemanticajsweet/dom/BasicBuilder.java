package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.HTMLElement;

/**
 * Represents the generic Builder.
 */
public abstract class BasicBuilder<T extends HTMLElement> {
  
  /**
   * Represents the element to build.
   */
  protected T element;

  /**
   * Indicates whether the element has already been built or not.
   */
  private Boolean built = false;

  protected BasicBuilder() {}

  /**
   * Returns the element only once.
   */
  final public T build() {
    if (built) {
      throw new Error("Build method should only be called once");
    }
    built = true;
    return element;
  }
}
