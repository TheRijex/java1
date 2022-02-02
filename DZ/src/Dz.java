public class Dz {
    public static void main(String[] args) {
        int[] nums = new int[1000];
        int[] reverNum = new int[nums.length];

        for (int i = 0; i<1000; i++){
            nums[i] = i;
        }

        for (int i = 0, j = 999; i < 1000; i++, j--){
            reverNum[i] = nums[j];
        }
        for(int i : reverNum){
            System.out.println(reverNum[i]);
        }
    }
}
