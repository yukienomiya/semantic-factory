import static def.jquery.Globals.$;

import java.util.ArrayList;

import static def.dom.Globals.document;

import def.dom.Event;
import def.dom.HTMLElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLSelectElement;
import def.dom.MouseEvent;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlH3;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlH6;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlP;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect;
import it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan;

/**
 * Represents the Signup HTML page.
 */
public class Signup {

  /**
   * Represents the url of the SignupServlet.
   */
  public static final String SERVLET_URL = "signup.jsp";

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
          .setClass("col s12 red lighten-2 navb valign-wrapper")
          .append(
            HtmlImg.newBuilder()
              .setClass("imgS")
              .setSrc("images/FSp.svg")
          )
      )
      .append(
        HtmlDiv.newBuilder()
          .setClass("container")
          .append(
            HtmlH3.newBuilder()
              .setClass("text-align: left")
              .setContent("Iscriviti!")
          )
          .append(
            HtmlDiv.newBuilder()
              .setClass("full-height")
              .append(
                HtmlForm.newBuilder()
                  .setClass("register-form")
                  .setMethod("POST")
                  .setAction(SERVLET_URL)
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("row top-margin")
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
                                  .setId("password")
                                  .setRequired(true)
                                  .setPlaceholder("Password *")
                                  .setOninput(Signup::pswValidity)
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
                                  .setId("password2")
                                  .setRequired(true)
                                  .setPlaceholder("Confermare la password *")
                                  .setOninput(Signup::pswValidity)
                              )
                          )
                      )
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("row top-margin")
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("row")
                          .append(
                            HtmlH6.newBuilder()
                              .setContent("Indicare le proprie lingue native: *")
                          )
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("row no-bottom-margin")
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("col s12")
                                  .append(
                                    HtmlP.newBuilder()
                                      .append(
                                        HtmlLabel.newBuilder()
                                          .append(
                                            HtmlInput.newBuilder()
                                              .setId("cbNat0")
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
                              )
                          )
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("row no-bottom-margin")
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("col s12")
                                  .append(
                                    HtmlP.newBuilder()
                                      .append(
                                        HtmlLabel.newBuilder()
                                          .append(
                                            HtmlInput.newBuilder()
                                              .setId("cbNat1")
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
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("row")
                          .append(
                            HtmlH6.newBuilder()
                              .setContent("Indicare altre lingue parlate e il relativo livello CEFR:")
                          )
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("row valign-wrapper no-bottom-margin")
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("col s6")
                                  .append(
                                    HtmlP.newBuilder()
                                      .append(
                                        HtmlLabel.newBuilder()
                                          .append(
                                            HtmlInput.newBuilder()
                                              .setId("cbItalianOther")
                                              .setName("cbItalianOther")
                                              .setValue("Italiano")
                                              .setType("checkbox")
                                              .setOnClick(Signup::activateSelectIT)
                                          )
                                          .append(
                                            HtmlSpan.newBuilder()
                                              .setContent("ITALIANO")
                                          )
                                      )
                                  )
                              )
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("input-field col s6")
                                  .append(
                                    HtmlSelect.newBuilder()
                                      .setClass("browser-default")
                                      .setId("livIT")
                                      .setName("livIT")
                                      .setDisabled(true)
                                      .append(
                                        HtmlOption.newBuilder()
                                          .setContent("Livello")
                                          .setValue("")
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
                              .setClass("row valign-wrapper no-bottom-margin")
                              .append(
                                HtmlDiv.newBuilder()
                                  .setClass("col s6")
                                  .append(
                                    HtmlP.newBuilder()
                                      .append(
                                        HtmlLabel.newBuilder()
                                          .append(
                                            HtmlInput.newBuilder()
                                              .setId("cbEnglishOther")
                                              .setName("cbEnglishOther")
                                              .setValue("English")
                                              .setType("checkbox")
                                              .setOnClick(Signup::activateSelectEN)
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
                                  .setClass("input-field col s6")
                                  .append(
                                    HtmlSelect.newBuilder()
                                      .setClass("browser-default")
                                      .setId("livEN")
                                      .setName("livEN")
                                      .setDisabled(true)
                                      .append(
                                        HtmlOption.newBuilder()
                                          .setContent("Livello")
                                          .setValue("")
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
                  )
                  .append(
                    HtmlDiv.newBuilder()
                      .setClass("row center-align top-margin")
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("row no-bottom-margin")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("input-field col s12 no-bottom-margin")
                              .append(
                                HtmlButton.newBuilder()
                                  .setType("submit")
                                  .setClass("waves-effect waves-light btn-small greenie")
                                  .setContent("AVANTI")
                                  .setOnClick(Signup::fieldsCheck)
                              )
                          )
                      )
                      .append(
                        HtmlDiv.newBuilder()
                          .setClass("row no-bottom-margin")
                          .append(
                            HtmlDiv.newBuilder()
                              .setClass("input-field col s12")
                              .append(
                                HtmlAnchor.newBuilder()
                                  .setClass("brownie")
                                  .setContent("Login")
                                  .setHref(LOGIN_URL)
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
   * @param m     [Represents the MouseEvents that triggers the function]
   */
  public static Object fieldsCheck(MouseEvent m) {
    ArrayList<HTMLInputElement> cbNativeLang = new ArrayList<>();
    for (int i = 0; i < 2; i++) {
      cbNativeLang.add((HTMLInputElement) document.getElementById("cbNat" + i));
      cbNativeLang.get(i).required = true;
    }
    for (HTMLInputElement cbNat : cbNativeLang) {
      if (!cbNat.checked) {
        continue;
      }
      for (HTMLInputElement cbN : cbNativeLang) {
        cbN.required = false;
      }
      break;
    }
    return null;
  }

  /**
   * Activates the Select element (and sets it to required) if the relative checkbox is checked.
   * @param m [Represents the MouseEvent that triggers the function]
   */
  public static Object activateSelectIT(MouseEvent m) {
    HTMLInputElement cbItalianOther = (HTMLInputElement) document.getElementById("cbItalianOther");
    HTMLSelectElement livIT = (HTMLSelectElement) document.getElementById("livIT");
    livIT.disabled = true;
    livIT.required = false;

    if (cbItalianOther.checked) {
      livIT.disabled = false;
      livIT.required = true;
    } else {
      livIT.disabled = true;
      livIT.required = false;
    }
    return null;
  }

  /**
   * Activates the Select element (and sets it to required) if the relative checkbox is checked.
   * @param m [Represents the MouseEvent that triggers the function]
   */
  public static Object activateSelectEN(MouseEvent m) {
    HTMLInputElement cbEnglishOther = (HTMLInputElement) document.getElementById("cbEnglishOther");
    HTMLSelectElement livEN = (HTMLSelectElement) document.getElementById("livEN");
    livEN.required = false;

    if (cbEnglishOther.checked) {
      livEN.disabled = false;
      livEN.required = true;
    } else {
      livEN.disabled = true;
      livEN.required = false;
    }
    return null;
  }

  /**
   * Checkes if the password and its confirmation are equals.
   * @param e [Represents the Event that triggers the function]
   */
  public static Object pswValidity(Event e) {
    Object pswValue = $("#password").val();
    Object psw2Value = $("#password2").val();

    if (!pswValue.equals(psw2Value)) {
      $("#password2").removeClass("valid").addClass("invalid");
    } else {
      $("#password2").removeClass("invalid").addClass("valid");
    }
    return null;
  }

  public static void main(String[] args) {
    $.ajax("/FabbricaSemantica/logout.jsp");
    document.addEventListener("DOMContentLoaded", (x) -> {
      document.dispatchEvent(new Event("PageLoaded"));
    });
    HTMLElement page = Signup.page();
    $("body").append(page);
  }
}
