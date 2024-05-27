package inheritrectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle(10, 5);
        Rectangle square = new Square(10);
        rectangle.area();
        rectangle.perimeter();
        System.out.println();
        square.area();
        square.perimeter();

	}

}
