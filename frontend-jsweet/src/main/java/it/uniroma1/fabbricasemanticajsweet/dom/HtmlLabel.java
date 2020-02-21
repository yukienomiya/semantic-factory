package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLLabelElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Label element.
 */
public class HtmlLabel {
  private HtmlLabel() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLLabelElement.
   */
  public static class Builder extends BasicBuilder<HTMLLabelElement> {

    /**
     * Assigns an object of type HTMLLabelElement to the variable element.
     */
    private Builder() {
      element = Globals.document.createElement(StringTypes.label);
    }

    /**
     * Sets the class of the Label element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Sets the text content of the Label element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * Sets the id of the Label element.
     * @return [the Builder object]
     */
    public Builder setId(String id) {
      element.id = id;
      return this;
    }

    /**
     * Sets the htmlFor of the Label element.
     * @return [the Builder object]
     */
    public Builder setFor(String elementsName) {
      element.htmlFor = elementsName;
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
