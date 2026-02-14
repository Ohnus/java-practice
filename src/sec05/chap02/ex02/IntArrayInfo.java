package sec05.chap02.ex02;

public class IntArrayInfo {
    int count;
    int max;
    int min;
    int sum; // 기본 0
    double average;

    public IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for(int num : nums){
            max = max > num ? max : num;
            min = min < num ? min : num;
            sum += num;
        }
        average = sum * 1.0 / nums.length;
    }
}
