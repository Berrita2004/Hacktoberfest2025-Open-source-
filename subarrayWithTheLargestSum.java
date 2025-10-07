class Main {
    public int maxSubArray(int[] nums) {
        int maxi = nums[0];
      //empty array
        int sum= 0 ;
        int n = nums.length; //find the length of the nums
        for ( int i = 0 ; i < n ; i ++){//loop beings
            sum += nums[i]; 
            maxi = Math.max(maxi, sum);
          
            if (sum < 0 ){//condition to never hit zero
                sum = 0 ; 
            }
        }
        return maxi ; 
    }
}
