package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import jsweet.util.StringTypes;
import def.dom.HTMLParagraphElement;

/**
 * Represents a HTML P element.
 */
public class HtmlP {
  private HtmlP() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLParagraphElement.
   */
  public static class Builder extends BasicBuilder<HTMLParagraphElement> {

    /**
     * Assigns an object of type HTMLParagraphElement to the variable element.
     */
    protected Builder() {
      element = Globals.document.createElement(StringTypes.p);
    }

    /**
     * Set the class of the P element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Set the id of the P element.
     * @return [the Builder object]
     */
    public Builder setId(String id) {
      element.id = id;
      return this;
    }

    /**
     * Set the text content of the P element.
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
