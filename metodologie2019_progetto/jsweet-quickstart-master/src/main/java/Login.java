import static def.jquery.Globals.$;

import def.dom.HTMLElement;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlH1;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlI;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput;

public class Login {
  public static final String SERVLET_URL = "login.jsp";
  public static final String SIGNUP_URL = "signup.html";

  // Metodo che costruisce la pagina, usando i builder sembra più simile ad HTML
  public static HTMLElement page() {
    return HtmlDiv.newBuilder()
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
                              .setClass("waves-effect waves-light btn-small red lighten-1")
                              .setContent("Login")
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("input-field col s12 signup-btn")
                          .append(
                            HtmlAnchor.newBuilder()
                              .setContent("Signup")
                              .setHref(SIGNUP_URL)
                          )
                      )
                  )
              )
          )
      ).build();
  }
  public static void main(String[] args) {
    HTMLElement page = Login.page();
    // TODO(yukienomiya): Use vanilla js instead of jquery.
    $("body").append(page);
  }
}
