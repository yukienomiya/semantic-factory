import static def.dom.Globals.console;
import static def.dom.Globals.document;
import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFieldSetElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;
import jsweet.util.StringTypes;

public class login {

  public static final String SERVLET_URL = "login.jsp";
  public static final String SIGNUP_URL = "signup.html";

  public static void main(String[] args) {
    console.log("Creating form");
    HTMLFormElement form = document.createElement(StringTypes.form);
    form.action = SERVLET_URL;
    form.method = "POST";
    form.className = "pure-form pure-form-stacked";
    console.log("Form Done");

    HTMLFieldSetElement f = document.createElement(StringTypes.fieldset);

    console.log("creating mail label");
    HTMLLabelElement labelMail = document.createElement(StringTypes.label);
    labelMail.textContent = "Email:";
    console.log("creating pw label");
    HTMLLabelElement labelPw = document.createElement(StringTypes.label);
    labelPw.textContent = "Password:";

    console.log("creating email input");
    HTMLInputElement email = document.createElement(StringTypes.input);
    email.name = "email";
    email.type = "email";
    console.log("creating password input");
    HTMLInputElement password = document.createElement(StringTypes.input);
    password.name = "password";
    password.type = "password";

    HTMLInputElement loginButton = document.createElement(StringTypes.input);
    loginButton.type = "submit";
    loginButton.name = "loginButton_button";
    loginButton.value = "LOGIN";
    loginButton.className = "pure-button pure-button-primary";

    console.log("creating signup anchor element");
    HTMLAnchorElement signupButton = document.createElement(StringTypes.a);
    signupButton.href = SIGNUP_URL;
    signupButton.textContent = "SIGN UP";
    signupButton.className = "pure-button";
    console.log("creating signupButton label");


    HTMLDivElement divMail = document.createElement(StringTypes.div);
    $(labelMail).css("marginLeft", "5px");
    $(labelMail).css("fontWeight", "550");
    $(labelMail).css("fontSize", "x-large");
    $(labelMail).css("color", "rgba(64, 38, 94, 1)");
    $(email).css("width", "320px");
    $(email).css("height", "45px");
    $(email).css("marginLeft", "25px");
    $(email).css("fontWeight", "550");
    $(divMail).append(labelMail);
    $(divMail).append(email);

    HTMLDivElement divPw = document.createElement(StringTypes.div);
    $(labelPw).css("marginLeft", "5px");
    $(labelPw).css("fontWeight", "550");
    $(labelPw).css("fontSize", "x-large");
    $(labelPw).css("color", "rgba(64, 38, 94, 1)");
    $(password).css("width", "320px");
    $(password).css("height", "45px");
    $(password).css("marginLeft", "25px");
    $(password).css("fontWeight", "550");
    $(divPw).append(labelPw);
    $(divPw).append(password);

    HTMLDivElement divButton = document.createElement(StringTypes.div);
    $(loginButton).css("height", "30px");
    $(loginButton).css("width", "100px");
    $(loginButton).css("margin-left", "135px");
    $(loginButton).css("margin-top", "25px");
    $(loginButton).css("background-color", "rgba(64, 38, 94, 1)");
    $(divButton).append(loginButton);

    HTMLDivElement divLink = document.createElement(StringTypes.div);
    $(signupButton).css("backgroundColor", "rgb(255, 255, 255)");
    $(signupButton).css("sizes", "100px");
    $(signupButton).css("height", "30px");
    $(signupButton).css("width", "100px");
    $(signupButton).css("marginLeft", "135px");
    $(signupButton).css("marginTop", "5px");
    $(divLink).append(signupButton);

    HTMLDivElement divForm = document.createElement(StringTypes.div);

    $(form).css("width", "350px");
    $(form).css("height", "270px");

    console.log("adding to form");
    $(f).append(divMail);
    $(f).append(divPw);
    $(f).append(divButton);
    $(f).append(divLink);
    $(form).append(f);
    $(divForm).append(form);
    $(divForm).css("position", "fixed");
    $(divForm).css("top", "25%");
    $(divForm).css("left", "35%");
    console.log("adding to body");
    $("body").append(divForm);
  }
}
