package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLOptionElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Option element.
 */
public class HtmlOption {
  private HtmlOption() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLOptionElement.
   */
  public static class Builder extends BasicBuilder<HTMLOptionElement> {

    /**
     * Assigns an object of type HTMLOptionElement to the variable element.
     */
    private Builder() {
      element = Globals.document.createElement(StringTypes.option);
    }

    /**
     * Sets the class of the Option element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Sets the text content of the Option element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * Sets the selected attribute of the Option element.
     * @return [the Builder object]
     */
    public Builder setSelected(Boolean sel) {
      element.selected = sel;
      return this;
    }

    /**
     * Sets the disabled attribute of the Option element.
     * @return [the Builder object]
     */
    public Builder setDisabled(Boolean dis) {
      element.disabled = dis;
      return this;
    }

    /**
     * Sets the value of the Option element.
     * @return [the Builder object]
     */
    public Builder setValue(String value) {
      element.value = value;
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
