package com.ogcg.visitor;

class Foo implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFOO() {
        return "FOO";
    }
}
