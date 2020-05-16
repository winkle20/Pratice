import java.util.Arrays;

public class LastAllZeros
{

   public  int[] moveZeroes( int[] nums )
   {
      int size = nums.length;
      int count = 0 ;
      for ( int i = 0; i < nums.length; i++ )
      {
         if ( nums[ i ] != 0 )
            nums[ count++ ] = nums[ i ];
      }
      while (count < size) 
         nums[count++] = 0; 
      return nums;

   }

   public static void main( String[] args )
   {
      LastAllZeros s = new LastAllZeros();
      int[] p = { 0,0,1 };
      System.out.print(  Arrays.toString( s.moveZeroes( p ) )  );
   }


}
