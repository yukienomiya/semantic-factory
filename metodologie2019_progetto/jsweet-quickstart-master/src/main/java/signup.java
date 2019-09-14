import static def.dom.Globals.console;
import static def.dom.Globals.document;
import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;
import def.dom.HTMLOptionElement;
import def.dom.HTMLSelectElement;
import jsweet.util.StringTypes;

public class signup {
  public static final String SERVLET_URL = "signup.jsp";
  public static final String LOGIN_URL = "login.html";

  public static void main(String[] args) {
    console.log("Creating form");
    HTMLFormElement form = document.createElement(StringTypes.form);
    form.action = SERVLET_URL;
    form.method = "POST";
    console.log("Form Done");
    $(form).css("margin", "100px 350px 200px");

    // REGISTRAZIONE
    console.log("creating form title");
    HTMLLabelElement title = document.createElement(StringTypes.label);
    title.className = "form-plaintext";
    title.textContent = "REGISTRAZIONE";
    $(title).css("fontWeight", "500");
    $(title).css("fontSize", "x-large");
    $(title).css("color", "black");

    // Form fields
    console.log("creating email input");
    HTMLInputElement email = document.createElement(StringTypes.input);
    email.name = "email";
    email.required = true;
    email.className =  "form-control";
    email.type = "email";
    email.placeholder = "Email*";
    console.log("creating password input");
    HTMLInputElement password = document.createElement(StringTypes.input);
    password.name = "password";
    password.className =  "form-control";
    password.type = "password";
    password.placeholder = "Password*";
    password.required = true;
    HTMLInputElement password2 = document.createElement(StringTypes.input);
    password2.name = "password2";
    password2.className =  "form-control";
    password2.type = "password";
    password2.placeholder = "Ripeti password*";
    password2.required = true;

    // "Selezionare le proprie lingue native:"
    HTMLLabelElement labelLangNat = document.createElement(StringTypes.label);
    labelLangNat.className = "form-control-plaintext";
    labelLangNat.textContent = "Selezionare le proprie lingue native: *";
    $(labelLangNat).css("fontWeight", "500");

    // Checkbox IT + targhetta
    HTMLInputElement cbItalianNat = document.createElement(StringTypes.input);
    cbItalianNat.name = "cbNat";
    cbItalianNat.value = "Italiano";
    cbItalianNat.className = "form-control";
    cbItalianNat.type = "checkbox";
    $(cbItalianNat).css("height", "20");
    $(cbItalianNat).css("width", "20");
    $(cbItalianNat).css("position", "absolute");
    $(cbItalianNat).css("marginLeft", "15");
    $(cbItalianNat).css("marginTop", "15");

    HTMLLabelElement labelITNat = document.createElement(StringTypes.label);
    labelITNat.className = "form-control-plaintext";
    labelITNat.textContent = "ITALIANO";
    $(labelITNat).css("display", "inline-block");
    $(labelITNat).css("vertical-align", "top");
    $(labelITNat).css("marginLeft", "55px");
    $(labelITNat).css("marginTop", "5px");

    // Checkbox EN + targhetta
    HTMLInputElement cbEnglishNat = document.createElement(StringTypes.input);
    cbEnglishNat.name = "cbNat";
    cbEnglishNat.value = "English";
    cbEnglishNat.className = "form-control";
    cbEnglishNat.type = "checkbox";
    $(cbEnglishNat).css("height", "20");
    $(cbEnglishNat).css("width", "20");
    $(cbEnglishNat).css("position", "absolute");
    $(cbEnglishNat).css("marginLeft", "15");
    $(cbEnglishNat).css("marginTop", "15");

    HTMLLabelElement labelENNat = document.createElement(StringTypes.label);
    labelENNat.className = "form-control-plaintext";
    labelENNat.textContent = "ENGLISH";
    $(labelENNat).css("display", "inline-block");
    $(labelENNat).css("vertical-align", "top");
    $(labelENNat).css("marginLeft", "55px");
    $(labelENNat).css("marginTop", "5px");






    // "Selezionare altre lingue conosciute:"
    HTMLLabelElement labelLangOther = document.createElement(StringTypes.label);
    labelLangOther.className = "form-control-plaintext";
    labelLangOther.textContent = "Selezionare altre lingue conosciute:   (Opzionale)";
    $(labelLangOther).css("fontWeight", "500");

    // "Indicare anche il relativo livello CEFR di competenza."
    HTMLLabelElement labelLiv =  document.createElement(StringTypes.label);
    labelLiv.className = "form-control-plaintext";
    labelLiv.textContent = "Indicare anche il relativo livello CEFR di competenza.";
    $(labelLiv).css("fontSize", "small");
    $(labelLiv).css("fontWeight", "450");
    $(labelLiv).css("color", "rgba(71, 66, 77, 1)");
    $(labelLiv).css("marginLeft", "15");

    // TODO se la checkbox della lingua secondaria è selezionata, il livello diventa obbligatorio (onclick)
    // Checkbox IT + targhetta
    HTMLInputElement cbItalianOther = document.createElement(StringTypes.input);
    cbItalianOther.name = "cbItalianOther";
    cbItalianOther.value = "Italiano";
    cbItalianOther.className = "form-control";
    cbItalianOther.type = "checkbox";
    $(cbItalianOther).css("height", "20");
    $(cbItalianOther).css("width", "20");
    $(cbItalianOther).css("position", "absolute");
    $(cbItalianOther).css("marginLeft", "15");
    $(cbItalianOther).css("marginTop", "15");

    HTMLLabelElement labelITOther = document.createElement(StringTypes.label);
    labelITOther.className = "form-control-plaintext";
    labelITOther.textContent = "ITALIANO";
    $(labelITOther).css("display", "inline-block");
    $(labelITOther).css("vertical-align", "top");
    $(labelITOther).css("marginLeft", "55px");
    $(labelITOther).css("marginTop", "5px");
    $(labelITOther).css("width", "100px");

    // Checkbox EN + targhetta
    HTMLInputElement cbEnglishOther = document.createElement(StringTypes.input);
    cbEnglishOther.name = "cbEnglishOther";
    cbEnglishOther.value = "English";
    cbEnglishOther.className = "form-control";
    cbEnglishOther.type = "checkbox";
    $(cbEnglishOther).css("height", "20");
    $(cbEnglishOther).css("width", "20");
    $(cbEnglishOther).css("position", "absolute");
    $(cbEnglishOther).css("marginLeft", "15");
    $(cbEnglishOther).css("marginTop", "15");

    HTMLLabelElement labelENOther = document.createElement(StringTypes.label);
    labelENOther.className = "form-control-plaintext";
    labelENOther.textContent = "ENGLISH";
    $(labelENOther).css("display", "inline-block");
    $(labelENOther).css("vertical-align", "top");
    $(labelENOther).css("marginLeft", "55px");
    $(labelENOther).css("marginTop", "5px");
    $(labelENOther).css("width", "100px");






    // 2 SELECT DELLE LINGUE OPZIONALI
    // TODO trovare un modo per farlo in modo medo lungo e obriobrioso
    HTMLSelectElement livIT = document.createElement(StringTypes.select);
    livIT.className = "form-control";
    livIT.name = "livIT";
    HTMLOptionElement a1 = document.createElement(StringTypes.option);
    a1.text = "A1";
    a1.value = "A1";
    HTMLOptionElement a2 = document.createElement(StringTypes.option);
    a2.text = "A2";
    a2.value = "A2";
    HTMLOptionElement b1 = document.createElement(StringTypes.option);
    b1.text = "B1";
    b1.value = "B1";
    HTMLOptionElement b2 = document.createElement(StringTypes.option);
    b2.text = "B2";
    b2.value = "B2";
    HTMLOptionElement c1 = document.createElement(StringTypes.option);
    c1.text = "C1";
    c1.value = "C1";
    HTMLOptionElement c2 = document.createElement(StringTypes.option);
    c2.text = "C2";
    c2.value = "C2";
    HTMLOptionElement ph = document.createElement(StringTypes.option);
    ph.text = "Livello";
    ph.disabled = true;
    ph.selected = true;
    ph.hidden = true;
    livIT.add(ph);
    livIT.add(a1);
    livIT.add(a2);
    livIT.add(b1);
    livIT.add(b2);
    livIT.add(c1);
    livIT.add(c2);
    $(livIT).css("padding-bottom", "0");
    $(livIT).css("width", "100");
    $(livIT).css("height", "30");
    $(livIT).css("display", "inline-block");
    $(livIT).css("vertical-align", "top");
    $(livIT).css("marginTop", "7");
    $(livIT).css("marginLeft", "10");



    HTMLSelectElement livEN = document.createElement(StringTypes.select);
    livEN.className = "form-control";
    livEN.name = "livEN";
    HTMLOptionElement a12 = document.createElement(StringTypes.option);
    a12.text = "A1";
    a12.value = "A1";
    HTMLOptionElement a22 = document.createElement(StringTypes.option);
    a22.text = "A2";
    a22.value = "A2";
    HTMLOptionElement b12 = document.createElement(StringTypes.option);
    b12.text = "B1";
    b12.value = "B1";
    HTMLOptionElement b22 = document.createElement(StringTypes.option);
    b22.text = "B2";
    b22.value = "B2";
    HTMLOptionElement c12 = document.createElement(StringTypes.option);
    c12.text = "C1";
    c12.value = "C1";
    HTMLOptionElement c22 = document.createElement(StringTypes.option);
    c22.text = "C2";
    c22.value = "C2";
    HTMLOptionElement ph2 = document.createElement(StringTypes.option);
    ph2.text = "Livello";
    ph2.value = "";
    ph2.disabled = true;
    ph2.selected = true;
    ph2.hidden = true;
    livEN.add(ph2);
    livEN.add(a12);
    livEN.add(a22);
    livEN.add(b12);
    livEN.add(b22);
    livEN.add(c12);
    livEN.add(c22);

    $(livEN).css("padding-bottom", "0");
    $(livEN).css("width", "100");
    $(livEN).css("height", "30");
    $(livEN).css("display", "inline-block");
    $(livEN).css("vertical-align", "top");
    $(livEN).css("marginTop", "7");
    $(livEN).css("marginLeft", "10");

    //document.getElementById("cbItOther").addEventListener("click", enableSelect());



    // BOTTONI
    console.log("creating signup submit element");
    HTMLInputElement signupButton = document.createElement(StringTypes.input);
    signupButton.className = "btn btn-primary";
    signupButton.type = "submit";
    signupButton.name = "signupButton_button";
    signupButton.value = "SIGN UP";
    console.log("creating login anchor element");

    // da migliorare
    signupButton.onclick = (x) -> { // :checked
      cbItalianNat.required = false;
      cbEnglishNat.required = false;
      livIT.required = false;
      livEN.required = false;
      if (!cbItalianNat.checked && !cbEnglishNat.checked) {
        cbItalianNat.required = true;
        cbEnglishNat.required = true;
      }
      if (cbItalianOther.checked) { // non funge
        livIT.required = true;
      }
      if (cbEnglishOther.checked) { // non funge
        livEN.required = true;
      }
      return null;
    };

    HTMLAnchorElement loginButton = document.createElement(StringTypes.a);
    loginButton.className =  "btn btn-primary";
    loginButton.href = LOGIN_URL;
    console.log("creating loginButton label");
    HTMLLabelElement labelLogin = document.createElement(StringTypes.label);
    labelLogin.textContent = "LOGIN";




    // DIVs
    HTMLDivElement divMail = document.createElement(StringTypes.div);
    divMail.className = "form-group";
    $(divMail).append(email);
    HTMLDivElement divPw = document.createElement(StringTypes.div);
    divPw.className = "form-group";
    $(divPw).append(password);
    HTMLDivElement divPw2 = document.createElement(StringTypes.div);
    divPw2.className = "form-group";
    $(divPw2).append(password2);
    HTMLDivElement divFields = document.createElement(StringTypes.div);
    divFields.className = "form-group";
    $(divFields).append(divMail);
    $(divFields).append(divPw);
    $(divFields).append(divPw2);
    $(divFields).css("marginTop", "30px");

    HTMLDivElement divLangNat = document.createElement(StringTypes.div);
    divLangNat.className = "form-group";
    $(divLangNat).append(labelLangNat);
    $(divLangNat).append(cbItalianNat);
    $(divLangNat).append(labelITNat);
    $(divLangNat).append(cbEnglishNat);
    $(divLangNat).append(labelENNat);
    $(divLangNat).css("marginTop", "50px");

    HTMLDivElement divLangOtherIT = document.createElement(StringTypes.div);
    divLangOtherIT.className = "form-group";
    $(divLangOtherIT).append(cbItalianOther);
    $(divLangOtherIT).append(labelITOther);
    $(divLangOtherIT).append(livIT);
    HTMLDivElement divLangOtherEN = document.createElement(StringTypes.div);
    divLangOtherEN.className = "form-group";
    $(divLangOtherEN).css("marginTop", "-15");
    $(divLangOtherEN).append(cbEnglishOther);
    $(divLangOtherEN).append(labelENOther);
    $(divLangOtherEN).append(livEN);
    HTMLDivElement divLangOther = document.createElement(StringTypes.div);
    divLangOther.className = "form-group";
    $(divLangOther).append(labelLangOther);
    $(divLangOther).append(labelLiv);
    $(divLangOther).append(divLangOtherIT);
    $(divLangOther).append(divLangOtherEN);
    $(divLangOther).css("marginTop", "50px");

    HTMLDivElement divButton = document.createElement(StringTypes.div);
    divButton.className = "form-group";
    $(signupButton).css("height", "30px");
    $(signupButton).css("width", "100px");
    $(signupButton).css("marginLeft", "500px");
    $(signupButton).css("marginTop", "25px");
    $(signupButton).css("backgroundColor", "rgba(64, 38, 94, 1)");
    $(signupButton).css("color", "white");
    $(signupButton).css("marginTop", "100");
    $(divButton).append(signupButton);

    HTMLDivElement divLink = document.createElement(StringTypes.div);
    divLink.className = "form-group";
    $(loginButton).css("backgroundColor", "rgb(255, 255, 255)");
    $(loginButton).css("sizes", "100px");
    $(loginButton).css("height", "30px");
    $(loginButton).css("width", "100px");
    $(loginButton).css("marginLeft", "500px");
    $(labelLogin).css("marginTop", "-4px");
    $(labelLogin).css("marginRight", "5px");
    $(labelLogin).css("color", "rgba(64, 38, 94, 1)");
    $(loginButton).append(labelLogin);
    $(divLink).append(loginButton);


    $(form).append(title);
    $(form).append(divFields);
    $(form).append(divLangNat);
    $(form).append(divLangOther);
    $(form).append(divButton);
    $(form).append(divLink);

    $("body").append(form);
  }


  // FUNZIONI

/*
  // makes sure at least one of the checkboxes is selected
   public void cbEnClick() {
    if (cbEnglishNat.checked) {

    }
  }
*/
}
