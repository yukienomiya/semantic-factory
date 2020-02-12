import static def.jquery.Globals.$;

import java.util.ArrayList;

import static def.dom.Globals.window;
import static def.dom.Globals.document;


import def.dom.HTMLElement;
import def.dom.HTMLInputElement;
import def.dom.MouseEvent;
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
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan;

/**
 * Represents the TranslationValidation task HTML page.
 */
public class TranslationValidation {

  /**
   * Represents the url of the NewExampleServiceServlet.
   */
  public static final String REST_URL = "nextExample.jsp";

  /**
   * Represents the url of the AuthenticationServiceServlet.
   */
  public static final String LOGIN_CHECK = "isLoggedIn.jsp";

  /**
   * Constructs the HTML page.
   * @param word        [Represents the word of the task]
   * @param description [Represents the description of the task]
   * @param translations [Represents the translations of the task]
   */
  public static HTMLElement page(String word, String  description, String[] translations) {
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
                              .setContent("Data la seguente parola e la sua definizione, selezionare la traduzione corretta:")
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("col s12")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("card grey-card marginTB")
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
                                          .setId("translations0")
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
                                          .setId("translations1")
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
                                          .setId("translations2")
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
                                          .setId("translations3")
                                          .setValue(translations[3])
                                      )
                                      .append(
                                        HtmlSpan.newBuilder()
                                          .setContent(translations[3])
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
                                          .setClass("btn waves-effect waves-light greenie")
                                          .setType("submit")
                                          .setContent("AVANTI")
                                          .setOnClick(TranslationValidation::fieldsCheck)
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
          )
      ).build();
  }

  /**
   * Checks that the user selected at least one checkbox.
   * @param m [Represents the MouseEvents that triggers the function]
   */
  public static Object fieldsCheck(MouseEvent m) {
    ArrayList<HTMLInputElement> cbTranslations = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      cbTranslations.add((HTMLInputElement) document.getElementById("translations" + i));
      cbTranslations.get(i).required = true;
    }
    for (HTMLInputElement cbTransl : cbTranslations) {
      if (!cbTransl.checked) {
        continue;
      }
      for (HTMLInputElement cbT : cbTranslations) {
        cbT.required = false;
      }
      break;
    }
    return null;
  }

  public static void main(String[] args) {
    $.get(LOGIN_CHECK, (Object result, String a, JQueryXHR ctx) -> {
      String isLoggedIn = result.toString();
      if (isLoggedIn.equals("false")) {
        window.location.replace("login.html");
      }
      return null;
    });
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
