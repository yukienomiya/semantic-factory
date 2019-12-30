/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
class Home {
    static page() {
        return it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("container valign-wrapper").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.newBuilder().setClass("center-align").setMethod("POST").setAction(Home.TASK_URL).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.newBuilder().setClass("btn red lighten-1 waves-effect waves-light btn-large startbtn-font").setType("submit").setContent("START"))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("center-align logout-btn").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setContent("Logout").setHref(Home.LOGOUT_URL)))).build();
    }
    static main(args) {
        let page = Home.page();
        $("body").append(page);
    }
}
Home.LOGOUT_URL = "logout.jsp";
Home.TASK_URL = "translationAnnotation.html";
Home["__class"] = "Home";
Home.main(null);
