package primefactor5630213023;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int i = 0;
        while (number != 99999999) {
            System.out.print("ENTER NUMBER : ");
            number = sc.nextInt();
            i = primeFactors(number).size();
            for (Integer integer : primeFactors(number)) {
                i--;
                System.out.print(integer);
                if (i == 0) {
                    break;
                }
                System.out.print("x");
            }
            System.out.println();
        }
    }
    public static List<Integer> primeFactors(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }
}
