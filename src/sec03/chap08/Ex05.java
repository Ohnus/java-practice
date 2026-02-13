package sec03.chap08;

public class Ex05 {
    public static void main(String[] args) {
        //  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐
        // => 리터럴로 하면 힙의 String pool에 저장

        // 문자열은 불변 성격
        String str1 = "코인 함";
        String str2 = "관심 없음";
        str2 = str1; // 참조 값 복사, 여기선 str2도 "코인 함" 바라봄, "관심 없음"은 CG 대상
        System.out.println(str2); // 코인 함

        str1 = "고점에 익절"; // 리터럴로 String pool에 새로운 객체 값 생성 및 참조 값 생성
        // str2는 여전히 "코인 함" 보는 중
        System.out.println(str1); // 고점에 익절
        System.out.println(str2); // 코인 함
    }
}
