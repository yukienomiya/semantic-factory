package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLAnchorElement;
import def.dom.HTMLElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Anchor element.
 */
public class HtmlAnchor {
  private HtmlAnchor() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLAnchorElement.
   */
  public static class Builder extends BasicBuilder<HTMLAnchorElement> {

    /**
     * Assigns an object of type HTMLAnchorElement to the variable element.
     */
    private Builder() {
      element = Globals.document.createElement(StringTypes.a);
    }

    /**
     * Set the class of the Anchor element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Set the text content of the Anchor element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * Set the href of the Anchor element.
     * @return [the Builder object]
     */
    public Builder setHref(String href) {
      element.href = href;
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
