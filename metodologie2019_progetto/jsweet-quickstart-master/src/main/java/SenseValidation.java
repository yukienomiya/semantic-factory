import static def.jquery.Globals.$;

import def.dom.HTMLElement;
import def.jquery.JQueryXHR;
import def.js.JSON;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlP;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan;

public class SenseValidation {
  public static final String REST_URL = "nextExample.jsp";


  public static HTMLElement page(String word, String  example, String sense) {
    return HtmlDiv.newBuilder()
      .setClass("container")
      .append(
        HtmlDiv.newBuilder()
          .setClass("valign-wrapper row top-margin black-text")
          .append(
            HtmlDiv.newBuilder()
              .setClass("col s6 left-align")
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat")
                  .setHref("logout.jsp")
                  .setContent("logout")
              )
          )
          .append(
            HtmlDiv.newBuilder()
              .setClass("col s6 right-align")
              .append(
                HtmlAnchor.newBuilder()
                  .setClass("waves-effect btn-flat")
                  .setHref("home.html")
                  .setContent("HOME")
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
                HtmlDiv.newBuilder()
                  .setClass("valign-wrapper center-align")
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("col s6 card white distR")
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("card-content")
                          .append(
                            HtmlLabel.newBuilder()
                              .setClass("card-title word-color")
                              .setContent(word.toUpperCase())
                          )
                          .append(
                            HtmlLabel.newBuilder()
                              .setContent(example)
                          )
                      )
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .append(
                        HtmlLabel.newBuilder()
                          .setContent(sense)
                      )
                  )
                  .append(
                    HtmlForm.newBuilder()
                      .setClass("col s6")
                      .setMethod("POST")
                      .setAction("senseValidation.jsp")
                      .append(
                        HtmlP.newBuilder()
                          .append(
                            HtmlLabel.newBuilder()
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("answer")
                                  .setType("radio")
                              )
                              .append(
                                HtmlSpan.newBuilder()
                                  .setContent("Si")
                              )
                          )
                      )
                      .append(
                        HtmlP.newBuilder()
                          .append(
                            HtmlLabel.newBuilder()
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("answer")
                                  .setType("radio")
                              )
                              .append(
                                HtmlSpan.newBuilder()
                                  .setContent("No")
                              )
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("btn-marginB")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("right-align")
                              .append(
                                HtmlButton.newBuilder()
                                  .setClass("btn sub-btn waves-effect waves-light")
                                  .setType("submit")
                                  .setContent("AVANTI")
                              )
                          )
                      )
                  )
              )
          )
      )
      .append(
        HtmlDiv.newBuilder()
          .setClass("btn-marginR")
          .append(
            HtmlDiv.newBuilder()
              .setClass("right-align")
              .append(
              HtmlAnchor.newBuilder()
                .setClass("waves-effect btn-flat")
                .setContent("SALTA")
                .setHref("nextTask.jsp")
              )
          )
      ).build();
  }


  public static void main(String[] args) {
    $.getJSON(REST_URL, "task=SENSE_VALIDATION", (Object result, String a, JQueryXHR ctx) -> {
      JSON json = (JSON) result;
      String word = json.$get("word");
      String example = json.$get("example");
      String sense = json.$get("sense");
      HTMLElement page = SenseValidation.page(word, example, sense);
      $("body").append(page);
      return null;
    });
  }
}
