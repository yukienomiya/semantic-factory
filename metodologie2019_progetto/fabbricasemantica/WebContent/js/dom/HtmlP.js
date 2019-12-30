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
                class HtmlP {
                    constructor() {
                    }
                    /**
                     * TODO(yukienomiya): Add JavaDoc
                     * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.Builder}
                     */
                    static newBuilder() {
                        return new HtmlP.Builder();
                    }
                }
                dom.HtmlP = HtmlP;
                HtmlP["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlP";
                (function (HtmlP) {
                    /**
                     * TODO(yukienomiya): Add JavaDoc
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("p");
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {string} classe
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.Builder}
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {string} id
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.Builder}
                         */
                        setId(id) {
                            this.element.id = id;
                            return this;
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {string} textContent
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.Builder}
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
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.Builder}
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
                    HtmlP.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlP.Builder";
                })(HtmlP = dom.HtmlP || (dom.HtmlP = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
