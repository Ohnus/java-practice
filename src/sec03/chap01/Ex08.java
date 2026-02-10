package sec03.chap01;

// 단항 연산자
public class Ex08 {
    public static void main(String[] args) {
        int int1 = 3;

        // 후위 연산자는 그 행에서는 원래의 값, 코드가 끝나는 ; 기준으로 값 증감
        int int2 = int1++; // 이 행 까지는 int1 = 3, int2 = 3
        // 이 행에서 int1 = 4

        // 전위 연산자는 그 즉시 값 증감
        int int3 = ++int1; // 이 행에서 int1 = 5, int3 = 5
        int int4 = -(int2-- * --int3); // 이 행에서 int2 = 3, int3 = 4, int4 = -12
        // 최종적으로,
        // int1 = 5
        // int2 = 2
        // int3 = 4
        // int4 = -12

        // ----------------------------------------
        int x = 1;

        //  메서드 안으로도 '반환'되어 사용되는 것
        System.out.println(x++); // 이 행에서 x = 1
        // 여기서 x = 2
        System.out.println(++x); // ++x를 통해 이 행에서 x = 3
        System.out.println(x); // x = 3

        // ----------------------------------------
        //  ⚠️ 리터럴에는 사용 불가
        // int int5 = 3++;
        // int int6 = --3;
    }
}
