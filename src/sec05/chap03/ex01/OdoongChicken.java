package sec05.chap03.ex01;

public class OdoongChicken {
    // 클래스/정적 필드와 메서드들 : 본사의 정보와 기능
    static String brand = "오둥치킨";
    static String contact() {
        // 정적 메서드에서는 인스턴스 변수 사용 불가능
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }

    int no;
    String name;

    public OdoongChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // 인스턴스 메서드에서는 정적 프로퍼티 사용 가능
    String intro() {
        return "안녕하세요. %s %d호 %s점입니다."
                .formatted(brand, no, name);
    }
}
