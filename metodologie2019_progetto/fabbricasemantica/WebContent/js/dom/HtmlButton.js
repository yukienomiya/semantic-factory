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
                 * Represents a HTML Button element.
                 * @class
                 */
                class HtmlButton {
                    constructor() {
                    }
                    /**
                     * Returns an object of type Builder.
                     * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.Builder}
                     */
                    static newBuilder() {
                        return new HtmlButton.Builder();
                    }
                }
                dom.HtmlButton = HtmlButton;
                HtmlButton["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton";
                (function (HtmlButton) {
                    /**
                     * Represents a Builder of HTMLButtonElement.
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("button");
                        }
                        /**
                         * Set the class of the Button element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.Builder} [the Builder object]
                         * @param {string} classe
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * Set the text content of the Button element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.Builder} [the Builder object]
                         * @param {string} textContent
                         */
                        setContent(textContent) {
                            this.element.textContent = textContent;
                            return this;
                        }
                        /**
                         * Set the onclick of the Button element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.Builder} [the Builder object]
                         * @param {*} f
                         */
                        setOnClick(f) {
                            this.element.onclick = (f);
                            return this;
                        }
                        /**
                         * Set the type of the Button element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.Builder} [the Builder object]
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
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.Builder} [the Builder object]
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
                    HtmlButton.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlButton.Builder";
                })(HtmlButton = dom.HtmlButton || (dom.HtmlButton = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
