package it.uniroma1.fabbricasemanticajsweet.dom;

import java.util.function.Function;

import def.dom.Event;
import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLInputElement;
import def.dom.KeyboardEvent;
import def.dom.MouseEvent;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Input element.
 */
public class HtmlInput {
  private HtmlInput() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLInputElement.
   */
  public static class Builder extends BasicBuilder<HTMLInputElement> {

    /**
     * Assigns an object of type HTMLInputElement to the variable element.
     */
    protected Builder() {
      element = Globals.document.createElement(StringTypes.input);
    }

    /**
     * Sets the class of the Input element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Sets the value of the Input element.
     * @return [the Builder object]
     */
    public Builder setValue(String value) {
      element.value = value;
      return this;
    }

    /**
     * Sets the text content of the Input element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * Sets the placeholder of the Input element.
     * @return [the Builder object]
     */
    public Builder setPlaceholder(String ph) {
      element.placeholder = ph;
      return this;
    }

    /**
     * Sets the required attribute of the Input element.
     * @return [the Builder object]
     */
    public Builder setRequired(Boolean b) {
      element.required = b;
      return this;
    }

    /**
     * Sets the hidden attribute of the Input element.
     * @return [the Builder object]
     */
    public Builder setHidden(Boolean b) {
      element.hidden = b;
      return this;
    }

    /**
     * Sets the id of the Input element.
     * @return [the Builder object]
     */
    public Builder setId(String id) {
      element.id = id;
      return this;
    }

    /**
     * Sets the onclick of the Input element.
     * @return [the Builder object]
     */
    public Builder setOnClick(Function<MouseEvent, Object> f) {
      element.onclick = f;
      return this;
    }

    /**
     * Sets the oninput of the Input element.
     * @return [the Builder object]
     */
    public Builder setOninput(Function<Event, Object> f) {
      element.oninput = f;
      return this;
    }

    /**
     * Sets the onkeyup of the Input element.
     * @return [the Builder object]
     */
    public Builder setOnkeyup(Function<KeyboardEvent, Object> f) {
      element.onkeyup = f;
      return this;
    }

    /**
     * Sets the name of the Input element.
     * @return [the Builder object]
     */
    public Builder setName(String name) {
      element.name = name;
      return this;
    }

    /**
     * Sets the type of the Input element.
     * @return [the Builder object]
     */
    public Builder setType(String type) {
      element.type = type;
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
