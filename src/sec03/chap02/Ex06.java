package sec03.chap02;

// 비교연산
public class Ex06 {
    public static void main(String[] args) {
        int int1 = 5;
        float flt1 = 5f;
        double dbl1 = 5.0;
        double dbl2 = 7.89;

        //  💡 정수/실수간, 다른 숫자 자료형간 사용 가능
        boolean bool0 = 123 == 123F; // t

        boolean bool1 = int1 == flt1; // t
        boolean bool2 = flt1 == dbl1; // t
        boolean bool3 = int1 == dbl2; // f

        boolean bool4 = int1 > dbl2; // f
        boolean bool5 = flt1 >= dbl2; // f
        boolean bool6 = dbl1 < dbl2; // t
    }
}
