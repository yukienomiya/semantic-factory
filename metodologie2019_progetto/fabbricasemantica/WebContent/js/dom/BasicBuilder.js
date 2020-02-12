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
                 * Represents the generic Builder.
                 * @class
                 */
                class BasicBuilder {
                    constructor() {
                        /**
                         * Indicates whether the element has already been built or not.
                         */
                        /*private*/ this.built = false;
                        if (this.element === undefined)
                            this.element = null;
                    }
                    /**
                     * Returns the element only once.
                     * @return {HTMLElement}
                     */
                    build() {
                        if (this.built) {
                            throw Object.defineProperty(new Error("Build method should only be called once"), '__classes', { configurable: true, value: ['java.lang.Throwable', 'java.lang.Error', 'java.lang.Object'] });
                        }
                        this.built = true;
                        return this.element;
                    }
                }
                dom.BasicBuilder = BasicBuilder;
                BasicBuilder["__class"] = "it.uniroma1.fabbricasemanticajsweet.dom.BasicBuilder";
            })(dom = fabbricasemanticajsweet.dom || (fabbricasemanticajsweet.dom = {}));
        })(fabbricasemanticajsweet = uniroma1.fabbricasemanticajsweet || (uniroma1.fabbricasemanticajsweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
