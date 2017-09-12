public class checkunique{
  // public static Boolean isUniqueChars(String str) {
  //   if (str.length()>256) {
  //     return false;
  //   }
  //
  //   int checker = 0;
  //   for (int i=0; i<str.length(); i++) {
  //     int val = str.charAt(i) - 'a';
  //     if ((checker & (1 << val)) > 0) return false ;
  //   }
  //
  //   return true;
  // }

  public static void main(String[] args) {
    String str = new String("az");

    for (int i=0; i<str.length(); i++) {
      int val = str.charAt(i) - 'a';
      System.out.println(val);
    }
  }
}
