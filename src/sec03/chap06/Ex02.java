package sec03.chap06;

// 빈 문자열 여부, 트리밍
public class Ex02 {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = " \t\n";

        int int1 = str1.length(); // 0
        int int2 = str2.length(); // 3(스페이스 + 탭 + 엔터)

        //  💡isEmpty : 문자열의 길이가 0인지 여부
        boolean bool1 = str1.isEmpty(); // t
        boolean bool2 = str2.isEmpty(); // f

        //  💡isBlank : 공백(white space)을 제외한 문자열의 길이가 0인지 여부
        boolean bool3 = str1.isBlank(); // t
        boolean bool4 = str2.isBlank(); // t

        // ------------------------------------------

        // 트리밍
        String str3 = "\t 자 바 공 부 중!! \n";

        //  💡 trim : 앞뒤의 공백(white space) 제거
        String str4 = str3.trim(); // "자 바 공 부 중!!"

        //  변수 그 자체에 적용하기
        //  - 문자열은 불변 : 변수가 가리키는 종이를 바꾸는 것
        str3 = str3.trim();
    }
}
