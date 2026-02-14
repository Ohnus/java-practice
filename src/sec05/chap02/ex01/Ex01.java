package sec05.chap02.ex01;

import java.lang.reflect.Array;

public class Ex01 {
    public static void main(String[] args) {
        Slime slime1 = new Slime();
        Slime slime2 = new Slime();

        // 이 때, 인자로 넘어가는 slime1 객체의 참조 값과
        // attack 함수 내에서 쓰이는 enemy 객체 참조 값은 같은 값이다.
        // 즉 힙 내의 같은 객체를 바라 보고 있다.
        slime2.attack(slime1);

        System.out.println(slime1.hp); // 43.6
        System.out.println(slime2.hp); // 50.0
    }
}
