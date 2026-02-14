package sec05.chap02.ex02;

public class Ex02 {
    public static void main(String[] args) {
        int[] ary1 = {3, 5, 9, 2, 8, 1, 4};
        int[] ary2 = {382, 194, 27, 915, 138};

        IntArrayInfo arr1 = new IntArrayInfo(ary1);
        IntArrayInfo arr2 = new IntArrayInfo(ary2);

        int arr1Max = arr1.max;
        double ary2Avg = arr2.average;
        int ary1n2Sum = arr1.sum + arr2.sum;
    }
}
