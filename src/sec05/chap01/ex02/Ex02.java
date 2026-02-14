package sec05.chap01.ex02;

public class Ex02 {
    public static void main(String[] args) {

        // 프랜차이즈 매장
        // 클래스에 생성자를 만들지 않아도
        // 컴파일 과정에서 컴파일러가 디폴트 생성자 만듬
        YalcoChicken store1 = new YalcoChicken();
        // 인스턴스의 필드에 직접 값 넣기
        store1.no = 3;
        store1.name = "강남";

        YalcoChicken store2 = new YalcoChicken();
        store2.no = 52;
        store2.name = "구리";

        // 인스턴스 필드 접근
        int store1No = store1.no;
        String store2Name = store2.name;

        // 인스턴스의 메서드 호출
        String store1Intro = store1.intro();
        System.out.println(store1Intro);

    }
}
