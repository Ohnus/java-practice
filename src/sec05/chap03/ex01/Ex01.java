package sec05.chap03.ex01;

public class Ex01 {
    public static void main(String[] args) {
        // 클래스/정적 필드와 메서드는 인스턴스 생성 없이 사용
        String brandName = OdoongChicken.brand;
        String contactMsg = OdoongChicken.contact();

        // 인스턴스/멤버 변수, 메서드는 사용 불가
        // String storeName = OdoongChicken.name;
        // String intro = OdoongChicken.intro();

        OdoongChicken store1 = new OdoongChicken(52, "노원");
        String store1Intro = store1.intro();

        System.out.println(store1.brand);
        System.out.println(OdoongChicken.brand);
        OdoongChicken.brand = "오리치킨";
        System.out.println(store1.brand);
        System.out.println(OdoongChicken.brand);

        // 인스턴스에서 클래스 필드와 메서드 사용 가능하지만,
        // 편의상 기능일 뿐 권장하지는 않음
        String store1Brand = store1.brand; // 권장 x
        String store1Brand2 = OdoongChicken.brand; // 권장 o
    }
}
