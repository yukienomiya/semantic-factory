package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLButtonElement;
import def.dom.HTMLElement;
import jsweet.util.StringTypes;

/**
 * TODO(yukienomiya): Add JavaDoc
 */
public class HtmlButton {
  private HtmlButton() {}

  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * TODO(yukienomiya): Add JavaDoc
   */
  public static class Builder extends BasicBuilder<HTMLButtonElement> {
    HTMLButtonElement element;
    Boolean built = false;

    private Builder() {
      element = Globals.document.createElement(StringTypes.button);
    }

    /**
     * TODO(yukienomiya): Add JavaDoc
     */
    public Builder setClass(String classe) {
      element.className = classe;
      return this;
    }

    /**
     * TODO(yukienomiya): Add JavaDoc
     */
    public Builder setContent(String textContent) {
      element.textContent = textContent;
      return this;
    }

    /**
     * TODO(yukienomiya): Add JavaDoc
     */
    final public Builder append(HTMLElement child) {
      element.appendChild(child);
      return this;
    }

    /**
     * TODO(yukienomiya): Add JavaDoc
     */
    final public Builder append(BasicBuilder<? extends HTMLElement> childBuilder) {
      element.appendChild(childBuilder.build());
      return this;
    }

    public Builder setType(String type) {
      element.type = type;
      return this;
    }
  }
}
