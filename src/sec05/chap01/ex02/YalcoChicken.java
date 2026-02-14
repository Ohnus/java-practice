package sec05.chap01.ex02;

// 클래스 = 본사
public class YalcoChicken {
    // 인스턴스가 가질 필드(filed)들
    int no;
    String name;

    // 생성자 만들지 않음
    // => 그래도 다른 클래스에서 new로 객체 생성+디폴트 생성자 호출은 가능
    // => 이후 코드 실행하며 컴파일 과정에서 컴파일러가 디폴트 생성자 생성
    // => 해당 디폴트 생성자가 다른 클래스의 new 부분에서 쓰이는 것
    
    // 인스턴스가 가질 메서드
    String intro() {
        return "안녕하세요. %d호 %s점입니다.".formatted(no, name);
    }
}
