/**
 * By Navi Bountho
 * The class RemoveElement contains a method called removeElement
 * that takes and integer array and int value as a inputs and returns
 * the amount of integers that are not the target value.
 * The method also moves all integers that are not equal to the target val
 * towards the right of the array.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int targetPos = 0;
        for(int i = 0; i< nums.length; i++){

            if(nums[i] != val){
                nums[targetPos] = nums[i];
                targetPos++;
            }
        }
        return targetPos;
    }
}
