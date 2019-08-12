package prob6;

public class Rectangle extends Shape implements Resizable {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height; // 밑변 * 높이
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}

}
