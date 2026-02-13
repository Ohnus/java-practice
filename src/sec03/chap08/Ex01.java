package sec03.chap08;

public class Ex01 {
    public static void main(String[] args) {
        //  💡 사용할 자료형 뒤에 []를 붙여 선언
        char[] yutnori = {'도', '개', '걸', '윷', '모'};

        //  💡 length : 배열의 길이 반환
        int length = yutnori.length; // 5

        //  💡 [] 안에 인덱스 정수를 넣어 접근
        //  ⭐ 0부터 시작
        char first = yutnori[0]; // 도
        char last = yutnori[yutnori.length - 1]; // 모

        //  💡 초기화하지 않고 일단 선언하기
        //  ⭐ 어떤 값으로 초기화되는지 확인
        boolean[] boolAry = new boolean[3]; // [false, false, false]
        int[] intAry = new int[3]; // [0, 0, 0]
        double[] dblAry = new double[3]; // [0.0, 0.0, 0.0]
        char[] chrAry = new char[3]; // [ , , ]
        String[] strAry = new String[3]; // [null, null, null]
        String[] strAry2 = new String[]{}; // [];

        //  아스키 코드의 0번 글자. 문자열의 끝을 표시하는데 사용
        char NUL = chrAry[0]; // NUL 0
        char NUL2 = ' '; // Space 32

        //  다음과 같이 원하는 위치의 값 변경
        intAry[0] = 123;
        intAry[1] = 456;
        intAry[2] = 789;
    }
}
