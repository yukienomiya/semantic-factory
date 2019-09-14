import static def.dom.Globals.console;
import static def.dom.Globals.document;
import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
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
    console.log("Form Done");

    console.log("creating mail label");
    HTMLLabelElement labelMail = document.createElement(StringTypes.label);
    labelMail.className = "form-control-plaintext";
    labelMail.textContent = "Email:";
    console.log("creating pw label");
    HTMLLabelElement labelPw = document.createElement(StringTypes.label);
    labelPw.className = "form-control-plaintext";
    labelPw.textContent = "Password:";

    console.log("creating email input");
    HTMLInputElement email = document.createElement(StringTypes.input);
    email.name = "email";
    email.className =  "form-control";
    email.type = "email";
    console.log("creating password input");
    HTMLInputElement password = document.createElement(StringTypes.input);
    password.name = "password";
    password.className =  "form-control";
    password.type = "password";

    HTMLInputElement loginButton = document.createElement(StringTypes.input);
    loginButton.type = "submit";
    loginButton.name = "loginButton_button";
    loginButton.className =  "btn btn-primary";
    loginButton.value = "LOGIN";

    console.log("creating signup anchor element");
    HTMLAnchorElement signupButton = document.createElement(StringTypes.a);
    signupButton.className =  "btn btn-primary";
    signupButton.href = SIGNUP_URL;
    console.log("creating signupButton label");
    HTMLLabelElement labelSignUp = document.createElement(StringTypes.label);
    labelSignUp.textContent = "SIGN UP";


    HTMLDivElement divMail = document.createElement(StringTypes.div);
    divMail.className = "form-group";
    $(labelMail).css("marginLeft", "5px");
    $(labelMail).css("fontWeight", "600");
    $(labelMail).css("fontSize", "x-large");
    $(labelMail).css("color", "rgba(64, 38, 94, 1)");
    $(email).css("width", "320px");
    $(email).css("height", "45px");
    $(email).css("marginLeft", "25px");
    $(email).css("fontWeight", "500");
    $(divMail).append(labelMail);
    $(divMail).append(email);
    HTMLDivElement divPw = document.createElement(StringTypes.div);
    divPw.className = "form-group";
    $(labelPw).css("marginLeft", "5px");
    $(labelPw).css("fontWeight", "600");
    $(labelPw).css("fontSize", "x-large");
    $(labelPw).css("color", "rgba(64, 38, 94, 1)");
    $(password).css("width", "320px");
    $(password).css("height", "45px");
    $(password).css("marginLeft", "25px");
    $(password).css("fontWeight", "500");
    $(divPw).append(labelPw);
    $(divPw).append(password);

    HTMLDivElement divButton = document.createElement(StringTypes.div);
    divButton.className = "form-group submit-button";
    $(divButton).append(loginButton);
    HTMLDivElement divLink = document.createElement(StringTypes.div);
    divLink.className = "form-group";
    $(signupButton).css("backgroundColor", "rgb(255, 255, 255)");
    $(signupButton).css("sizes", "100px");
    $(signupButton).css("height", "30px");
    $(signupButton).css("width", "100px");
    $(signupButton).css("marginLeft", "135px");
    $(labelSignUp).css("marginTop", "-4px");
    $(labelSignUp).css("marginRight", "5px");
    $(labelSignUp).css("color", "rgba(64, 38, 94, 1)");
    $(signupButton).append(labelSignUp);
    $(divLink).append(signupButton);

    $(form).css("margin", "110px 500px 50px");

    console.log("adding to form");
    $(form).append(divMail);
    $(form).append(divPw);
    $(form).append(divButton);
    $(form).append(divLink);
    console.log("adding to body");
    $("body").append(form);
  }
}
