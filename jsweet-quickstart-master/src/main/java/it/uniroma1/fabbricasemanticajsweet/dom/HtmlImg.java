package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLImageElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Image element.
 */
public class HtmlImg {
  private HtmlImg() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLImageElement.
   */
  public static class Builder extends BasicBuilder<HTMLImageElement> {

    /**
     * Assigns an object of type HTMLImageElement to the variable element.
     */
    private Builder() {
      element = Globals.document.createElement(StringTypes.img);
    }

    /**
     * Sets the class of the Image element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
        element.className = classe;
        return this;
    }

    /**
     * Sets the src of the Image element.
     * @return [the Builder object]
     */
    public Builder setSrc(String src) {
      element.src = src;
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
