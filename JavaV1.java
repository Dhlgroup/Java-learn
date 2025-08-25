import java.util.Scanner;

public class JavaV1 {
    public static void main(String[] args) {
      Scanner Input = new Scanner(System.in);

      System.out.println("Enter your name");
      String name = Input.nextLine();
      System.out.println("Your name is " + name);
    }
}
