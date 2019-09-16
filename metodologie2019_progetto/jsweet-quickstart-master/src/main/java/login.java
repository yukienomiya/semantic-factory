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

public class Login {

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
    $(divMail).append(labelMail);
    $(divMail).append(email);

    HTMLDivElement divPw = document.createElement(StringTypes.div);
    $(divPw).append(labelPw);
    $(divPw).append(password);

    HTMLDivElement divButton = document.createElement(StringTypes.div);
    $(divButton).append(loginButton);

    HTMLDivElement divLink = document.createElement(StringTypes.div);
    $(divLink).append(signupButton);

    HTMLDivElement divForm = document.createElement(StringTypes.div);


    console.log("adding to form");
    $(f).append(divMail);
    $(f).append(divPw);
    $(f).append(divButton);
    $(f).append(divLink);
    $(form).append(f);
    $(divForm).append(form);
    console.log("adding to body");
    $("body").append(divForm);
  }
}
