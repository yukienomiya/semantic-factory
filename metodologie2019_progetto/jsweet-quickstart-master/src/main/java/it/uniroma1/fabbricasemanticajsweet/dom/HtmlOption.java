package it.uniroma1.fabbricasemanticajsweet.dom;

import def.dom.Globals;
import def.dom.HTMLElement;
import def.dom.HTMLOptionElement;
import jsweet.util.StringTypes;

/**
 * TODO(yukienomiya): Add JavaDoc
 */
public class HtmlOption {
  private HtmlOption() {}

  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * TODO(yukienomiya): Add JavaDoc
   */
  public static class Builder extends BasicBuilder<HTMLOptionElement> {
    HTMLOptionElement element;
    Boolean built = false;

    private Builder() {
      element = Globals.document.createElement(StringTypes.option);
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
    public Builder setSelected(Boolean sel) {
      element.selected = sel;
      return this;
    }

    /**
     * TODO(yukienomiya): Add JavaDoc
     */
    public Builder setDisabled(Boolean dis) {
      element.disabled = dis;
      return this;
    }

    /**
     * TODO(yukienomiya): Add JavaDoc
     */
    public Builder setValue(String value) {
      element.value = value;
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
  }
}
