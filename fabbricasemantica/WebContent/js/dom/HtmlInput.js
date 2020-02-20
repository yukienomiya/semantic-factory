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
                 * Represents a HTML Input element.
                 * @class
                 */
                class HtmlInput {
                    constructor() {
                    }
                    /**
                     * Returns an object of type Builder.
                     * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder}
                     */
                    static newBuilder() {
                        return new HtmlInput.Builder();
                    }
                }
                dom.HtmlInput = HtmlInput;
                HtmlInput["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput";
                (function (HtmlInput) {
                    /**
                     * Represents a Builder of HTMLInputElement.
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("input");
                        }
                        /**
                         * Sets the class of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {string} classe
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * Sets the value of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {string} value
                         */
                        setValue(value) {
                            this.element.value = value;
                            return this;
                        }
                        /**
                         * Sets the text content of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {string} textContent
                         */
                        setContent(textContent) {
                            this.element.textContent = textContent;
                            return this;
                        }
                        /**
                         * Sets the placeholder of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {string} ph
                         */
                        setPlaceholder(ph) {
                            this.element.placeholder = ph;
                            return this;
                        }
                        /**
                         * Sets the required attribute of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {boolean} b
                         */
                        setRequired(b) {
                            this.element.required = b;
                            return this;
                        }
                        /**
                         * Sets the hidden attribute of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {boolean} b
                         */
                        setHidden(b) {
                            this.element.hidden = b;
                            return this;
                        }
                        /**
                         * Sets the id of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {string} id
                         */
                        setId(id) {
                            this.element.id = id;
                            return this;
                        }
                        /**
                         * Sets the onclick of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {*} f
                         */
                        setOnClick(f) {
                            this.element.onclick = (f);
                            return this;
                        }
                        /**
                         * Sets the oninput of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {*} f
                         */
                        setOninput(f) {
                            this.element.oninput = (f);
                            return this;
                        }
                        /**
                         * Sets the onkeyup of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {*} f
                         */
                        setOnkeyup(f) {
                            this.element.onkeyup = (f);
                            return this;
                        }
                        /**
                         * Sets the name of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {string} name
                         */
                        setName(name) {
                            this.element.name = name;
                            return this;
                        }
                        /**
                         * Sets the type of the Input element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
                         * @param {string} type
                         */
                        setType(type) {
                            this.element.type = type;
                            return this;
                        }
                        append$def_dom_HTMLElement(child) {
                            this.element.appendChild(child);
                            return this;
                        }
                        /**
                         * Appends another HTMLElement to the element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder} [the Builder object]
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
                    HtmlInput.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlInput.Builder";
                })(HtmlInput = dom.HtmlInput || (dom.HtmlInput = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
