import java.util.Scanner;

public class MethodTest {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scan.nextInt();

        Method check = new Method();
        int sum = check.justMethod();

        System.out.println("Suma cyfr: " + sum);
    }
}
