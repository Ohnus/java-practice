package sec03.chap06;

// 문자열 비교
public class Ex05 {
    public static void main(String[] args) {
        String str_a1 = "ABC";
        String str_a2 = "ABCDE";
        String str_a3 = "ABCDEFG";
        String str_a4 = "ABF";

        //  💡 compareTo : 사전순 비교에 따라 양수 또는 음수 반환

        //  같은 문자열이면 0 반환
        int int_a1 = str_a1.compareTo(str_a1); // 0

        //  시작하는 부분이 같을 때는 글자 길이의 차이 반환
        int int_a2 = str_a1.compareTo(str_a2); // 3 - 5 = -2
        int int_a3 = str_a1.compareTo(str_a3); // 3 - 7 = -4
        int int_a4 = str_a2.compareTo(str_a3); // 5 - 7 = -2
        int int_a5 = str_a3.compareTo(str_a1); // 7 - 3 = 4

        String str_a5 = "HIJKLMN";

        //  시작하는 부분이 다를 때는 첫 글자의 정수값 차이 반환
        int int_a6 = str_a1.compareTo(str_a5); // 65 - 72 = -7
        int int_a7 = str_a5.compareTo(str_a3); // 72 - 65 = 7

        // 길이가 같을 때, 문자열이 같다가 달라지는 부분이 있으면 해당 부분 정수값 차이 반환
        int int_a8 = str_a1.compareTo(str_a4); // 67 - 70 = -3

        String str_b1 = "abc";
        String str_b2 = "DEF";

        int int_b1 = str_b1.compareTo(str_b2); // 97 - 68 = 29

        //  💡 compareToIgnoreCase : 대소문자 구분 없이 비교
        int int_b2 = str_b1.compareToIgnoreCase(str_b2); // 97 - 100 = -3
    }
}
