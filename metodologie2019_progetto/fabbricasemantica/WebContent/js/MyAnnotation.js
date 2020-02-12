/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
/**
 * Represents the MyAnnotation task HTML page.
 * @class
 */
class MyAnnotation {
    /**
     * Constructs the HTML page.
     *
     * @param {string} word    [Represents the word of the task]
     * @param {string} example [Represents the example of the task]
     * @param {Array} words [Represents the senses of the task]
     * @return {HTMLElement}
     */
    static page(word, example, words) {
        return it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row lightBrown navb valign-wrapper").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s6").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg.newBuilder().setClass("imgS").setSrc(MyAnnotation.LOGO))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s6 right-align").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setClass("waves-effect btn-flat brownie").setHref(MyAnnotation.HOME_URL).setContent("HOME")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setClass("waves-effect btn-flat brownie").setHref(MyAnnotation.LOGOUT_URL).setContent("logout")))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("container").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("valign-wrapper h80").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("center-align").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("fontW marginTop").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().setContent("Data la seguente parola e la frase di esempio, indovina il relativo sinonimo:"))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("card pink-card marginTB").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("card-content center-align white-text").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setClass("card-title").setContent(word.toUpperCase())).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().setClass("fontP").setContent("\"" + example + "\"")))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.newBuilder().setClass("col s12 marginT left-align").setMethod("POST").setAction(MyAnnotation.TASK_URL).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("checkbox").setName("words").setId("word0").setValue(words[0])).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent(words[0])))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("checkbox").setName("words").setId("word1").setValue(words[1])).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent(words[1])))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("checkbox").setName("words").setId("word2").setValue(words[2])).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent(words[2])))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("checkbox").setName("words").setId("word3").setValue(words[3])).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent(words[3])))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("center-align").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12 marginT").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.newBuilder().setClass("btn waves-effect waves-light sub-btn greenie").setType("submit").setContent("AVANTI").setOnClick((m) => { return MyAnnotation.fieldsCheck(m); }))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setClass("waves-effect waves-light btn white brownie skipPAD").setContent("SALTA").setHref(MyAnnotation.NEXT_TASK)))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setName("word").setHidden(true).setValue(word)).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setName("example").setHidden(true).setValue(example)))))))).build();
    }
    /**
     * Checks that the user selected at least one checkbox.
     * @param {MouseEvent} m [Represents the MouseEvents that triggers the function]
     * @return {*}
     */
    static fieldsCheck(m) {
        let cbWords = ([]);
        for (let i = 0; i < 4; i++) {
            {
                /* add */ (cbWords.push(document.getElementById("word" + i)) > 0);
                /* get */ cbWords[i].required = true;
            }
            ;
        }
        for (let index121 = 0; index121 < cbWords.length; index121++) {
            let cbWord = cbWords[index121];
            {
                if (!cbWord.checked) {
                    continue;
                }
                for (let index122 = 0; index122 < cbWords.length; index122++) {
                    let cbW = cbWords[index122];
                    {
                        cbW.required = false;
                    }
                }
                break;
            }
        }
        return null;
    }
    static main(args) {
        $.get(MyAnnotation.LOGIN_CHECK, (result, a, ctx) => {
            let isLoggedIn = result.toString();
            if (((o1, o2) => { if (o1 && o1.equals) {
                return o1.equals(o2);
            }
            else {
                return o1 === o2;
            } })(isLoggedIn, "false")) {
                window.location.replace(MyAnnotation.LOGIN_URL);
            }
            return null;
        });
        $.getJSON(MyAnnotation.REST_URL, "task=MY_ANNOTATION", (result, a, ctx) => {
            let json = result;
            let word = (json["word"]);
            let example = (json["example"]);
            let words = (json["words"]);
            let page = MyAnnotation.page(word, example, words);
            $("body").append(page);
            return null;
        });
    }
}
/**
 * Represents the url of the Home page.
 */
MyAnnotation.HOME_URL = "home.html";
/**
 * Represents the url of the LogoutServlet.
 */
MyAnnotation.LOGOUT_URL = "logout.jsp";
/**
 * Represents the path of the logo.
 */
MyAnnotation.LOGO = "images/FS.svg";
/**
 * Represents the url of the NewExampleServiceServlet.
 */
MyAnnotation.REST_URL = "nextExample.jsp";
/**
 * Represents the url of the MyAnnotationServlet.
 */
MyAnnotation.TASK_URL = "myAnnotation.jsp";
/**
 * Represents the url of the AuthenticationServiceServlet.
 */
MyAnnotation.LOGIN_CHECK = "isLoggedIn.jsp";
/**
 * Represents the url of the NextTaskServlet.
 */
MyAnnotation.NEXT_TASK = "nextTask.jsp";
/**
 * Represents the url of the Login page.
 */
MyAnnotation.LOGIN_URL = "login.html";
MyAnnotation["__class"] = "MyAnnotation";
MyAnnotation.main(null);
