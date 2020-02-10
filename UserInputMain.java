import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {

      /*  Scanner sc= new Scanner(System.in);
        String firstStr=sc.nextLine();
        System.out.println("You entered:" +firstStr);

        int a=sc.nextInt;
        System.out.println("You entered:" +a);*/

        System.out.println("Hello-What's your name?");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello" + name);

        int age = sc.nextInt();
        System.out.println("you are" + age + "years old");
    }
}
