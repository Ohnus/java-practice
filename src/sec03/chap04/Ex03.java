package sec03.chap04;

// 단축 평가(Short Circuit
public class Ex03 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

        boolean bool1 = a < b && c++ < (d += 3); // t && t(0 < 3) = t
        // a=1, b=2, c=1, d=3, e=0, f=0
        boolean bool2 = a < b || e++ < (f += 3); // a<b가 이미 t이므로 뒤 연산 x
        // a=1, b=2, c=1, d=3, e=0, f=0
        boolean bool3 = a > b && c++ < (d += 3); // a>b가 이미 f이므로 뒤 연산 x
        // a=1, b=2, c=1, d=3, e=0, f=0
        boolean bool4 = a > b || e++ < (f += 3); // f || t(0 < 3) = t
        // a=1, b=2, c=1, d=3, e=1, f=3
    }
}
