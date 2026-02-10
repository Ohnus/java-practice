package sec03.chap01;

// 정수 자료형과 관련 연산자
public class Ex01 {
    public static void main(String[] args) {
        // 1비트는 0과 1
        // 1바이트는 8비트
        byte _1b_byte = 1; // 1바이트 (-2^7 ~ 2^7-1)
        short _2b_short = 2; // 2바이트 (-2^15 ~ 2^15-1)
        // 일반적으로 널리 사용되는 자료형
        int _4b_int = 3; // 4바이트 (-2^31 ~ 2^31-1) (-21억~21억)
        long _8b_long = 4; // 8바이트 (-2^63 ~ 2^63-1)


        // 자료형의 범주 외의 수를 담을 수 없음
        byte overByte1 = 127;
        // byte overByte2 = 128; // 불가능
        byte overByte3 = -128;
        // byte overByte4 = -129; // 불가능


        // 큰 자료형에 작은 자료형의 값을 넣을 수 있음
        // 묵시적(암시적) 형변환
        // => byte였던 1이 short 변수 값에 할당되며 short 자료형의 1이 됨
        _2b_short = _1b_byte;
        _4b_int = _1b_byte;
        _4b_int = _2b_short;
        _8b_long = _1b_byte;
        _8b_long = _2b_short;
        _8b_long = _4b_int;

        // 작은 자료형에 큰 자료형의 값을 '그냥' 넣을 수 없음
        // 들어있는 값의 크기와 무관
        // _1b_byte = _2b_short; _1b_byte = _4b_int; _1b_byte = _8b_long;
        // _2b_short = _4b_int; _2b_short = _8b_long;
        // _4b_int = _8b_long;


        // int의 범위를 벗어나는 수에는 리터럴에도 명시 필요
        // 끝에 L을 붙여 볼 것
        // 즉, long 타입에 L 안붙이고 초기화하면 묵시적 형변환으로 int 타입 값이 들어감
        long _8b_long1 = 123456789123456789L;

        // 가독성을 위해 아래와 같이 표현 가능 (자바7부터)
        int _4b_int2 = 123_456_789;
        long _8b_long2 = 123_456_789_123_456_789L;

    }
}
