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
 * Represents the MyAnnotation task HTML page.
 */
public class MyAnnotation {

  /**
   * Represents the url of the Home page.
   */
  public static final String HOME_URL = "home.html";

  /**
   * Represents the url of the LogoutServlet.
   */
  public static final String LOGOUT_URL = "logout.jsp";

  /**
   * Represents the path of the logo.
   */
  public static final String LOGO = "images/FS.svg";
  
  /**
   * Represents the url of the NewExampleServiceServlet.
   */
  public static final String REST_URL = "nextExample.jsp";

  /**
   * Represents the url of the MyAnnotationServlet.
   */
  public static final String TASK_URL = "myAnnotation.jsp";

  /**
   * Represents the url of the AuthenticationServiceServlet.
   */
  public static final String LOGIN_CHECK = "isLoggedIn.jsp";

  /**
   * Represents the url of the NextTaskServlet.
   */
  public static final String NEXT_TASK = "nextTask.jsp";

  /**
   * Represents the url of the Login page.
   */
  public static final String LOGIN_URL = "login.html";

  /**
   * Constructs the HTML page.
   * 
   * @param word    [Represents the word of the task]
   * @param example [Represents the example of the task]
   * @param words [Represents the senses of the task]
   */
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
                  .setSrc(LOGO)
              )
          )
          .append(
            HtmlDiv.newBuilder()
              .setClass("col s6 right-align")
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat brownie")
                  .setHref(HOME_URL)
                  .setContent("HOME")
              )
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat brownie")
                  .setHref(LOGOUT_URL)
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
                              .setAction(TASK_URL)
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
                                          .setHref(NEXT_TASK)
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

  /**
   * Checks that the user selected at least one checkbox.
   * @param m [Represents the MouseEvents that triggers the function]
   */
  public static Object fieldsCheck(MouseEvent m) {
    ArrayList<HTMLInputElement> cbWords = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      cbWords.add((HTMLInputElement) document.getElementById("word" + i));
      cbWords.get(i).required = true;
    }
    for (HTMLInputElement cbWord : cbWords) {
      if (!cbWord.checked) {
        continue;
      }
      for (HTMLInputElement cbW : cbWords) {
        cbW.required = false;
      }
      break;
    }
    return null;
  }

  public static void main(String[] args) {
    $.get(LOGIN_CHECK, (Object result, String a, JQueryXHR ctx) -> {
      String isLoggedIn = result.toString();
      if (isLoggedIn.equals("false")) {
        window.location.replace(LOGIN_URL);
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
