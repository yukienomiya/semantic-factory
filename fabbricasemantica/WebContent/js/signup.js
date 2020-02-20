/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
/**
 * Represents the Signup HTML page.
 * @class
 */
class Signup {
    /**
     * Constructs the HTML page.
     * @return {HTMLElement}
     */
    static page() {
        return it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12 red lighten-2 navb valign-wrapper").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg.newBuilder().setClass("imgS").setSrc(Signup.LOGO))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("container").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlH3.newBuilder().setClass("text-align: left").setContent("Iscriviti!")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("full-height").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.newBuilder().setClass("register-form").setMethod("POST").setAction(Signup.SERVLET_URL).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row top-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("input-field col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("email").setName("email").setRequired(true).setClass("validate").setPlaceholder("Email *")))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("input-field col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("password").setName("password").setId("password").setRequired(true).setPlaceholder("Password *").setOninput((e) => { return Signup.pswValidity(e); })))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("input-field col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("password").setName("password2").setId("password2").setRequired(true).setPlaceholder("Confermare la password *").setOninput((e) => { return Signup.pswValidity(e); }))))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row top-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlH6.newBuilder().setContent("Indicare le proprie lingue native: *")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row no-bottom-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setId("cbNat0").setName("cbNat").setValue("ITALIANO").setType("checkbox")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent("ITALIANO")))))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row no-bottom-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setId("cbNat1").setName("cbNat").setValue("ENGLISH").setType("checkbox")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent("ENGLISH"))))))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlH6.newBuilder().setContent("Indicare altre lingue parlate e il relativo livello CEFR:")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row valign-wrapper no-bottom-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s6").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setId("cbOther0").setName("cbItalianOther").setValue("Italiano").setType("checkbox").setOnClick((m) => { return Signup.activateSelect(m); })).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent("ITALIANO"))))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("input-field col s6").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.newBuilder().setClass("browser-default").setId("livOther0").setName("livIT").setDisabled(true).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("Livello").setValue("").setDisabled(true).setSelected(true)).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("A1")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("A2")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("B1")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("B2")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("C1")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("C2"))))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row valign-wrapper no-bottom-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s6").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setId("cbOther1").setName("cbEnglishOther").setValue("English").setType("checkbox").setOnClick((m) => { return Signup.activateSelect(m); })).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent("ENGLISH"))))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("input-field col s6").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.newBuilder().setClass("browser-default").setId("livOther1").setName("livEN").setDisabled(true).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("Livello").setValue("").setDisabled(true).setSelected(true)).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("A1")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("A2")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("B1")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("B2")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("C1")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.newBuilder().setContent("C2"))))))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row center-align top-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row no-bottom-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("input-field col s12 no-bottom-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.newBuilder().setType("submit").setClass("waves-effect waves-light btn-small greenie").setContent("AVANTI").setOnClick((m) => { return Signup.fieldsCheck(m); })))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row no-bottom-margin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("input-field col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setClass("brownie").setContent("Login").setHref(Signup.LOGIN_URL)))))))).build();
    }
    /**
     * Checks that the user selected at least one checkbox.
     * @param {MouseEvent} m     [Represents the MouseEvents that triggers the function]
     * @return {*}
     */
    static fieldsCheck(m) {
        let cbNativeLang = ([]);
        for (let i = 0; i < Signup.N_OF_LANGUAGES; i++) {
            {
                /* add */ (cbNativeLang.push(document.getElementById("cbNat" + i)) > 0);
                /* get */ cbNativeLang[i].required = true;
            }
            ;
        }
        for (let index125 = 0; index125 < cbNativeLang.length; index125++) {
            let cbNat = cbNativeLang[index125];
            {
                if (!cbNat.checked) {
                    continue;
                }
                for (let index126 = 0; index126 < cbNativeLang.length; index126++) {
                    let cbN = cbNativeLang[index126];
                    {
                        cbN.required = false;
                    }
                }
                break;
            }
        }
        return null;
    }
    /**
     * Activates the Select element (and sets it to required) if the relative checkbox is checked.
     * @param {MouseEvent} m [Represents the MouseEvent that triggers the function]
     * @return {*}
     */
    static activateSelect(m) {
        let cbOtherLang = ([]);
        let livOtherLang = ([]);
        for (let i = 0; i < Signup.N_OF_LANGUAGES; i++) {
            {
                /* add */ (cbOtherLang.push(document.getElementById("cbOther" + i)) > 0);
                /* add */ (livOtherLang.push(document.getElementById("livOther" + i)) > 0);
                /* get */ livOtherLang[i].required = false;
            }
            ;
        }
        for (let i = 0; i < Signup.N_OF_LANGUAGES; i++) {
            {
                let liv = livOtherLang[i];
                if (cbOtherLang[i].checked) {
                    liv.disabled = false;
                    liv.required = true;
                }
                else {
                    liv.disabled = true;
                    liv.required = false;
                }
            }
            ;
        }
        return null;
    }
    /**
     * Checkes if the password and its confirmation are equals.
     * @param {Event} e [Represents the Event that triggers the function]
     * @return {*}
     */
    static pswValidity(e) {
        let pswValue = $("#password").val();
        let psw2Value = $("#password2").val();
        if (!((o1, o2) => { if (o1 && o1.equals) {
            return o1.equals(o2);
        }
        else {
            return o1 === o2;
        } })(pswValue, psw2Value)) {
            $("#password2").removeClass("valid").addClass("invalid");
        }
        else {
            $("#password2").removeClass("invalid").addClass("valid");
        }
        return null;
    }
    static main(args) {
        $.ajax("/FabbricaSemantica/logout.jsp");
        document.addEventListener("DOMContentLoaded", (x) => {
            document.dispatchEvent(new Event("PageLoaded"));
        });
        let page = Signup.page();
        $("body").append(page);
    }
}
/**
 * Represents the path of the logo.
 */
Signup.LOGO = "images/FSp.svg";
/**
 * Represents the url of the SignupServlet.
 */
Signup.SERVLET_URL = "signup.jsp";
/**
 * Represents the url of the Login page.
 */
Signup.LOGIN_URL = "login.html";
/**
 * Represents the number of languages between which the user can choose when selecting his native/other language.
 */
Signup.N_OF_LANGUAGES = 2;
Signup["__class"] = "Signup";
Signup.main(null);
