import java.util.ArrayList;

public class PythonToJava {

    ArrayList<Integer> findPrimeNumbers(int limit) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int num = 2; num < limit + 1; num++) {
            Boolean isPrime = true;
            for (int i = 2; i < (int) (Math.sqrt(num)) + 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(num);
            }
        }
        return primeNumbers;
    }

    double calculateAverage(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }
        double average = total / numbers.size();
        return average;
    }


    public static void main(String[] args) {

    }
}
