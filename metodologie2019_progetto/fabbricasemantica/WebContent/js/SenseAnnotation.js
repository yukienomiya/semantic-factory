/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
class SenseAnnotation {
    static page(word, description, senses) {
        return it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row red lighten-2 navb valign-wrapper navMargin").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s6").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg.newBuilder().setClass("imgS").setSrc("images/FS.svg"))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s6 right-align").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setClass("waves-effect btn-flat brownie").setHref("home.html").setContent("HOME")).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setClass("waves-effect btn-flat brownie").setHref("logout.jsp").setContent("logout")))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("container").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("valign-wrapper h80").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("center-align").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("fontW marginTop").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().setContent("Data la seguente parola e la frase di esempio, selezionare il significato corretto:"))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("card card-color marginTB").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("card-content center-align white-text").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setClass("card-title").setContent(word.toUpperCase())).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().setClass("fontP").setContent(description)))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.newBuilder().setClass("col s12 marginT left-align").setMethod("POST").setAction("senseAnnotation.jsp").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("checkbox").setName("senses").setId("sense0").setValue(senses[0])).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent(senses[0])))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("checkbox").setName("senses").setId("sense1").setValue(senses[1])).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent(senses[1])))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("checkbox").setName("senses").setId("sense2").setValue(senses[2])).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent(senses[2])))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlLabel.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setType("checkbox").setName("senses").setId("sense3").setValue(senses[3])).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlSpan.newBuilder().setContent(senses[3])))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("center-align").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12 marginT").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.newBuilder().setClass("btn waves-effect waves-light sub-btn greenie").setType("submit").setContent("AVANTI").setOnClick((m) => { return SenseAnnotation.fieldsCheck(m); }))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s12").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setClass("waves-effect waves-light btn white brownie skipPAD").setContent("SALTA").setHref("nextTask.jsp")))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setName("word").setHidden(true).setValue(word)).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.newBuilder().setName("description").setHidden(true).setValue(description)))))))).build();
    }
    static fieldsCheck(m) {
        let cbSense0 = document.getElementById("sense0");
        let cbSense1 = document.getElementById("sense1");
        let cbSense2 = document.getElementById("sense2");
        let cbSense3 = document.getElementById("sense3");
        cbSense0.required = false;
        cbSense1.required = false;
        cbSense2.required = false;
        cbSense3.required = false;
        if (!cbSense0.checked && !cbSense1.checked && !cbSense2.checked && !cbSense3.checked) {
            cbSense0.required = true;
            cbSense1.required = true;
            cbSense2.required = true;
            cbSense3.required = true;
        }
        return null;
    }
    static main(args) {
        $.get(SenseAnnotation.LOGIN_CHECK, (result, a, ctx) => {
            let isLoggedIn = result.toString();
            if (((o1, o2) => { if (o1 && o1.equals) {
                return o1.equals(o2);
            }
            else {
                return o1 === o2;
            } })(isLoggedIn, "false")) {
                window.location.replace("login.html");
            }
            return null;
        });
        $.getJSON(SenseAnnotation.REST_URL, "task=SENSE_ANNOTATION", (result, a, ctx) => {
            let json = result;
            let word = (json["word"]);
            let description = (json["description"]);
            let senses = (json["senses"]);
            let page = SenseAnnotation.page(word, description, senses);
            $("body").append(page);
            return null;
        });
    }
}
SenseAnnotation.REST_URL = "nextExample.jsp";
SenseAnnotation.LOGIN_CHECK = "isLoggedIn.jsp";
SenseAnnotation["__class"] = "SenseAnnotation";
SenseAnnotation.main(null);
