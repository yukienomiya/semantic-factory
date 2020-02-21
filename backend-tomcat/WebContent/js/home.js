/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
/**
 * Represents the Home HTML page.
 * @class
 */
class Home {
    /**
     * Constructs the HTML page.
     * @return {HTMLElement}
     */
    static page() {
        return it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row navb lightBrown valign-wrapper").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s6").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlImg.newBuilder().setClass("imgS").setSrc(Home.LOGO))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("col s6 right-align").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlAnchor.newBuilder().setClass("waves-effect btn-flat brownie").setHref(Home.LOGOUT_URL).setContent("logout")))).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("container").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("full-height valign-wrapper").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlDiv.newBuilder().setClass("row").append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.newBuilder().setClass("center-align").setMethod("POST").setAction(Home.SERVLET_URL).append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.newBuilder().setClass("btn greenie waves-effect waves-light btn-large startbtn-font").setType("submit").setContent("INIZIA")))))).build();
    }
    static main(args) {
        $.get(Home.LOGIN_CHECK, (result, a, ctx) => {
            let isLoggedIn = result.toString();
            if (((o1, o2) => { if (o1 && o1.equals) {
                return o1.equals(o2);
            }
            else {
                return o1 === o2;
            } })(isLoggedIn, "true")) {
                let page = Home.page();
                $("body").append(page);
            }
            else {
                window.location.replace(Home.LOGIN_URL);
            }
            return null;
        });
    }
}
/**
 * Represents the url of the LogoutServlet.
 */
Home.LOGOUT_URL = "logout.jsp";
/**
 * Represents the path of the logo.
 */
Home.LOGO = "images/FS.svg";
/**
 * Represents the url of the HomeServlet.
 */
Home.SERVLET_URL = "home.jsp";
/**
 * Represents the url of the AuthenticationServiceServlet.
 */
Home.LOGIN_CHECK = "isLoggedIn.jsp";
/**
 * Represents the url of the Login page.
 */
Home.LOGIN_URL = "login.html";
Home["__class"] = "Home";
Home.main(null);
