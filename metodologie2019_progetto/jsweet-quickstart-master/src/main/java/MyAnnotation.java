import static def.jquery.Globals.$;
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

public class MyAnnotation {
  public static final String REST_URL = "nextExample.jsp";
  public static final String LOGIN_CHECK = "isLoggedIn.jsp";


  public static HTMLElement page(String word, String example, String[] words) {
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
                              .setContent("Data la seguente parola e la frase di esempio, indovina il relativo sinonimo:")
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("col s12")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("card pink-card marginTB")
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
                                      .setContent("\"" + example + "\"")
                                  )
                              )
                          )
                          .append(
                            HtmlForm.newBuilder()
                              .setClass("col s12 marginT left-align")
                              .setMethod("POST")
                              .setAction("myAnnotation.jsp")
                              .append(
                                HtmlP.newBuilder()
                                  .append(
                                    HtmlLabel.newBuilder()
                                      .append(
                                        HtmlInput.newBuilder()
                                          .setType("checkbox")
                                          .setName("words")
                                          .setId("word0")
                                          .setValue(words[0])
                                      )
                                      .append(
                                        HtmlSpan.newBuilder()
                                          .setContent(words[0])
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
                                          .setName("words")
                                          .setId("word1")
                                          .setValue(words[1])
                                      )
                                      .append(
                                        HtmlSpan.newBuilder()
                                          .setContent(words[1])
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
                                          .setName("words")
                                          .setId("word2")
                                          .setValue(words[2])
                                      )
                                      .append(
                                        HtmlSpan.newBuilder()
                                          .setContent(words[2])
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
                                          .setName("words")
                                          .setId("word3")
                                          .setValue(words[3])
                                      )
                                      .append(
                                        HtmlSpan.newBuilder()
                                          .setContent(words[3])
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
                                          .setClass("btn waves-effect waves-light sub-btn greenie")
                                          .setType("submit")
                                          .setContent("AVANTI")
                                          .setOnClick(MyAnnotation::fieldsCheck)
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
                                  .setName("example")
                                  .setHidden(true)
                                  .setValue(example)
                              )
                          )
                      )
                  )
              )
          )
      ).build();
  }

  // TODO da migliorare
  public static Object fieldsCheck(MouseEvent m) {
    HTMLInputElement cbWord0 = (HTMLInputElement) document.getElementById("word0");
    HTMLInputElement cbWord1 = (HTMLInputElement) document.getElementById("word1");
    HTMLInputElement cbWord2 = (HTMLInputElement) document.getElementById("word2");
    HTMLInputElement cbWord3 = (HTMLInputElement) document.getElementById("word3");

    cbWord0.required = false;
    cbWord1.required = false;
    cbWord2.required = false;
    cbWord3.required = false;

    if (!cbWord0.checked && !cbWord1.checked && !cbWord2.checked && !cbWord3.checked) {
      cbWord0.required = true;
      cbWord1.required = true;
      cbWord2.required = true;
      cbWord3.required = true;
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
    $.getJSON(REST_URL, "task=MY_ANNOTATION", (Object result, String a, JQueryXHR ctx) -> {
      JSON json = (JSON) result;
      String word = json.$get("word");
      String example = json.$get("example");
      String[] words = json.$get("words");
      HTMLElement page = MyAnnotation.page(word, example, words);
      $("body").append(page);
      return null;
    });
  }
}
