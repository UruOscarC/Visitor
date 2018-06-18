package com.ogcg.visitor;

public class Main {
	public static void main( String[] args ) {
        Element[] list = {new Foo(), new Bar(), new Baz()};
        RockVisitor rock = new RockVisitor ();
        RapVisitor rap = new RapVisitor();
        for (Element element : list) {
            element.accept(rock);
        }
        for (Element element : list) {
            element.accept(rap);
        }
    }
}
