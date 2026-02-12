package sec03.chap04;

// 논리 연산자
public class Ex02 {
    public static void main(String[] args) {
        boolean bool1 = true && true; // t
        boolean bool2 = true && false; // f
        boolean bool3 = false && true; // f
        boolean bool4 = false && false; // f

        boolean bool5 = true || true; // t
        boolean bool6 = true || false; // t
        boolean bool7 = false || true; // t
        boolean bool8 = false || false; // f

        int num = 4;

        boolean isPositiveAndOdd = num >= 0 && num % 2 == 1; // f
        boolean isPositiveOrOdd = num >= 0 || num % 2 == 1; // t

        boolean isPositiveAndEven = num >= 0 && num % 2 == 0; // t
        boolean isPositiveOrEven = num >= 0 || num % 2 == 0; // t

        //  💡 &&가 ||보다 우선순위 높음
        num = 6;

        boolean boolA = (num % 3 == 0) && (num % 2 == 0) || (num > 0) && (num > 10); // t
        boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10); // f
    }
}
