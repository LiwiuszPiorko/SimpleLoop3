import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scan.nextInt();
        int suma = 0;
        Method check = new Method();
        int sum = check.justMethod(number);
        System.out.println("Suma cyfr: " + sum);
    }
}
