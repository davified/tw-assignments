class Main {
  public static void main(String args[]) {
    System.out.println("start: drawing triangles");

    Triangle triangle = new Triangle();
    triangle.dot();
    triangle.drawHorizontalLine(8);
    triangle.drawVerticalLine(8);
    triangle.drawRightTriangle(5);
    triangle.drawIsoscelesTriangle(9);

    System.out.println("end");
  }
}
