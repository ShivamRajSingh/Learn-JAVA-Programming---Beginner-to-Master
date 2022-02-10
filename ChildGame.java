// Java code for Maximize number of 0s by flipping
// a subarray
class ChildGame {
	
	// A Kadane's algorithm based solution to find maximum
	// number of 0s by flipping a subarray.
	public static int findMaxOnesCount(int arr[], int n)
	{
		// Initialize count of zeros and maximum difference
        // between count of 1s and 0s in a subarray
        int orig_ones_count = 0;
      
        // Initiale overall max diff for any subarray
        int max_diff = 0;
      
        // Initialize current diff
        int curr_max = 0;
      
        for (int i = 0; i < n; i ++)
        {
            // Count of zeros in original array (Not related
            // to Kadane's algorithm)
            if (arr[i] == 1)
               orig_ones_count ++;
      
            // Value to be considered for finding maximum sum
            int val = (arr[i] == 0)? 1 : -1;
      
            // Update current max and max_diff
            curr_max = Math.max(val, curr_max + val);
            max_diff = Math.max(max_diff, curr_max);
        }
        max_diff = Math.max(0, max_diff);
      
        return orig_ones_count + max_diff;
	}
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int arr[] = {1,0, 1,1,1};
		
		System.out.println(findMaxOnesCount(arr, arr.length));
	}
}
// This code is contributed by Arnav Kr. Mandal.
