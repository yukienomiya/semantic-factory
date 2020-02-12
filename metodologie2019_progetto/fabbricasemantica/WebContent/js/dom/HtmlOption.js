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
                 * Represents a HTML Option element.
                 * @class
                 */
                class HtmlOption {
                    constructor() {
                    }
                    /**
                     * Returns an object of type Builder.
                     * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder}
                     */
                    static newBuilder() {
                        return new HtmlOption.Builder();
                    }
                }
                dom.HtmlOption = HtmlOption;
                HtmlOption["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption";
                (function (HtmlOption) {
                    /**
                     * Represents a Builder of HTMLOptionElement.
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("option");
                        }
                        /**
                         * Sets the class of the Option element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder} [the Builder object]
                         * @param {string} classe
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * Sets the text content of the Option element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder} [the Builder object]
                         * @param {string} textContent
                         */
                        setContent(textContent) {
                            this.element.textContent = textContent;
                            return this;
                        }
                        /**
                         * Sets the selected attribute of the Option element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder} [the Builder object]
                         * @param {boolean} sel
                         */
                        setSelected(sel) {
                            this.element.selected = sel;
                            return this;
                        }
                        /**
                         * Sets the disabled attribute of the Option element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder} [the Builder object]
                         * @param {boolean} dis
                         */
                        setDisabled(dis) {
                            this.element.disabled = dis;
                            return this;
                        }
                        /**
                         * Sets the value of the Option element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder} [the Builder object]
                         * @param {string} value
                         */
                        setValue(value) {
                            this.element.value = value;
                            return this;
                        }
                        append$def_dom_HTMLElement(child) {
                            this.element.appendChild(child);
                            return this;
                        }
                        /**
                         * Appends another HTMLElement to the element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder} [the Builder object]
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
                    HtmlOption.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder";
                })(HtmlOption = dom.HtmlOption || (dom.HtmlOption = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
