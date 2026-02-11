package sec03.chap03;

public class Ex01 {
    public static void main(String[] args) {
        //  각 문자는 상응하는 정수를 가짐
        char ch1 = 'A'; // 65
        char ch2 = 'B'; // 66
        char ch3 = 'a'; // 97
        char ch4 = 'a' + 1; // 98
        char ch5 = '가'; // 44032
        char ch6 = '가' + 1;
        char ch7 = '가' + 2;
        char ch8 = '가' + 3;
        char ch9 = '나'; // 45208

        int ch1Int = (int) ch1; // 65
        int ch9Int = (int) ch9; // 45208

        // --------------------------------------

        // 문자 리터럴과 숫자, 유니코드로 표현 가능
        char ch10 = 'A'; // 65
        char ch11 = 65; // A
        char ch12 = '\u0041'; // A
        System.out.println(ch11);
    }
}
