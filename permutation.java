import java.util.ArrayList;
import java.util.List;

public class permutation {

    // Recursive helper function to generate permutations
    private void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        // Base condition: when the current list has all numbers
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds)); // add a copy of current permutation
            return;
        }

        // Try every element that hasn't been used yet
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;               // mark as used
                ds.add(nums[i]);              // choose the element
                recurPermute(nums, ds, ans, freq); // explore further
                ds.remove(ds.size() - 1);     // backtrack
                freq[i] = false;              // unmark
            }
        }
    }

    // Main function to start permutation generation
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums, ds, ans, freq);
        return ans;
    }

    // Main method: program entry point
    public static void main(String[] args) {
        permutation obj = new permutation();

        int[] nums = {1, 2, 3}; // input array
        List<List<Integer>> result = obj.permute(nums);

        System.out.println("All permutations:");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
