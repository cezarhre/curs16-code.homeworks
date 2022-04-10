package ro.fasttrackit.curs16.homeworks;

public class RecursiveMethods {

    public Integer sumN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal argument");
        }
        if (n == 0) {
            return 0;
        } else {
            return n + sumN(n - 1);
        }
    }

    public Integer sumEven(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal argument");
        }
        if (n < 2) {
            return 0;
        }
         if (n % 2 == 0) {
            return n + sumEven(n - 1);
        } else {
            return sumEven(n - 1);
        }
    }


    public String averseReverseString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Illegal argument");
        }
        if (str.length() <= 1) {
            return str;
        } else {
            return averseReverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public boolean firstLastLetter(String st) {
        if (st.length() <= 1) {
            return true;
        }
        if (st.charAt(0) == st.charAt(st.length() - 1)) {
            return firstLastLetter(st.substring(1, st.length() - 1));
        } else {
            return false;
        }
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    public int fibonacciArray(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciArray(n - 1) + fibonacciArray(n - 2);
        }
    }
}

