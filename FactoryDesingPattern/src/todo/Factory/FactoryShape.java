package todo.Factory;

import todo.interfe.Shape;
import todo.ract.Circle;
import todo.ract.Ranctangle;
import todo.ract.Squre;

public class FactoryShape {

	public Shape getShape(String typeshape) {
		if(typeshape.equals("tr")) 
			return new Ranctangle();
		else if(typeshape.equals("sqr"))
			return new Squre();
		else if(typeshape.equals("cir"))
			return new Circle();
		return null;
			
		
		
	}
}
