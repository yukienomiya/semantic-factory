package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLSelectElement;
import jsweet.util.StringTypes;

/**
 * Represents a HTML Select element.
 */
public class HtmlSelect {
  private HtmlSelect() {}

  /**
   * Returns an object of type Builder.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Represents a Builder of HTMLSelectElement.
   */
  public static class Builder extends BasicBuilder<HTMLSelectElement> {

    /**
     * Assigns an object of type HTMLSelectElement to the variable element.
     */
    protected Builder() {
      element = Globals.document.createElement(StringTypes.select);
    }

    /**
     * Set the class of the Select element.
     * @return [the Builder object]
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * Set the name of the Select element.
     * @return [the Builder object]
     */
    public Builder setName(String name) {
      element.name = name;
      return this;
    }

    /**
     * Set the id of the Select element.
     * @return [the Builder object]
     */
    public Builder setId(String id) {
      element.id = id;
      return this;
    }

    /**
     * Set the disabled attribute of the Select element.
     * @return [the Builder object]
     */
    public Builder setDisabled(Boolean b) {
      element.disabled = b;
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
