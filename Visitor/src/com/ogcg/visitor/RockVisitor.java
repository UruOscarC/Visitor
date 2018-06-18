package com.ogcg.visitor;

class RockVisitor implements Visitor {
    public void visit(Foo foo) {
        System.out.println("Rock concert on " + foo.getFOO());
    }

    public void visit(Bar bar) {
        System.out.println("Rock concert on " + bar.getBAR());
    }

    public void visit(Baz baz) {
        System.out.println( "Rock concert on " + baz.getBAZ() );
    }
}
