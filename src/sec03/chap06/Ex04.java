package sec03.chap06;

public class Ex04 {
    public static void main(String[] args) {
        //  💡 equals : 대소문자 구분하여 비교
        String str_a1 = "Hello World";
        String str_a2 = new String("Hello World");
        String str_a3 = "HELLO WORLD";

        // ⚠️ 문자열은 이렇게 비교하지 말 것!
        boolean bool_a0 = str_a1 == str_a2;

        boolean bool_a1 = str_a1.equals(str_a2); // t
        boolean bool_a2 = str_a1.equals(str_a3); // f

        //  💡 equalsIgnoreCase : 대소문자 구분하지 않고 비교
        boolean bool_a3 = str_a1.equalsIgnoreCase(str_a3); // t
        boolean bool_a4 = str_a2.equalsIgnoreCase(str_a3); // t

        // -------------------------------------------

        // 포함 여부 확인
        String str_b1 = "옛날에 호랑이가 한 마리 살았어요.";

        //  💡 contains : 포함 여부
        boolean bool_b1 = str_b1.contains("호랑이"); // t
        boolean bool_b2 = str_b1.contains("나무꾼"); // f

        //  💡 startsWith : (주어진 위치에서) 해당 문자열로 시작 여부
        boolean bool_b3 = str_b1.startsWith("옛날에"); // t
        boolean bool_b4 = str_b1.startsWith("호랑이"); // f
        boolean bool_b5 = str_b1.startsWith("호랑이", 4); // t

        //  💡 endsWith : 해당 문자열로 끝남 여부
        boolean bool_b6 = str_b1.endsWith("살았어요."); // t
        boolean bool_b7 = str_b1.endsWith("호랑이"); // f

        // -------------------------------------------

        // 정규 표현식 일치 여부 확인
        // (\w : 영문자or숫자or_ | - : 하이픈 | . : 점) 중에 1개 이상
        // @[] : 골뱅이 한 번
        // 해당 문자열 한 번만 검사하고 다음 문자열 . 찍고 시작할거면 [] + \.[]
        // .을 포함한 해당 문자열 1번 이상 반복 검사할거면 ([..]+\.) + []
        // {2,4} 2~4글자
        String emailRegex = "^[\\w-.]+@([\\w-.]+\\.)+[\\w-]{2,4}$";

        String str_c1 = "y-a_l.co@ya_l-co.co.kr";
        String str_c2 = "yalco.yalco.kr";
        String str_c3 = "yalco@yalco@kr";

        boolean bool_c1 = str_c1.matches(emailRegex); // t
        boolean bool_c2 = str_c2.matches(emailRegex); // f
        boolean bool_c3 = str_c3.matches(emailRegex); // f
    }
}