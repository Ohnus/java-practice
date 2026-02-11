package sec03.chap02;

import java.math.BigDecimal;

// 실수 자료형
public class Ex01 {
    public static void main(String[] args) {
        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김
        double c = a + b;

        // BidDecimal
        BigDecimal d = new BigDecimal(a+"");
        BigDecimal e = new BigDecimal(b+"");

        BigDecimal f = d.add(e);
    }
}
