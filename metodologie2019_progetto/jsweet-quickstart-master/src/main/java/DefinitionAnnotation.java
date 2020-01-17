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
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea;

public class DefinitionAnnotation {
  public static final String REST_URL = "nextExample.jsp";


  public static HTMLElement page(String word, String  hypernym) {
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
                          .setContent("Data la seguente parola ed il suo iperonimo, inserisci la sua definizione nella tua lingua madre:")
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
                                  .setContent(hypernym)
                              )
                          )
                      )
                      .append(
                        HtmlForm.newBuilder()
                          .setClass("col s12 marginT")
                          .setMethod("POST")
                          .setAction("definitionAnnotation.jsp")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("row")
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("input-field col s12")
                                  .append(
                                    HtmlTextArea.newBuilder()
                                      .setName("definition")
                                      .setId("textarea1")
                                      .setClass("materialize-textarea")
                                      .setRequired(true)
                                  )
                                  .append(
                                    HtmlLabel.newBuilder()
                                      .setFor("textarea1")
                                      .setContent("Definizione")
                                  )
                              )
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
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("word")
                                  .setHidden(true)
                                  .setValue(word)
                              )
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("hypernym")
                                  .setHidden(true)
                                  .setValue(hypernym)
                              )
                          )
                      )
                  )
              )
          )
      ).build();
  }


  public static void main(String[] args) {
    $.getJSON(REST_URL, "task=DEFINITION_ANNOTATION", (Object result, String a, JQueryXHR ctx) -> {
      JSON json = (JSON) result;
      String word = json.$get("word");
      String hypernym = json.$get("hypernym");
      HTMLElement page = DefinitionAnnotation.page(word, hypernym);
      $("body").append(page);
      return null;
    });
  }
}
