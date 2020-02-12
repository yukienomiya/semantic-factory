package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLUListElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML UL element.
 */
public class HtmlUL {
  private HtmlUL() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLUListElement.
   */
  public static class Builder extends BasicBuilder<HTMLUListElement> {

    /**
     * Assigns an object of type HTMLUListElement to the variable element.
     */
    protected Builder() {
      element = Globals.document.createElement(StringTypes.ul);
    }

    /**
     * Set the class of the UL element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Set the id of the UL element.
     * @return [the Builder object]
     */
    public Builder setId(String id) {
      element.id = id;
      return this;
    }

    /**
     * Appends another HTMLElement to the element.
     * @return [the Builder object]
     */
    final public Builder append(HTMLElement child) {
      element.appendChild(child);
      return this;
    }

    /**
     * Appends another element Builder to the Builder.
     * @return [the Builder object]
     */
    final public Builder append(BasicBuilder<? extends HTMLElement> childBuilder) {
      element.appendChild(childBuilder.build());
      return this;
    }
  }
}
