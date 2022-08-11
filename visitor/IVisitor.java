package visitor;

public interface IVisitor {
	void visit(Charmander charmander, Pokemon pokemon);
	void visit(Charmeleon charmeleon, Pokemon pokemon);
	void visit(Charizard charizerd, Pokemon pokemon);
}
