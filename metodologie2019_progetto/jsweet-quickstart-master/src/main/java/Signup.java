import static def.jquery.Globals.$;

import def.dom.HTMLElement;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlH3;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlH6;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan;

public class Signup {
  public static final String SERVLET_URL = "signup.jsp";
  public static final String LOGIN_URL = "login.html";

  public static HTMLElement page() {
    return HtmlDiv.newBuilder()
      .setClass("container")
      .append(
        HtmlH3.newBuilder()
          .setContent("Registrazione")
      )
      .append(
        HtmlDiv.newBuilder()
          .setClass("full-height row center-align")
          .append(
            HtmlForm.newBuilder()
              .setClass("register-form")
              .setMethod("POST")
              .setAction(SERVLET_URL)
              .append(
                HtmlDiv.newBuilder()
                  .setClass("row")
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("input-field col s12")
                      .append(
                        HtmlInput.newBuilder()
                          .setType("email")
                          .setName("email")
                          .setRequired(true)
                          .setClass("validate")
                          .setPlaceholder("Email *")
                      )
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("row")
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("input-field col s12")
                          .append(
                            HtmlInput.newBuilder()
                              .setType("password")
                              .setName("password")
                              .setRequired(true)
                              .setClass("validate")
                              .setPlaceholder("Password *")
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
                            HtmlInput.newBuilder()
                              .setType("password")
                              .setName("password2")
                              .setRequired(true)
                              .setClass("validate")
                              .setPlaceholder("Confermare la password *")
                          )
                      )
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("row") // ?
                      .append(
                        HtmlH6.newBuilder()
                          .setClass("left-align")
                          .setContent("Indicare le proprie lingue native: *")
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("row input-field col s12")
                          .append(
                            HtmlLabel.newBuilder()
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("cbNat")
                                  .setValue("Italiano")
                                  .setType("checkbox")
                              )
                              .append(
                                HtmlSpan.newBuilder()
                                  .setContent("ITALIANO")
                              )
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("row input-field col s12")
                          .append(
                            HtmlLabel.newBuilder()
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("cbNat")
                                  .setValue("English")
                                  .setType("checkbox")
                              )
                              .append(
                                HtmlSpan.newBuilder()
                                  .setContent("ENGLISH")
                              )
                          )
                      )
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("row")
                      .append(
                        HtmlH6.newBuilder()
                          .setClass("left-align")
                          .setContent("Indicare altre lingue parlate e il relativo livello CEFR:")
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("input-field col s6")
                          .append(
                            HtmlLabel.newBuilder()
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("cbItalianOther")
                                  .setValue("Italiano")
                                  .setType("checkbox")
                              )
                              .append(
                                HtmlSpan.newBuilder()
                                  .setContent("ITALIANO")
                              )
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("input-field col s2")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("row")
                              .append(
                                HtmlSelect.newBuilder()
                                  .setClass("browser-default")
                                  .setName("livIT")
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("Livello")
                                      .setDisabled(true)
                                      .setSelected(true)
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("A1")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("A2")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("B1")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("B2")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("C1")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("C2")
                                  )
                              )
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("input-field col s6")
                          .append(
                            HtmlLabel.newBuilder()
                              .append(
                                HtmlInput.newBuilder()
                                  .setName("cbEnglishOther")
                                  .setValue("English")
                                  .setType("checkbox")
                              )
                              .append(
                                HtmlSpan.newBuilder()
                                  .setContent("ENGLISH")
                              )
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("input-field col s2")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("row")
                              .append(
                                HtmlSelect.newBuilder()
                                  .setClass("browser-default")
                                  .setName("livEN")
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("Livello")
                                      .setDisabled(true)
                                      .setSelected(true)
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("A1")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("A2")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("B1")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("B2")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("C1")
                                  )
                                  .append(
                                    HtmlOption.newBuilder()
                                      .setContent("C2")
                                  )
                              )
                          )
                      )
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("input-field col s12")
                      .append(
                        HtmlButton.newBuilder()
                          .setType("submit")
                          .setClass("waves-effect waves-light btn-small red lighten-1")
                          .setContent("Sign Up")
                      )
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("input-field col s12")
                      .append(
                        HtmlAnchor.newBuilder()
                          .setContent("Login")
                          .setHref(LOGIN_URL)
                      )
                  )
              )
          )
      ).build();
  }

  public static void main(String[] args) {
    HTMLElement page = Signup.page();
    $("body").append(page);
  }
}
