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
                 * Represents a HTML Form element.
                 * @class
                 */
                class HtmlForm {
                    constructor() {
                    }
                    /**
                     * Returns an object of type Builder.
                     * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.Builder}
                     */
                    static newBuilder() {
                        return new HtmlForm.Builder();
                    }
                }
                dom.HtmlForm = HtmlForm;
                HtmlForm["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm";
                (function (HtmlForm) {
                    /**
                     * Represents a Builder of HTMLFormElement.
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("form");
                        }
                        /**
                         * Sets the class of the Form element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.Builder} [the Builder object]
                         * @param {string} classe
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * Sets the text content of the Form element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.Builder} [the Builder object]
                         * @param {string} textContent
                         */
                        setContent(textContent) {
                            this.element.textContent = textContent;
                            return this;
                        }
                        /**
                         * Sets the method of the Form element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.Builder} [the Builder object]
                         * @param {string} method
                         */
                        setMethod(method) {
                            this.element.method = method;
                            return this;
                        }
                        /**
                         * Sets the action of the Form element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.Builder} [the Builder object]
                         * @param {string} action
                         */
                        setAction(action) {
                            this.element.action = action;
                            return this;
                        }
                        append$def_dom_HTMLElement(child) {
                            this.element.appendChild(child);
                            return this;
                        }
                        /**
                         * Appends another HTMLElement to the element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.Builder} [the Builder object]
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
                    HtmlForm.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlForm.Builder";
                })(HtmlForm = dom.HtmlForm || (dom.HtmlForm = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
