package sec03.chap04;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4;

        char num1OE = num1 % 2 == 1 ? '홀' : '짝'; // 홀
        char num2OE = num2 % 2 == 1 ? '홀' : '짝'; // 짝

        // 삼항 연산자 중첩
        // 연산 이어지는 곳까지만 고
        int num = 3;
        //  아래 값들을 바꿔가며 실행해 볼 것
        boolean mult2 = false;
        //mult2 = false;

        boolean plus5 = false;
        //plus5 = false;

        System.out.println(
                (!mult2 && !plus5) ? num // t => 3
                        : (mult2 && plus5) ? num * 2 + 5
                        : mult2 ? num * 2
                        : num + 5
        );
        // t, t => 11
        // t, f => 6
        // f, t => 8
        // f, f => 3

        // 단축평가 적용
        int x = 1, y = 2;

        //  💡 단축평가 적용됨
        int changed1 = x < y ? (x += 2) : (y += 2); // t => x=3, y=2 => 3
        int changed2 = x < y ? (x += 2) : (y += 2); // f => x=3, y=4 => 4
        int changed3 = x < y ? (x += 2) : (y += 2); // t => x=5, y=4 => 5
        int changed4 = x < y ? (x += 2) : (y += 2); // f => x=5, y=6 => 6
        int changed5 = x < y ? (x += 2) : (y += 2); // t => x=7, y=6 => 7
    }
}
