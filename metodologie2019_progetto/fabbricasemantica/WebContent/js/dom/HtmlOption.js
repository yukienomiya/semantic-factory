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
                class HtmlOption {
                    constructor() {
                    }
                    static newBuilder() {
                        return new HtmlOption.Builder();
                    }
                }
                dom.HtmlOption = HtmlOption;
                HtmlOption["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption";
                (function (HtmlOption) {
                    /**
                     * TODO(yukienomiya): Add JavaDoc
                     * @extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder
                     * @class
                     */
                    class Builder extends it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder {
                        constructor() {
                            super();
                            this.__it_uniroma1_fabbricasemanticajsweet_dom_HtmlOption_Builder_built = false;
                            if (this.element === undefined)
                                this.element = null;
                            this.element = document.createElement("option");
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {string} classe
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder}
                         */
                        setClass(classe) {
                            this.element.className = classe;
                            return this;
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {string} textContent
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder}
                         */
                        setContent(textContent) {
                            this.element.textContent = textContent;
                            return this;
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {boolean} sel
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder}
                         */
                        setSelected(sel) {
                            this.element.selected = sel;
                            return this;
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {boolean} dis
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder}
                         */
                        setDisabled(dis) {
                            this.element.disabled = dis;
                            return this;
                        }
                        /**
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {string} value
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder}
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
                         * TODO(yukienomiya): Add JavaDoc
                         * @param {HTMLElement} child
                         * @return {it.uniroma1.fabbricasemanticajsweet.dom.HtmlOption.Builder}
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