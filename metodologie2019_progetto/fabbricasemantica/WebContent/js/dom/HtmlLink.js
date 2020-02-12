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
                 * Represents a HTML Link element.
                 * @class
                 */
                class HtmlLink {
                    constructor() {
                    }
                    /**
                     * Returns an object of type Builder.
                     * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlLink.Builder}
                     */
                    static newBuilder() {
                        return new HtmlLink.Builder();
                    }
                }
                dom.HtmlLink = HtmlLink;
                HtmlLink["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlLink";
                (function (HtmlLink) {
                    /**
                     * Represents a Builder of HTMLLinkElement.
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("link");
                        }
                        /**
                         * Sets the class of the Link element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlLink.Builder} [the Builder object]
                         * @param {string} classe
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * Sets the text content of the Link element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlLink.Builder} [the Builder object]
                         * @param {string} textContent
                         */
                        setContent(textContent) {
                            this.element.textContent = textContent;
                            return this;
                        }
                        /**
                         * Sets the id of the Link element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlLink.Builder} [the Builder object]
                         * @param {string} id
                         */
                        setId(id) {
                            this.element.id = id;
                            return this;
                        }
                        /**
                         * Sets the href of the Link element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlLink.Builder} [the Builder object]
                         * @param {string} href
                         */
                        setHref(href) {
                            this.element.href = href;
                            return this;
                        }
                        append$def_dom_HTMLElement(child) {
                            this.element.appendChild(child);
                            return this;
                        }
                        /**
                         * Appends another HTMLElement to the element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlLink.Builder} [the Builder object]
                         * @param {HTMLElement} child
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
                    HtmlLink.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlLink.Builder";
                })(HtmlLink = dom.HtmlLink || (dom.HtmlLink = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
