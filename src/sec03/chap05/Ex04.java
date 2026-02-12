package sec03.chap05;

public class Ex04 {
    public static void main(String[] args) {
        //  💡 타 자료형으로부터 문자열로 변환
        String str1 = String.valueOf(true); //true
        String str2 = String.valueOf(false); // false
        String str3 = String.valueOf(123); // "123"
        String str4 = String.valueOf(3.14f); // "3.14"
        String str5 = String.valueOf('가'); // "가"
        String str6 = String.valueOf(123456L); // "123456"
        String str7 = true + ""; // "true"
        String str8 = 123.45 + ""; // "123.45

        // ----------------------------------------------------

        String str123 = "123";

        //  문자열을 정수 자료형으로 변환하기
        byte bytNum = Byte.parseByte(str123); // 123
        short srtNum = Short.parseShort(str123); // 123
        int intNum = Integer.parseInt(str123); // 123
        long lngNum = Long.parseLong(str123); // 123

        // ----------------------------------------------------

        //  대소문자 무관 'true'일 때 true 반환
        boolean bool1 = Boolean.parseBoolean("TRUE"); // true
        boolean bool2 = Boolean.parseBoolean("true"); // true
        boolean bool3 = Boolean.parseBoolean("T"); // false

        // ----------------------------------------------------

        //  다음 강에 배울 메소드
        String strA = "ABC";

        char chr = strA.charAt(1); // 'B'
        int charToInt = (int) chr; // 66

        // ----------------------------------------------------

        //  ⚠️ 런타임 에러 발생. 하나씩 주석해제해서 테스트
        //  '실행'으로 테스트하거나, 디버그 후 콘솔 탭에서 확인해볼 것

        // byte bytNum2 = Byte.parseByte("12345"); // Value out of range. Value:"12345"
        // int intNum2 = Integer.parseInt("123.45"); // For input string: "123.45"
        // double dblNum2 = Integer.parseInt("하나"); // For input string: "하나"
    }
}
