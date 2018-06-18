package com.ogcg.visitor;

public class RapVisitor implements Visitor {

	@Override
	public void visit(Foo foo) {
		// TODO Auto-generated method stub
		System.out.println("Rap battle on " + foo.getFOO());
	}

	@Override
	public void visit(Bar bar) {
		// TODO Auto-generated method stub
		System.out.println("Rap battle on " + bar.getBAR());
	}

	@Override
	public void visit(Baz baz) {
		// TODO Auto-generated method stub
		System.out.println("Rap battle on " + baz.getBAZ());
	}

}
