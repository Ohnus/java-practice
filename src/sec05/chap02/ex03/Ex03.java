package sec05.chap02.ex03;

public class Ex03 {
    public static void main(String[] args) {
        ChickenMenu[] menus = {
                new ChickenMenu("후라이드", 12000),
                new ChickenMenu("양념치킨", 13000),
                new ChickenMenu("화덕치킨", 14000, "bake")
        };

        AppleChicken store1 = new AppleChicken(5, "강북", menus);

        ChickenMenu order1 = store1.orderMenu("양념치킨");
        ChickenMenu order2 = store1.orderMenu("후라이드");

        System.out.println(order1.price);
        System.out.println(order2.price);

        System.out.println("\n- - - - -\n");

        int int1 = 1;
        int int2 = int1;
        int1 = 2;

        String str1 = "헬로";
        String str2 = str1;
        str2 = "월드";

        ChickenMenu menu1 = new ChickenMenu("후라이드", 1000);
        ChickenMenu menu2 = menu1;
        menu1.price = 1200;
        System.out.println(menu2.price); // 1200

        int avgChickenPrice = 12000;

        ChickenMenu chickenMenu1 = new ChickenMenu("마늘치킨", 15000);

        raisePrice(avgChickenPrice, chickenMenu1, 1000);
    }

    public static void raisePrice(int avg, ChickenMenu menu, int amount) {
        avg += amount;
        menu.price += amount;
    }
}
