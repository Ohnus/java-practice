package sec03.chap04;

// Boolean
public class Ex01 {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        // 부정 연산자
        boolean bool3 = !true; // f
        boolean bool4 = !false; // t

        boolean bool5 = !!bool3; // f
        boolean bool6 = !!!bool3; // t

        boolean bool7 = !(1 > 2); // t
        boolean bool8 = !((5 / 2) == 2.5); // t
        boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B')); // t
        System.out.println(3f+4.0 + " / " + 5/2);
    }
}
