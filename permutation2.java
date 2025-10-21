import java.util.*;
public class permutation2 {
 
     

    


    
    // Recursive function to generate permutations
    private static void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            // Copy current permutation into ans
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Generate permutations by swapping elements
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);              // swap current element with index
            recurPermute(index + 1, nums, ans); // recurse for next index
            swap(i, index, nums);              // backtrack (undo the swap)
        }
    }

    // Swap helper function
    private static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Function to return all permutations
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans);
        return ans;
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = permute(nums);

        // Print all permutations
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
   
    
    
}

    

