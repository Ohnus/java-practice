package sec05.chap01.ex03;

public class YouKnowChicken {
    int no;
    String name;

    // 생성자(constructor) : 인스턴스를 만들기 위함(안만들면 컴파일 과정에서 디폴트 생성자 생성)
    // this: 생성될 인스턴스를 가리킴
    public YouKnowChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    String intro() {
        return "안녕하세요. %d호 %s점입니다.".formatted(no, name);
    }
}
