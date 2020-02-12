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
                 * Represents a HTML TextArea element.
                 * @class
                 */
                class HtmlTextArea {
                    constructor() {
                    }
                    /**
                     * Returns an object of type Builder.
                     * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea.Builder}
                     */
                    static newBuilder() {
                        return new HtmlTextArea.Builder();
                    }
                }
                dom.HtmlTextArea = HtmlTextArea;
                HtmlTextArea["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea";
                (function (HtmlTextArea) {
                    /**
                     * Represents a Builder of HTMLTextAreaElement.
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("textarea");
                        }
                        /**
                         * Set the class of the Text Area element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea.Builder} [the Builder object]
                         * @param {string} classe
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * Set the text content of the Text Area element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea.Builder} [the Builder object]
                         * @param {string} textContent
                         */
                        setContent(textContent) {
                            this.element.textContent = textContent;
                            return this;
                        }
                        /**
                         * Set the required attribute of the Text Area element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea.Builder} [the Builder object]
                         * @param {boolean} b
                         */
                        setRequired(b) {
                            this.element.required = b;
                            return this;
                        }
                        /**
                         * Set the id of the Text Area element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea.Builder} [the Builder object]
                         * @param {string} id
                         */
                        setId(id) {
                            this.element.id = id;
                            return this;
                        }
                        /**
                         * Set the name of the Text Area element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea.Builder} [the Builder object]
                         * @param {string} name
                         */
                        setName(name) {
                            this.element.name = name;
                            return this;
                        }
                        append$def_dom_HTMLElement(child) {
                            this.element.appendChild(child);
                            return this;
                        }
                        /**
                         * Appends another HTMLElement to the element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea.Builder} [the Builder object]
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
                    HtmlTextArea.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlTextArea.Builder";
                })(HtmlTextArea = dom.HtmlTextArea || (dom.HtmlTextArea = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
