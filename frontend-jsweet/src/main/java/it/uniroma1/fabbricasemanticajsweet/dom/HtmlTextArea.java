package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLTextAreaElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML TextArea element.
 */
public class HtmlTextArea {
  private HtmlTextArea() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLTextAreaElement.
   */
  public static class Builder extends BasicBuilder<HTMLTextAreaElement> {

    /**
     * Assigns an object of type HTMLTextAreaElement to the variable element.
     */
    protected Builder() {
      element = Globals.document.createElement(StringTypes.textarea);
    }

    /**
     * Sets the class of the Text Area element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Sets the text content of the Text Area element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * Sets the required attribute of the Text Area element.
     * @return [the Builder object]
     */
    public Builder setRequired(Boolean b) {
      element.required = b;
      return this;
    }

    /**
     * Sets the id of the Text Area element.
     * @return [the Builder object]
     */
    public Builder setId(String id) {
      element.id = id;
      return this;
    }

    /**
     * Sets the name of the Text Area element.
     * @return [the Builder object]
     */
    public Builder setName(String name) {
      element.name = name;
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
