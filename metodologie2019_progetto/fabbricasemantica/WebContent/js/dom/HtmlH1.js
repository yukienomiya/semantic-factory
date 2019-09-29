/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var fabbricasemanticajsweet;
        (function (fabbricasemanticajsweet) {
            var dom;
            (function (dom) {
                /**
                 * TODO(yukienomiya): Add JavaDoc
                 * @class
                 */
                class HtmlH1 {
                    constructor() {
                    }
                    static newBuilder() {
                        return new HtmlH1.Builder();
                    }
                }
                dom.HtmlH1 = HtmlH1;
                HtmlH1["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlH1";
                (function (HtmlH1) {
                    /**
                     * TODO(yukienomiya): Add JavaDoc
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("h1");
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {string} classe
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlH1.Builder}
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {string} textContent
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlH1.Builder}
                         */
                        setContent(textContent) {
                            this.element.textContent = textContent;
                            return this;
                        }
                        append$def_dom_HTMLElement(child) {
                            this.element.appendChild(child);
                            return this;
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {HTMLElement} child
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlH1.Builder}
                         */
                        append(child) {
                            if (((child != null && child instanceof HTMLElement) || child === null)) {
                                return this.append$def_dom_HTMLElement(child);
                            }
                            else if (((child != null && child instanceof it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder) || child === null)) {
                                return this.append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(child);
                            }
                            else
                                throw new Error('invalid overload');
                        }
                        append$it_uniroma1_fabbricasemanticajsweet_dom_BasicBuilder(childBuilder) {
                            this.element.appendChild(childBuilder.build());
                            return this;
                        }
                    }
                    HtmlH1.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlH1.Builder";
                })(HtmlH1 = dom.HtmlH1 || (dom.HtmlH1 = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
