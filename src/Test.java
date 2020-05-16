

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test
{
   public static int stringOcr( String findS, String from )
   {
      int count = -1;
      int countFinal = 0;
      if ( from != null && from.trim().length() > 0 && from.length() >= findS.length() )
      {

         int lenFrom = from.length();
         int findLen = findS.length();
         String s = from;
         int i = 0;
         while ( i <= lenFrom - findLen )
         {
            if ( findS.equals( s.substring( i, i + findLen ) ) )
            {

               countFinal++;
            }
            i++;
         }

      }
      return countFinal > 0 ? countFinal : count;
   }

   public static void main( String[] args ) throws IOException
   {
     Scanner sc = new Scanner( System.in );
      //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      String x = sc.nextLine();
      
      //int noOfString = reader.read();
      List< Integer > totalNum = new ArrayList<>();
      List< String > totalString = new ArrayList<>();
      int noOfString = 0 ; 
      if( x != null  )
      {
         noOfString = Integer.parseInt( x  );
      }

      if ( noOfString > 0  )
      {
         while ( noOfString > 0 )
         {
            String firstS = sc.nextLine();
            totalString.add( firstS );
            noOfString--;
         }
         for ( String s : totalString )
         {
            totalNum.add( stringOcr( "gfg", s ) );
         }
         if ( totalNum.size() > 0 )
         {
            for ( int no : totalNum )
            {
               System.out.println( no );
            }
         }
      }
      else
      {
         System.out.println( -1 );
      }

      // TODO Auto-generated method stub

   }

}
