import static def.jquery.Globals.$;
import static def.dom.Globals.window;

import def.jquery.JQueryXHR;
import def.dom.HTMLElement;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg;

public class Home {
  //public static final String SERVLET_URL = "login.jsp"; serve la servlet per la home?
  public static final String LOGOUT_URL = "logout.jsp";
  public static final String TASK_URL = "home.jsp";
  public static final String LOGIN_CHECK = "isLoggedIn.jsp";  

  public static HTMLElement page() {
    return HtmlDiv.newBuilder()
      .append(
        HtmlDiv.newBuilder()
          .setClass("row red lighten-2 navb valign-wrapper")
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
              .setClass("full-height valign-wrapper")
              .append(
                HtmlDiv.newBuilder()
                  .setClass("row")
                  .append(
                    HtmlForm.newBuilder()
                      .setClass("center-align")
                      .setMethod("POST")
                      .setAction(TASK_URL)
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
        window.location.replace("login.html");
      }
      return null;
    });
  }
}