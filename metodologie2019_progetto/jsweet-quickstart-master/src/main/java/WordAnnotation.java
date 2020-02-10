import static def.jquery.Globals.$;
import static def.dom.Globals.window;

import def.dom.HTMLElement;
import def.jquery.JQueryXHR;
import def.js.JSON;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlP;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea;

public class WordAnnotation {
  public static final String REST_URL = "nextExample.jsp";
  public static final String LOGIN_CHECK = "isLoggedIn.jsp";

  public static HTMLElement page(String  description) {
    return HtmlDiv.newBuilder()
      .append(
        HtmlDiv.newBuilder()
          .setClass("row lightBrown navb valign-wrapper")
          .append(
            HtmlDiv.newBuilder()
              .setClass("col s6")
              .append(
                HtmlImg.newBuilder()
                  .setClass("imgS")
                  .setSrc("images/FS.svg")
              )
          )
          .append(
            HtmlDiv.newBuilder()
              .setClass("col s6 right-align")
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat brownie")
                  .setHref("home.html")
                  .setContent("HOME")
              )
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat brownie")
                  .setHref("logout.jsp")
                  .setContent("logout")
              )
          )
      )
      .append(
        HtmlDiv.newBuilder()
          .setClass("container")
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
                              .setContent("Data la seguente definizione, prova ad indovinare la parola descritta in italiano:")
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("col s12")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("card green-card marginTB")
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("card-content center-align white-text")
                                  .append(
                                    HtmlP.newBuilder()
                                      .setClass("fontP")
                                      .setContent(description)
                                  )
                              )
                          )
                          .append(
                            HtmlForm.newBuilder()
                              .setClass("col s12 marginT")
                              .setMethod("POST")
                              .setAction("wordAnnotation.jsp")
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("row")
                                  .append(
                                    HtmlDiv.newBuilder()
                                      .setClass("input-field col s12")
                                      .append(
                                        HtmlTextArea.newBuilder()
                                          .setName("word")
                                          .setId("textarea1")
                                          .setClass("materialize-textarea")
                                          .setRequired(true)
                                      )
                                      .append(
                                        HtmlLabel.newBuilder()
                                          .setFor("textarea1")
                                          .setContent("Parola")
                                      )
                                  )
                                  .append(
                                    HtmlDiv.newBuilder()
                                      .setClass("col s12 marginT")
                                      .append(
                                        HtmlButton.newBuilder()
                                          .setClass("btn waves-effect waves-light greenie")
                                          .setType("submit")
                                          .setContent("AVANTI")
                                      )
                                  )
                                  .append(
                                    HtmlDiv.newBuilder()
                                      .setClass("col s12")
                                      .append(
                                        HtmlAnchor.newBuilder()
                                          .setClass("waves-effect waves-light btn white brownie skipPAD")
                                          .setContent("SALTA")
                                          .setHref("nextTask.jsp")
                                      )
                                  )
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
          )
      ).build();
  }

  public static void main(String[] args) {
    $.get(LOGIN_CHECK, (Object result, String a, JQueryXHR ctx) -> {
      String isLoggedIn = result.toString();
      if (isLoggedIn.equals("false")) {
        window.location.replace("login.html");
      }
      return null;
    });
    $.getJSON(REST_URL, "task=WORD_ANNOTATION", (Object result, String a, JQueryXHR ctx) -> {
      JSON json = (JSON) result;
      String description = json.$get("description");
      HTMLElement page = WordAnnotation.page(description);
      $("body").append(page);
      return null;
    });
  }
}
