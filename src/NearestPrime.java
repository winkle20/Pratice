
public class NearestPrime
{
   
   public static int findPrime(int n )
   {
      int nearestPrime = 0;
      int diff = 1;
      if ( n <= 1 )
      {
         return n;
      }
      while ( nearestPrime == 0 )
      {
         if ( !isPrime( n - diff ) )
         {
            if ( isPrime( n + diff ) )
            {
               nearestPrime = n + diff;
            }
         }
         else
         {
            nearestPrime = n - diff;
         }
         diff++;

      }

      return nearestPrime;
   }
   
   public static boolean isPrime(int num)
   {
      for ( int i = num - 1; i >= 2; i-- )
      {
         if ( num % i == 0 )
         {
            return false;
         }
      }
      return true;
   }
   
   
   public static void  main(String[] args)
   {
      
      
   }

}
