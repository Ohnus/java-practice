package sec05.chap03.ex02;

public class Ex02 {
    public static void main(String[] args) {

        StaticChicken store1 = new StaticChicken("의정부");
        StaticChicken store2 = new StaticChicken("남양주");
        StaticChicken store3 = new StaticChicken("포천");

        System.out.println(store1.intro());
        System.out.println(store2.intro());
        System.out.println(store3.intro());
    }
}
