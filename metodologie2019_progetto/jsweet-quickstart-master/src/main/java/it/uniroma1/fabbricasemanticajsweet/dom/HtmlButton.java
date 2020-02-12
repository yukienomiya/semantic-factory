package it.uniroma1.fabbricasemanticajsweet.dom;

import java.util.function.Function;

import def.dom.Globals;
import def.dom.HTMLButtonElement;
import def.dom.HTMLElement;
import def.dom.MouseEvent;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Button element.
 */
public class HtmlButton {
  private HtmlButton() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLButtonElement.
   */
  public static class Builder extends BasicBuilder<HTMLButtonElement> {

    private Builder() {
      element = Globals.document.createElement(StringTypes.button);
    }

    /**
     * Set the class of the Button element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Set the text content of the Button element.
     * @return [the Builder object]
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * Set the onclick of the Button element.
     * @return [the Builder object]
     */
    public Builder setOnClick(Function<MouseEvent, Object> f) {
      element.onclick = f;
      return this;
    }

    /**
     * Set the type of the Button element.
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
