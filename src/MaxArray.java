
public class MaxArray
{
   public int maxSubArray( int[] nums )
   {
// add line

      int max_so_far = nums[0]; 
      int curr_max = nums[0]; 
    
      for (int i = 1; i < nums.length; i++) 
      { 
             curr_max = Math.max(nums[i], curr_max+nums[i]); 
          max_so_far = Math.max(max_so_far, curr_max); 
      } 
      return max_so_far; 
      

   }

   public static void main( String[] args )
   {
      MaxArray s = new MaxArray();
      int[] p = { 5,4,0,3,0,2 };
      System.out.print( s.maxSubArray( p ) );
   }
}
