import static def.jquery.Globals.$;

import def.dom.HTMLElement;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;

public class Home {
  //public static final String SERVLET_URL = "login.jsp"; serve la servlet per la home?
  public static final String LOGOUT_URL = "logout.jsp";
  public static String TASK_URL = "translationAnnotation.html";

  public static HTMLElement page() {
    return HtmlDiv.newBuilder()
      .setClass("container valign-wrapper")
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
                .setClass("btn red lighten-1 waves-effect waves-light btn-large startbtn-font")
                .setType("submit")
                .setContent("START")
              )
          )
          .append(
            HtmlDiv.newBuilder()
              .setClass("center-align logout-btn")
              .append(
                HtmlAnchor.newBuilder()
                  .setContent("Logout")
                  .setHref(LOGOUT_URL)
              )
          )
      ).build();
  }
  public static void main(String[] args) {
    HTMLElement page = Home.page();
    $("body").append(page);
  }
}
