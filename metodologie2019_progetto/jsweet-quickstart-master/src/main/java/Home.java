import static def.jquery.Globals.$;
import static def.dom.Globals.window;

import def.jquery.JQueryXHR;
import def.dom.HTMLElement;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg;

/**
 * Represents the Home HTML page.
 */
public class Home {

  /**
   * Represents the url of the LogoutServlet.
   */
  public static final String LOGOUT_URL = "logout.jsp";

  /**
   * Represents the path of the logo.
   */
  public static final String LOGO = "images/FS.svg";

  /**
   * Represents the url of the HomeServlet.
   */
  public static final String SERVLET_URL = "home.jsp";

  /**
   * Represents the url of the AuthenticationServiceServlet.
   */
  public static final String LOGIN_CHECK = "isLoggedIn.jsp";  

  /**
   * Represents the url of the Login page.
   */
  public static final String LOGIN_URL = "login.html";

  /**
   * Constructs the HTML page.
   */
  public static HTMLElement page() {
    return HtmlDiv.newBuilder()
      .append(
        HtmlDiv.newBuilder()
          .setClass("row navb lightBrown valign-wrapper")
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
              .setClass("full-height valign-wrapper")
              .append(
                HtmlDiv.newBuilder()
                  .setClass("row")
                  .append(
                    HtmlForm.newBuilder()
                      .setClass("center-align")
                      .setMethod("POST")
                      .setAction(SERVLET_URL)
                      .append(
                        HtmlButton.newBuilder()
                          .setClass("btn greenie waves-effect waves-light btn-large startbtn-font")
                          .setType("submit")
                          .setContent("INIZIA")
                      )
                  )
              )
          )
      ).build();
  }
  
  
  public static void main(String[] args) {
    $.get(LOGIN_CHECK, (Object result, String a, JQueryXHR ctx) -> {
      String isLoggedIn = result.toString();
      if (isLoggedIn.equals("true")) {
        HTMLElement page = Home.page();
        $("body").append(page);
      } else {
        window.location.replace(LOGIN_URL);
      }
      return null;
    });
  }
}