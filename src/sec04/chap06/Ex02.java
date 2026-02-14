package sec04.chap06;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int intNum = 3;
        modifyIntArg(intNum);

        int[] intNums = {1, 2, 3};
        //  배열은 참조형이지만 그 안의 값들은 원시형
        modifyIntArg(intNums[0]);

        //  참조형인 배열 자체를 인자로 사용
        modifyAryElem(intNums);
        System.out.println(Arrays.toString(intNums));
    }

    //  ⭐️ 원시 값은 '복사해서' 스택에 새로운 변수로 생성
    //  따라서 메소드 내부에서 값을 변경해도 원본에 영향 끼치지 않음
    static void modifyIntArg (int num) {
        System.out.printf("수정 전: %d%n", num++);
        System.out.printf("수정 후: %d%n", num);
    }

    //  ⭐️ 참조 값은 주소 값이므로 둘 모두 힙의 같은 객체를 바라봄
    //  메서드 내에서 배열 요소를 수정하면 둘이 바라보는 힙의 객체가 수정되는 것
    static  void modifyAryElem (int[] ary) {
        System.out.printf("수정 전: %d%n", ary[1]++);
        System.out.printf("수정 후: %d%n", ary[1]);
    }
}
