public class Tree {
  public static void main(String[] args) {
    printName("Oliver");
    printTriangle(10, 0, 10);
    printTriangle(5, 5, 15);
    printTriangle(0, 10, 20);
    printSquare(15, 9, 4);
  }
  static void printTriangle(int indent, int   start, int size) {
    for (int row = start; row < size; row++)
        System.out.println(" ".repeat(size - row - 1 + indent) + "*".repeat(1 + 2 * row));
  }
  static void printSquare(int indent, int width, int height) {
    for (int row = 0; row < height; row++)
        System.out.println(" ".repeat(indent) + "*".repeat(width));
  }
  static void printName(String name) {
    System.out.println("Hey there, I am " + name + " and I am learning to code in Java!" + " I am going to plant a tree today!");
  }
}