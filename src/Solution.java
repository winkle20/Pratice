import java.util.HashMap;

class Solution
{
   public int singleNumber( int[] nums )
   { 
      HashMap<Integer, Integer> m = new HashMap<>(); 
      long sum1 = 0, sum2 = 0; 
      for (int i = 0; i < nums.length; i++) 
      { 
          if (!m.containsKey(nums[i])) 
          { 
              sum1 += nums[i]; 
              m.put(nums[i], 1); 
          } 
          sum2 += nums[i]; 
      } 

      // applying the formula. 
      return (int)(2 * (sum1) - sum2); 
      
   }

   public static void main( String[] args )
   {
      Solution s = new Solution();
      int[] p = { 4, 4, 1, 2, 1, 2,5,6};
      System.out.print( s.singleNumber( p ) );
   }
}