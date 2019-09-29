package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLLabelElement;
import jsweet.util.StringTypes;

/**
 * TODO(yukienomiya): Add JavaDoc
 */
public class HtmlLabel {
  private HtmlLabel() {}

  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * TODO(yukienomiya): Add JavaDoc
   */
  public static class Builder extends BasicBuilder<HTMLLabelElement> {
    HTMLLabelElement element;
    Boolean built = false;

    private Builder() {
      element = Globals.document.createElement(StringTypes.label);
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

    /**
     * TODO(yukienomiya): Add JavaDoc
     */
    public Builder setFor(String elementsName) {
      element.htmlFor = elementsName;
      return this;
    }
  }
}
