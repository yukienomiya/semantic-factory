/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
class login {
    static main(args) {
        console.log("Creating form");
        let form = document.createElement("form");
        form.action = login.SERVLET_URL;
        form.method = "POST";
        form.className = "pure-form pure-form-stacked";
        console.log("Form Done");
        let f = document.createElement("fieldset");
        console.log("creating mail label");
        let labelMail = document.createElement("label");
        labelMail.textContent = "Email:";
        console.log("creating pw label");
        let labelPw = document.createElement("label");
        labelPw.textContent = "Password:";
        console.log("creating email input");
        let email = document.createElement("input");
        email.name = "email";
        email.type = "email";
        console.log("creating password input");
        let password = document.createElement("input");
        password.name = "password";
        password.type = "password";
        let loginButton = document.createElement("input");
        loginButton.type = "submit";
        loginButton.name = "loginButton_button";
        loginButton.value = "LOGIN";
        loginButton.className = "pure-button pure-button-primary";
        console.log("creating signup anchor element");
        let signupButton = document.createElement("a");
        signupButton.href = login.SIGNUP_URL;
        signupButton.textContent = "SIGN UP";
        signupButton.className = "pure-button";
        console.log("creating signupButton label");
        let divMail = document.createElement("div");
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
        let divPw = document.createElement("div");
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
        let divButton = document.createElement("div");
        $(loginButton).css("height", "30px");
        $(loginButton).css("width", "100px");
        $(loginButton).css("margin-left", "135px");
        $(loginButton).css("margin-top", "25px");
        $(loginButton).css("background-color", "rgba(64, 38, 94, 1)");
        $(divButton).append(loginButton);
        let divLink = document.createElement("div");
        $(signupButton).css("backgroundColor", "rgb(255, 255, 255)");
        $(signupButton).css("sizes", "100px");
        $(signupButton).css("height", "30px");
        $(signupButton).css("width", "100px");
        $(signupButton).css("marginLeft", "135px");
        $(signupButton).css("marginTop", "5px");
        $(divLink).append(signupButton);
        let divForm = document.createElement("div");
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
login.SERVLET_URL = "login.jsp";
login.SIGNUP_URL = "signup.html";
login["__class"] = "login";
login.main(null);
