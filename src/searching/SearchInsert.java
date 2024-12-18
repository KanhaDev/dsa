package searching;

public class SearchInsert {

	public static void main(String[] args) {
		int[] nums = new int[] {3,5,7,9,10};
		int target = 8;
		System.out.println(searchInsert(nums,target));

	}
	public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
//            System.out.println("high: "+high+"low: "+low+"mid: "+mid);
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
            if(low == high)
            {
                if(target > nums[low])
                    return low+1;
                else
                    return Math.max(low,0);
            }
        }
        return low;
    }

}
