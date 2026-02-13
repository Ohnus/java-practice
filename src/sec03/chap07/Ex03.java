package sec03.chap07;

public class Ex03 {
    public static void main(String[] args) {
        //  💡 실수 다양하게 포매팅하기
        String[] fltFormats = {
                "%f",       // 1. 기본 (소수점 6자리, 0으로 메움, 반올림)
                "%.2f",     // 2. 소수점 n자리까지, 반올림
                "%13.2f",   // 3. 정수자리 확보, 소수자리 제한
                "%,f",      // 4. 기본 소수점 6자리, 반올림, 쉼표
                "%+013.2f",  // 5. 양수 +, 정수자리 확보, 빈자리 0으로 채움
                "%-13.2f",  // 6. 자리수 확보, 왼쪽 정렬
        };

        String[] fltResults = new String[fltFormats.length];

        for (var i = 0; i < fltFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (var j = 0; j < 4; j++) {
                format += fltFormats[i] + " ";
            }
            format = format.trim() + "%n%n";

            System.out.printf(format, 1.2, 123.456, 1234.123456789, -123.4567);

            fltResults[i] = format.formatted(1.2, 123.456, 1234.123456789, -123.4567);
        }
    }
}
