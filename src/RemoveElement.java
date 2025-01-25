public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int targetPos = 0;
        for(int i = 0; i< nums.length; i++){

            if(nums[i] != val){
                nums[targetPos] = nums[i];
                targetPos++;
            }
        }
        for(int x: nums){
            System.out.print(x);
        }
        return targetPos;
    }
}
