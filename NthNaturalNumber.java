// Given a positive integer N, the task is to find the Nth natural number after removing all the natural 
// numbers containing digit 9.
// Examples:
// Input: N = 8
// Output: 8
// Explanation:
// Since 9 is the first natural number that contains the digit 9 and is the 9th natural 
// number, therefore, no removal required to find the 8th natural number, which is 8.

// Input: N = 9
// Output: 10
// Explanation:
// Removing number 9, the first 9 natural numbers are {1, 2, 3, 4, 5, 6, 7, 8, 10}.
// Therefore, the 9th natural number is 10.

public class NthNaturalNumber {

    static long findNthNumber(long N) {

        long result = 0;

        long p = 1;

        while (N > 0) {

            result += (p * (N % 9));

            N = N / 9;

            p = p * 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 9;
        System.out.print(findNthNumber(N));
    }
}
