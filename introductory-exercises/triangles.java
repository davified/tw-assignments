class Triangle {
  public static void dot() {
    System.out.println("executing .dot(): ");
    System.out.println("*");
  }

  public static void drawHorizontalLine(int n) {
    String output = "";
    while (n > 0) {
      output = output + "*";
      n -= 1;
    }
    System.out.println("executing .drawHorizontalLine(): ");
    System.out.println(output);
  }

  public static void drawVerticalLine(int n) {
    System.out.println("executing .drawVerticalLine(): ");
    while (n > 0) {
      System.out.println("*");
      n -= 1;
    }
  }

  public static void drawRightTriangle(int n) {
    System.out.println("executing .drawRightTriangle(): ");
    String output = "*";
    while (n > 0) {
      System.out.println(output);
      output += "*";
      n -= 1;
    }
  }

  public static void drawIsoscelesTriangle(int n) {
    System.out.println("executing .drawIsoscelesTriangle(): ");
    String newLine = "";
    int startingSpaces = (n - 1) / 2;
    System.out.println(startingSpaces);
    while (n > 0) {
      if (n % 2 == 0) {  // dealing with even numbers

      } else { //dealing with odd numbers
        String sideSpaceString = new String(new char[startingSpaces]).replace("\0", " ");
        System.out.println(sideSpaceString + "*" + sideSpaceString);
      }
      n -= 1;
    }
  }
}
