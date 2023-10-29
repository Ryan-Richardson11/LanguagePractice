import java.util.ArrayList;

public class PythonToJava {

    ArrayList findPrimeNumbers(int limit) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int num = 2; num < limit + 1; num++) {
            Boolean isPrime = true;
            for (int i = 2; i < (Math.pow(num, 0.5)) + 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            if (isPrime) {
                primeNumbers.add(num);
            }
            }
        return primeNumbers;
        }
    }



    public static void main(String[] args) {

    }
}
