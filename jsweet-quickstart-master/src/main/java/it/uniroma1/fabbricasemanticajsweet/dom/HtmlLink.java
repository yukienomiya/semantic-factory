package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLLinkElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Link element.
 */
public class HtmlLink {
  private HtmlLink() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLLinkElement.
   */
  public static class Builder extends BasicBuilder<HTMLLinkElement> {

    /**
     * Assigns an object of type HTMLLinkElement to the variable element.
     */
    private Builder() {
      element = Globals.document.createElement(StringTypes.link);
    }

    /**
     * Sets the class of the Link element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Sets the text content of the Link element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * Sets the id of the Link element.
     * @return [the Builder object]
     */
    public Builder setId(String id) {
      element.id = id;
      return this;
    }
    
    /**
     * Sets the href of the Link element.
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
