package sec03.chap01;

// 복합 대입 연산자
public class Ex05 {
    public static void main(String[] args) {
        int a = 1;
        a = a + 2; // a = 3

        a += 3; // a = 6

        // 값을 반환하기도 함
        int b = a += 4; // a = 10, b = 10


        //  💡 추가
        //  - 일반 대입 연산자도 값을 반환함

        int i1 = 0;
        int i2 = 1;
        int i3 = (i1 = i2); // i1 = 1, i3 = 1

        String s1 = "ABC";
        String s2 = "가나다";
        String s3 = (s1 = s2); // s1 = "가나다", s3 = "가나다"
    }
}
