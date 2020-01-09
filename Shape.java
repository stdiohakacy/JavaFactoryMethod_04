package creational.FactoryMethod._04;

public abstract class Shape {
	public abstract String draw();
}

class Circle extends Shape{

	@Override
	public String draw() {
		return "Circle drawing ...";
	}
	
}
class Rectangle extends Shape{

	@Override
	public String draw() {
		return "Rectangle drawing ...";
	}
	
}