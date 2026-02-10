package sec03.chap01;

// 이항 연산자 - 2
public class Ex04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //  int끼리 연산은 int 반환
        int c = a + b;

        long d = a + b;
        // short e = a + b; // ⚠️ 묵시적으로는 불가
        short f = (short) (a + b);

        byte b1 = 1;
        byte b2 = 2;
        short s1 = 1;
        short s2 = 2;

        //  ⚠️ 아래는 모두 불가
        // byte와 short 끼리의 연산은 int를 반환한다.
        // byte b3 = b1 + b2;
        // short s3 = b1 + b2;
        // short s4 = b1 + s2;
        // short s5 = s1 + s2;

        //  ⭐ byte와 short의 연산들은 int 반환
        //  => 그냥 int를 많이 쓰는 이유 중 하나
        int i1 = b1 + b2;
        int i2 = s1 + s2;
        int i3 = b1 + s1;

        // long끼리의 연산은 long 반환
        long l1 = 1;
        long l2 = 2;
        // int l3 = l1 + l2; // 불가능

        //  ⚠️ 정수 자료형의 계산은 소수점 아래를 '버림'
        byte int1 = 5/2; // int1 = 2
        int int2 = 10;
        int int3 = 3;
        int int4 = int2 / int3; // int4 = 3

        // 💡 홀수와 짝수 구분에 널리 사용
        int aa = 1 % 2; // aa = 1
        int bb = 2 % 2; // bb = 0
        int cc = 3 % 2; // cc = 1
        int dd = 4 % 2; // dd = 0
        int ee = 5 % 2; // ee = 1
        int ff = 6 % 2; // ff = 0
        int gg = 7 % 2; // gg = 1
    }
}
