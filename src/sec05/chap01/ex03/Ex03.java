package sec05.chap01.ex03;

public class Ex03 {
    public static void main(String[] args) {

        YouKnowChicken store1 = new YouKnowChicken(3, "강동");
        YouKnowChicken store2 = new YouKnowChicken(55, "강서");

        String[] intros = {store1.intro(), store2.intro()};
        for(String intro : intros) {
            System.out.println(intro);
        }
    }
}
