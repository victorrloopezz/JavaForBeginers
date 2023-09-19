public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 0;
      int number = 2;

      while (count < 100) {
         if (isPrime(number)) {
            count++;
         }
         number++;
      }

      System.out.println((number - 1));
   }

      private static boolean isPrime(int num) {
      if (num <= 1) {
         return false;
      }
      for (int i = 2; i * i <= num; i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }
}