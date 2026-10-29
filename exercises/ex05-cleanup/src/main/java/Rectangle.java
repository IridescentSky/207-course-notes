/**
 * Rectangle class that allows for calculation of area, size scaling, and area comparison to other
 * rectangles.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructor for the rectangle object.
   *
   * @param w The rectangle's width.
   * @param h The rectangle's height.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of the rectangle as a double.
   *
   * @return the area of the rectangle as a double.
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle by a factor.
   *
   * @param factor The factor by which we scale the rectangle
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares the rectangles by area.
   *
   * @param other The rectangle to which we are comparing.
   * @return the boolean indicating true if this rectangle is larger in area than other.
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
