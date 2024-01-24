package designPatterns;

interface Shape{
	void Draw();
}
class Circle implements Shape{

	@Override
	public void Draw() {
		System.out.println("Drawing Circle");
		
	}
}
class Square implements Shape{
	@Override
	public void Draw() {
		System.out.println("Drawing Square");
		
	}
}
class Rectangle implements Shape{
	@Override
	public void Draw() {
		System.out.println("Drawing Rectangle");
		
	}
}
class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("Circle"))
			
			return new Circle();
		
		else if(shapeType.equalsIgnoreCase("Square"))
			
		return new Square();
		
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			
			return new Rectangle();
		else
			return null;
	}
}
public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape;
		
		shape=shapeFactory.getShape("Circle");
		shape.Draw();
		
		shape=shapeFactory.getShape("Square");
		shape.Draw();
		
		shape=shapeFactory.getShape("Square");
		shape.Draw();
	}

}
