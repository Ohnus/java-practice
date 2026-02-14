package sec05.chap01.ex01;

// 클래스는 객체다.
// 반복되는 코드를 줄이고, 값(속성), 함수(기능) 등을 동일하고 안전하게 사용하기 위함
public class Button {

    char print;
    int space;
    String mode;

    // 생성자: 다른 클래스에서 해당 클래스를 객체(인스턴스)로서 호출하기 위함
    Button(char print, int space, String mode) {
//        this.print = print;
//        this.space = space;
//        this.mode = mode;
    }

    // 메서드: 해당 클래스의 속성을 조작하기 위한 객체 내 함수
    void place() {
        System.out.printf(
                "표시: %c , 공간: %d, 모드: %s%n",
                print, space, mode
        );
    }
}
