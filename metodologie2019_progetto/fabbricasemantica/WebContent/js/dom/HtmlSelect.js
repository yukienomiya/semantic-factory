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
                 * Represents a HTML Select element.
                 * @class
                 */
                class HtmlSelect {
                    constructor() {
                    }
                    /**
                     * Returns an object of type Builder.
                     * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.Builder}
                     */
                    static newBuilder() {
                        return new HtmlSelect.Builder();
                    }
                }
                dom.HtmlSelect = HtmlSelect;
                HtmlSelect["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect";
                (function (HtmlSelect) {
                    /**
                     * Represents a Builder of HTMLSelectElement.
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.element = document.createElement("select");
                        }
                        /**
                         * Set the class of the Select element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.Builder} [the Builder object]
                         * @param {string} classe
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * Set the name of the Select element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.Builder} [the Builder object]
                         * @param {string} name
                         */
                        setName(name) {
                            this.element.name = name;
                            return this;
                        }
                        /**
                         * Set the id of the Select element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.Builder} [the Builder object]
                         * @param {string} id
                         */
                        setId(id) {
                            this.element.id = id;
                            return this;
                        }
                        /**
                         * Set the disabled attribute of the Select element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.Builder} [the Builder object]
                         * @param {boolean} b
                         */
                        setDisabled(b) {
                            this.element.disabled = b;
                            return this;
                        }
                        append$def_dom_HTMLElement(child) {
                            this.element.appendChild(child);
                            return this;
                        }
                        /**
                         * Appends another HTMLElement to the element.
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.Builder} [the Builder object]
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
                    HtmlSelect.Builder = Builder;
                    Builder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlSelect.Builder";
                })(HtmlSelect = dom.HtmlSelect || (dom.HtmlSelect = {}));
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
