package todo.Factory;

import todo.interfe.Shape;

public class mainClient {
public static void main(String[] args) {
	FactoryShape shape = new FactoryShape();
Shape tract = shape.getShape("tr");
tract.draw();

Shape cir = shape.getShape("cir");
cir.draw();

Shape sqr = shape.getShape("sqar");
sqr.draw();

}
}
