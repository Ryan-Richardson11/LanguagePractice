import java.util.ArrayList;

public class PythonToJava {

    public static ArrayList<Integer> findPrimeNumbers(int limit) {
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

    public static double calculateAverage(ArrayList<Integer> numbers) {
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
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(23);
        numbers.add(30);
        numbers.add(42);
        numbers.add(57);
        numbers.add(66);
        numbers.add(79);
        numbers.add(88);
        numbers.add(94);

        ArrayList<Integer> primeNumbers = findPrimeNumbers(100);
        double average = calculateAverage(numbers);

        System.out.println("Prime numbers less than or equal to 100: " + primeNumbers);
        System.out.println("Average of the numbers: " + average);

    }
}
