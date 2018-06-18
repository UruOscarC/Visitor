package com.ogcg.visitor;

interface Visitor {
    void visit(Foo foo);
    void visit(Bar bar);
    void visit(Baz baz);
}
