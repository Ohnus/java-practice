package sec03.chap08;

public class Ex06 {
    public static void main(String[] args) {
        //  상수 배열의 경우
        final int[] NUMBERS = {1, 2, 3, 4, 5};

        //  ⚠️ 다른 배열을 할당하는 것은 불가
        // -> 변수의 참조 값 변경이 불가능, 상수이기 때문.
        // NUMBERS = new int[] {2, 3, 4, 5, 6};

        //  ⭐️ 배열의 요소를 바꾸는 것은 가능
        // -> 힙에 있는 값 수정만 되고 참조 값은 그대로이기 때문에 가능
        NUMBERS[0] = 11;
    }
}
