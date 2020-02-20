package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLSpanElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Span element.
 */
public class HtmlSpan {
  private HtmlSpan() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLSpanElement.
   */
  public static class Builder extends BasicBuilder<HTMLSpanElement> {

    /**
     * Assigns an object of type HTMLSpanElement to the variable element.
     */
    protected Builder() {
      element = Globals.document.createElement(StringTypes.span);
    }

    /**
     * Sets the id of the Span element.
     * @return [the Builder object]
     */
    public Builder setId(String id) {
      element.id = id;
      return this;
    }

    /**
     * Sets the class of the Span element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Sets the text content of the Span element.
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
