import static def.jquery.Globals.$;

import def.jquery.JQueryAjaxSettings;
import def.jquery.JQueryXHR;
import def.dom.HTMLElement;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;

public class Home {
  //public static final String SERVLET_URL = "login.jsp"; serve la servlet per la home?
  public static final String LOGOUT_URL = "logout.jsp";
  public static final String TASK_URL = "home.jsp";

  public static HTMLElement page() {
    return HtmlDiv.newBuilder()
      .setClass("container")
      .append(
        HtmlDiv.newBuilder()
          .setClass("valign-wrapper row top-margin black-text")
          .append(
            HtmlDiv.newBuilder()
              .setClass("col s12 left-align")
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat")
                  .setHref("logout.jsp")
                  .setContent("logout")
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
          )
      ).build();
  }
  public static void main(String[] args) {
    HTMLElement page = Home.page();
    $("body").append(page);
  }
}
