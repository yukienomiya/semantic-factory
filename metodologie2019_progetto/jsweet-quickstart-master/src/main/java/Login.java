import static def.jquery.Globals.$;

import def.dom.HTMLElement;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlH1;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlI;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput;

/**
 * Represents the Login HTML page.
 */
public class Login {

  /**
   * Represents the path of the logo.
   */
  public static final String LOGO = "images/FSp.svg";

  /**
   * Represents the url of the LoginServlet.
   */
  public static final String SERVLET_URL = "login.jsp";

  /**
   * Represents the url of the Signup page.
   */
  public static final String SIGNUP_URL = "signup.html";

  /**
   * Constructs the HTML page.
   */
  public static HTMLElement page() {
    return HtmlDiv.newBuilder()
      .append(
        HtmlDiv.newBuilder()
          .setClass("col s12 red lighten-2 navb valign-wrapper")
          .append(
            HtmlImg.newBuilder()
              .setClass("imgS")
              .setSrc(LOGO)
          )
      )
      .append(
        HtmlDiv.newBuilder()
          .setClass("container")
          .append(
            HtmlDiv.newBuilder()
              .setClass("full-height center-align valign-wrapper")
              .append(
                HtmlDiv.newBuilder()
                  .setClass("row")
                  .append(
                    HtmlForm.newBuilder()
                      .setClass("col s12")
                      .setMethod("POST")
                      .setAction(SERVLET_URL)
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("row")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("col s12")
                              .append(
                                HtmlH1.newBuilder()
                                  .setContent("Login")
                                  .setClass("light-weight")
                              )
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("row")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("input-field col s12")
                              .append(
                                HtmlI.newBuilder()
                                  .setClass("material-icons prefix")
                                  .setContent("email")
                              )
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("email")
                                  .setType("email")
                                  .setClass("validate")
                                  .setPlaceholder("Email")
                              )
                          )
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("input-field col s12")
                              .append(
                                HtmlI.newBuilder()
                                  .setClass("material-icons prefix")
                                  .setContent("lock")
                              )
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("password")
                                  .setType("password")
                                  .setClass("validate")
                                  .setPlaceholder("Password")
                              )
                          )
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("input-field col s12 login-btn")
                              .append(
                                HtmlButton.newBuilder()
                                  .setType("submit")
                                  .setClass("waves-effect waves-light btn-small greenie")
                                  .setContent("Login")
                              )
                          )
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("input-field col s12 signup-btn")
                              .append(
                                HtmlAnchor.newBuilder()
                                  .setClass("brownie")
                                  .setContent("Signup")
                                  .setHref(SIGNUP_URL)
                              )
                          )
                      )
                  )
              )
          )
      ).build();
  }
  public static void main(String[] args) {
    $.ajax("/FabbricaSemantica/logout.jsp");
    HTMLElement page = Login.page();
    $("body").append(page);
  }
}
