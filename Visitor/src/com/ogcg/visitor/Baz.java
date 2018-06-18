package com.ogcg.visitor;

class Baz implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBAZ() {
        return "BAZ";
    }
}
