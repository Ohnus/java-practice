package sec03.chap02;

public class Ex05 {
    public static void main(String[] args) {
        int int1 = 5;
        float flt1 = 2f;
        double dbl1 = 3;
        double dbl2 = 7;

        //  💡 정수 자료형과 실수 자료형의 계산은 실수 반환
        // int flt2 = int1 / flt1; // ⚠️ 불가
        float flt2 = int1 / flt1; // 가능
        double dbl3 = int1 / dbl1;
        double dbl4 = dbl2 / int1;

        //  💡 리터럴로 작성시 double임을 명시하려면 .0을 붙여줄 것
        double dbl5 = 5 / 2; // 2.0
        double dbl6 = 5.0 / 2; // 2.5
        double dbl7 = (double) 5 / 2; // 2.5

        int int2 = 5;
        int int3 = 2;
        double dbl8 = int2 / int3; // 2.0
        double dbl9 = (double) int2 / int3; // 2.5

        //  💡 정수 자료형에 강제로 넣으면 소수부를 '버림'
        float fltNum = 4.567f;
        double dblNum = 5.678;

        int int4 = (int) fltNum; // 4
        int int5 = (int) dblNum; // 5
    }
}
