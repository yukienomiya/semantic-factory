import static def.jquery.Globals.$;

import def.dom.HTMLElement;
import def.jquery.JQueryXHR;
import def.js.JSON;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlP;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan;

public class TranslationValidation {
  public static final String REST_URL = "nextExample.jsp";


  public static HTMLElement page(String word, String  description, String[] translations) {
    return HtmlDiv.newBuilder()
      .setClass("container")
      .append(
        HtmlDiv.newBuilder()
          .setClass("valign-wrapper row top-margin black-text")
          .append(
            HtmlDiv.newBuilder()
              .setClass("col s6 left-align")
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat")
                  .setHref("logout.jsp")
                  .setContent("logout")
              )
          )
          .append(
            HtmlDiv.newBuilder()
              .setClass("col s6 right-align")
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat")
                  .setHref("home.html")
                  .setContent("HOME")
              )
          )
      )
      .append(
        HtmlDiv.newBuilder()
          .setClass("valign-wrapper h80")
          .append(
            HtmlDiv.newBuilder()
              .setClass("row")
              .append(
                HtmlDiv.newBuilder()
                  .setClass("center-align")
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("fontW marginTop")
                      .append(
                        HtmlP.newBuilder()
                          .setContent("Data la seguente parola e la sua definizione, selezionare la traduzione corretta:")
                      )
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("col s12")
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("card card-color marginTB")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("card-content center-align white-text")
                              .append(
                                HtmlSpan.newBuilder()
                                  .setClass("card-title")
                                  .setContent(word.toUpperCase())
                              )
                              .append(
                                HtmlP.newBuilder()
                                  .setClass("fontP")
                                  .setContent(description)
                              )
                          )
                      )
                      .append(
                        HtmlForm.newBuilder()
                          .setClass("col s12 marginT left-align")
                          .setMethod("POST")
                          .setAction("translationValidation.jsp")
                          .append(
                            HtmlP.newBuilder()
                              .append(
                                HtmlLabel.newBuilder()
                                  .append(
                                    HtmlInput.newBuilder()
                                      .setType("checkbox")
                                      .setName("translations")
                                      .setValue(translations[0])
                                  )
                                  .append(
                                    HtmlSpan.newBuilder()
                                      .setContent(translations[0])
                                  )
                              )
                          )
                          .append(
                            HtmlP.newBuilder()
                              .append(
                                HtmlLabel.newBuilder()
                                  .append(
                                    HtmlInput.newBuilder()
                                      .setType("checkbox")
                                      .setName("translations")
                                      .setValue(translations[1])
                                  )
                                  .append(
                                    HtmlSpan.newBuilder()
                                      .setContent(translations[1])
                                  )
                              )
                          )
                          .append(
                            HtmlP.newBuilder()
                              .append(
                                HtmlLabel.newBuilder()
                                  .append(
                                    HtmlInput.newBuilder()
                                      .setType("checkbox")
                                      .setName("translations")
                                      .setValue(translations[2])
                                  )
                                  .append(
                                    HtmlSpan.newBuilder()
                                      .setContent(translations[2])
                                  )
                              )
                          )
                          .append(
                            HtmlP.newBuilder()
                              .append(
                                HtmlLabel.newBuilder()
                                  .append(
                                    HtmlInput.newBuilder()
                                      .setType("checkbox")
                                      .setName("translations")
                                      .setValue("<nessuna>")
                                  )
                                  .append(
                                    HtmlSpan.newBuilder()
                                      .setContent("<nessuna>")
                                  )
                              )
                          )
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("center-align")
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("col s12 marginT")
                                  .append(
                                    HtmlButton.newBuilder()
                                      .setClass("btn waves-effect waves-light sub-btn")
                                      .setType("submit")
                                      .setContent("AVANTI")
                                  )
                              )
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("col s12")
                                  .append(
                                    HtmlAnchor.newBuilder()
                                      .setClass("waves-effect waves-light btn white text-color skipPAD")
                                      .setContent("SALTA")
                                      .setHref("nextTask.jsp")
                                  )
                              )
                          )
                          .append(
                            HtmlInput.newBuilder()
                              .setName("word")
                              .setHidden(true)
                              .setValue(word)
                          )
                          .append(
                            HtmlInput.newBuilder()
                              .setName("description")
                              .setHidden(true)
                              .setValue(description)
                          )
                      )
                  )
              )
          )
      ).build();
  }


  public static void main(String[] args) {
    $.getJSON(REST_URL, "task=TRANSLATION_VALIDATION", (Object result, String a, JQueryXHR ctx) -> {
      JSON json = (JSON) result;
      String word = json.$get("word");
      String description = json.$get("description");
      String[] translations = json.$get("translations");
      HTMLElement page = TranslationValidation.page(word, description, translations);
      $("body").append(page);
      return null;
    });
  }
}
