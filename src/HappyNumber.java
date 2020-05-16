
public class HappyNumber
{
   public boolean isHappy( int n )
   {
      int sum = n;
      while ( sum != 1 )
      {
         int lastNum = sum % 10;
         int first = sum / 10;
         sum = ( lastNum * lastNum );
         if ( ( first / 10 ) != 0 )
         {
            int total = first ;
            while ( total != 0 )
            {
               int x = total % 10;
               sum += x * x;
               total = total / 10;
            }

         }
         else
         {
            sum += ( first * first );
         }
         if ( sum != 1 &&( sum == n || sum == 4 ) )
         {
            return false;
         }
      }

      return sum == 1 ? true : false;
   }

   public static void main( String[] args )
   {
      HappyNumber s = new HappyNumber();
      System.out.print( "is treu " + s.isHappy(2) );
   }

}
