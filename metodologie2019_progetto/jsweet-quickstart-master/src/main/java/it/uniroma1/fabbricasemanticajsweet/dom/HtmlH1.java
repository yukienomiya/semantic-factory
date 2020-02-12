package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLHeadingElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML H1 element.
 */
public class HtmlH1 {
  private HtmlH1() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLHeadingElement.
   */
  public static class Builder extends BasicBuilder<HTMLHeadingElement> {

    /**
     * Assigns an object of type HTMLHeadingElement to the variable element.
     */
    protected Builder() {
      element = Globals.document.createElement(StringTypes.h1);
    }

    /**
     * Set the class of the H1 element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Set the text content of the H1 element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
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
