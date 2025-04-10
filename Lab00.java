public class Lab00 {
   public static int char_count(String s, char c) {
      int count = 0;
      for (char ch : s.toCharArray()) {
         if (ch == c) {
            count++;
         }
      }
      return count;
   }

   public static void main(String[] args) {
      // declaring and initializing some variables
      int x = 5;
      String y = "hello";
      float z = 9.8f;

      // printing the variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);

      // a list (make an array in java)
      int[] nums = {3, 6, -1, 2};
      for (int number : nums) {
         System.out.println(number);
      }


      int num_found = char_count(y, 'l');
      System.out.println("Found: " + num_found);

      // a counting for loop
      for (int i = 1; i < 11; i++) {
         System.out.print(i + " ");
      }
   }
}
