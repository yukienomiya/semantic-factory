package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLFormElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Form element.
 */
public class HtmlForm {
  private HtmlForm() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLFormElement.
   */
  public static class Builder extends BasicBuilder<HTMLFormElement> {

    /**
     * Assigns an object of type HTMLFormElement to the variable element.
     */
    protected Builder() {
      element = Globals.document.createElement(StringTypes.form);
    }

    /**
     * Sets the class of the Form element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Sets the text content of the Form element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * Sets the method of the Form element.
     * @return [the Builder object]
     */
    public Builder setMethod(String method) {
      element.method = method;
      return this;
    }

    /**
     * Sets the action of the Form element.
     * @return [the Builder object]
     */
    public Builder setAction(String action) {
      element.action = action;
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
