package sec03.chap06;

public class Ex09 {
    public static void main(String[] args) {
        String str1 = "가나다라마";
        String str2 = "010-1234-5678";
        String str3 = "하나 둘 셋 넷 다섯";

        //  💡 toCharArray : 문자열을 분할하여 '문자'의 배열로 반환
        char[] chAry1 = str1.toCharArray(); // {가, 나, 다, 라, 마}
        char[] chAry2 = str3
                .replace(" ", "")
                .toCharArray(); // {하, 나, 둘, 셋, 넷, 다, 섯}

        //  💡 split : 주어진 기준으로 (~개까지) 분할하여 '문자열' 배열로 반환
        String[] strAry1 = str1.split(""); // {가, 나, 다, 라, 마}
        String[] strAry2 = str2.split("-"); // {010, 1234, 5678}
        String[] strAry3 = str3.split(" "); // {하나, 둘, 셋, 넷, 다섯}
        String[] strAry4 = str3.split(" ", 3); // {하나, 둘, 셋 넷 다섯}
    }
}
