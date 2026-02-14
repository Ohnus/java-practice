package sec05.chap01.ex01;

public class Ex01 {
    public static void main(String[] args) {

        // 클래스 호출 => 객체(인스턴스) 생성 및 생성자 호출하며 인수(인자) 넘겨준다.
        Button btn1 = new Button('1', 1, "DARK");
        Button btn2 = new Button('+', 2, "DARK");
        Button btn3 = new Button('-', 3, "DARK");

        // 값(속성)을 담은 객체 내의 함수를 호출
        btn1.place();
        btn2.place();
        btn3.place();
    }
}
