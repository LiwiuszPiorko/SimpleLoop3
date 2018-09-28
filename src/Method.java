public class Method {


    int justMethod(int number) {
        int suma = 0;
        do {
            int digit = number % 10;
            suma = suma + digit;
            number = (number - digit) / 10;
        } while (number != 0);

        return suma;
    }
}

