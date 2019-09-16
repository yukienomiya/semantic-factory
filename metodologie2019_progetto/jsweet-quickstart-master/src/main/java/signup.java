import static def.dom.Globals.console;
import static def.dom.Globals.document;
import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFieldSetElement;
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
    form.className = "pure-form pure-form-aligned";
    console.log("Form Done");
    $(form).css("margin", "100px 350px 200px");

    HTMLFieldSetElement f = document.createElement(StringTypes.fieldset);

    // REGISTRAZIONE
    console.log("creating form title");
    HTMLLabelElement title = document.createElement(StringTypes.label);
    title.textContent = "REGISTRAZIONE";
    $(title).css("fontWeight", "500");
    $(title).css("fontSize", "x-large");
    $(title).css("color", "black");

    // Form fields
    console.log("creating email input");
    HTMLInputElement email = document.createElement(StringTypes.input);
    email.className = "pure-input-1";
    email.name = "email";
    email.required = true;
    email.type = "email";
    email.placeholder = "Email*";
    console.log("creating password input");
    HTMLInputElement password = document.createElement(StringTypes.input);
    password.className = "pure-input-1";
    password.name = "password";
    password.type = "password";
    password.placeholder = "Password*";
    password.required = true;
    HTMLInputElement password2 = document.createElement(StringTypes.input);
    password2.className = "pure-input-1";
    password2.name = "password2";
    password2.type = "password";
    password2.placeholder = "Ripeti password*";
    password2.required = true;






    // "Selezionare le proprie lingue native:"
    HTMLLabelElement labelLangNat = document.createElement(StringTypes.label);
    labelLangNat.textContent = "Selezionare le proprie lingue native: *";
    $(labelLangNat).css("fontWeight", "500");

    // Checkbox IT + targhetta
    HTMLInputElement cbItalianNat = document.createElement(StringTypes.input);
    cbItalianNat.name = "cbNat";
    cbItalianNat.value = "Italiano";
    cbItalianNat.type = "checkbox";
    $(cbItalianNat).css("height", "20");
    $(cbItalianNat).css("width", "20");

    HTMLLabelElement labelITNat = document.createElement(StringTypes.label);
    labelITNat.className = "pure-checkbox";
    labelITNat.textContent = "ITALIANO";
    $(labelITNat).css("display", "inline-block");
    $(labelITNat).css("marginLeft", "10");

    // Checkbox EN + targhetta
    HTMLInputElement cbEnglishNat = document.createElement(StringTypes.input);
    cbEnglishNat.name = "cbNat";
    cbEnglishNat.value = "English";
    cbEnglishNat.type = "checkbox";
    $(cbEnglishNat).css("height", "20");
    $(cbEnglishNat).css("width", "20");

    HTMLLabelElement labelENNat = document.createElement(StringTypes.label);
    labelENNat.className = "pure-checkbox";
    labelENNat.textContent = "ENGLISH";
    $(labelENNat).css("display", "inline-block");
    $(labelENNat).css("marginLeft", "10");






    // "Selezionare altre lingue conosciute:"
    HTMLLabelElement labelLangOther = document.createElement(StringTypes.label);
    labelLangOther.textContent = "Selezionare altre lingue conosciute:   (Opzionale)";
    $(labelLangOther).css("fontWeight", "500");

    // "Indicare anche il relativo livello CEFR di competenza."
    HTMLLabelElement labelLiv =  document.createElement(StringTypes.label);
    labelLiv.className = "pure-form-message";
    labelLiv.textContent = "Indicare anche il relativo livello CEFR di competenza.";
    $(labelLiv).css("fontSize", "small");
    $(labelLiv).css("fontWeight", "450");
    $(labelLiv).css("color", "rgba(71, 66, 77, 1)");

    // TODO se la checkbox della lingua secondaria è selezionata, il livello diventa obbligatorio (onclick)
    // Checkbox IT + targhetta
    HTMLInputElement cbItalianOther = document.createElement(StringTypes.input);
    cbItalianOther.name = "cbItalianOther";
    cbItalianOther.value = "Italiano";
    cbItalianOther.type = "checkbox";
    $(cbItalianOther).css("height", "20");
    $(cbItalianOther).css("width", "20");

    HTMLLabelElement labelITOther = document.createElement(StringTypes.label);
    labelITOther.className = "pure-checkbox";
    labelITOther.textContent = "ITALIANO";
    $(labelITOther).css("display", "inline-block");
    $(labelITOther).css("marginLeft", "10");

    // Checkbox EN + targhetta
    HTMLInputElement cbEnglishOther = document.createElement(StringTypes.input);
    cbEnglishOther.name = "cbEnglishOther";
    cbEnglishOther.value = "English";
    cbEnglishOther.type = "checkbox";
    $(cbEnglishOther).css("height", "20");
    $(cbEnglishOther).css("width", "20");

    HTMLLabelElement labelENOther = document.createElement(StringTypes.label);
    labelENOther.className = "pure-checkbox";
    labelENOther.textContent = "ENGLISH";
    $(labelENOther).css("display", "inline-block");
    $(labelENOther).css("marginLeft", "10");







    // 2 SELECT DELLE LINGUE OPZIONALI
    // TODO trovare un modo per farlo in modo medo lungo e obriobrioso
    HTMLSelectElement livIT = document.createElement(StringTypes.select);
    livIT.name = "livIT";
    $(livIT).css("display", "inline-block");
    $(livIT).css("marginLeft", "15");
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
    ph.value = "";
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



    HTMLSelectElement livEN = document.createElement(StringTypes.select);
    livEN.name = "livEN";
    $(livEN).css("display", "inline-block");
    $(livEN).css("marginLeft", "17");
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



    // BOTTONI
    console.log("creating signup submit element");
    HTMLInputElement signupButton = document.createElement(StringTypes.input);
    signupButton.className = "pure-button pure-button-primary";
    signupButton.type = "submit";
    signupButton.name = "signupButton_button";
    signupButton.value = "SIGN UP";
    console.log("creating login anchor element");

    // da migliorare
    // + controllo che se seleziono una lingua per la lingua nativa, non posso selezionarla come lingua aggiuntiva
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
      if (cbEnglishOther.checked) {
        livEN.required = true;
      }
      return null;
    };

    HTMLAnchorElement loginButton = document.createElement(StringTypes.a);
    loginButton.className = "pure-button";
    loginButton.href = LOGIN_URL;
    loginButton.textContent = "LOGIN";
    console.log("creating loginButton label");




    // DIVs
    HTMLDivElement divMail = document.createElement(StringTypes.div);
    divMail.className = "pure-control-group";
    $(divMail).append(email);
    HTMLDivElement divPw = document.createElement(StringTypes.div);
    divPw.className = "pure-control-group";
    $(divPw).append(password);
    HTMLDivElement divPw2 = document.createElement(StringTypes.div);
    divPw2.className = "pure-control-group";
    $(divPw2).append(password2);
    HTMLDivElement divFields = document.createElement(StringTypes.div);
    $(divFields).append(divMail);
    $(divFields).append(divPw);
    $(divFields).append(divPw2);
    $(divFields).css("marginTop", "30px");

    HTMLDivElement divItNat = document.createElement(StringTypes.div);
    $(divItNat).css("marginTop", "10");
    $(divItNat).append(cbItalianNat);
    $(divItNat).append(labelITNat);

    HTMLDivElement divEnNat = document.createElement(StringTypes.div);
    $(divEnNat).css("marginTop", "10");
    $(divEnNat).append(cbEnglishNat);
    $(divEnNat).append(labelENNat);

    HTMLDivElement divLangNat = document.createElement(StringTypes.div);
    $(divLangNat).append(labelLangNat);
    $(divLangNat).append(divItNat);
    $(divLangNat).append(divEnNat);
    $(divLangNat).css("marginTop", "50px");

    HTMLDivElement divItOther = document.createElement(StringTypes.div);
    $(divItOther).css("marginTop", "20");
    $(divItOther).append(cbItalianOther);
    $(divItOther).append(labelITOther);
    $(divItOther).append(livIT);
    HTMLDivElement divEnOther = document.createElement(StringTypes.div);
    $(divEnOther).css("marginTop", "10");
    $(divEnOther).append(cbEnglishOther);
    $(divEnOther).append(labelENOther);
    $(divEnOther).append(livEN);
    HTMLDivElement divLangOther = document.createElement(StringTypes.div);
    $(divLangOther).append(labelLangOther);
    $(divLangOther).append(labelLiv);
    $(divLangOther).append(divItOther);
    $(divLangOther).append(divEnOther);
    $(divLangOther).css("marginTop", "50px");

    HTMLDivElement divButton = document.createElement(StringTypes.div);
    $(signupButton).css("height", "30px");
    $(signupButton).css("width", "100px");
    $(signupButton).css("marginLeft", "500px");
    $(signupButton).css("marginTop", "25px");
    $(signupButton).css("backgroundColor", "rgba(64, 38, 94, 1)");
    $(signupButton).css("color", "white");
    $(signupButton).css("marginTop", "100");
    $(divButton).append(signupButton);

    HTMLDivElement divLink = document.createElement(StringTypes.div);
    $(loginButton).css("backgroundColor", "rgb(255, 255, 255)");
    $(loginButton).css("sizes", "100px");
    $(loginButton).css("height", "30px");
    $(loginButton).css("width", "100px");
    $(loginButton).css("marginLeft", "500px");
    $(divLink).append(loginButton);


    $(f).append(title);
    $(f).append(divFields);
    $(f).append(divLangNat);
    $(f).append(divLangOther);
    $(f).append(divButton);
    $(f).append(divLink);

    $(form).append(f);
    $("body").append(form);
  }
}
