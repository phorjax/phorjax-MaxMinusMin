
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int min = nums.get(0);
        int max = nums.get(0);
        for (int index = 1; index < nums.size(); index++) {
            int container = nums.get(index);
            if (nums.get(index) < min) {

                min = container;
            }
        }
        for (int i = 1; i < nums.size(); i++) {
            int container = nums.get(i);
            if (container > max) {
                max = container;
            }
        }
        int diff = max - min;
        return diff;
    }
}
