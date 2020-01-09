package creational.FactoryMethod._04;

public class Client {
	public static void main(String[] args) {
		Shape circle = new Circle();
		System.out.println(circle.draw());
	}
}
