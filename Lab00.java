public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;
      String y = "hello";
      double z = 9.8;

      System.out.println("x: " + x + " y: " + y + " z: " + z);

      int[] nums = {3, 6, -1, 2};

      for(int i = 0; i < nums.length; i++)
         System.out.println(nums[i]);

      int numFound = charCount(y, 'l');
      System.out.println("Found: " + numFound);

      for(int i = 1; i <= 10; i++)
      {
         System.out.print(i + " ");
         if(i == 10)
            System.out.println();
      }




   }

   public static int charCount(String str, char chr)
   {
      int count = 0;
      for(int i = 0; i < str.length(); i++)
      {
         if(str.charAt(i) == chr)
            count++;
      }
      return count;


   }
}
