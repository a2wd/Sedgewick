public class Fundamentals {

  public static int gcd(int p, int q) {
    if (q == 0) return p;
    int r = p % q;
    return gcd(q, r);
  }

  public static void main(String[] args) {
    int i = 7;
    int j = 14;
    System.out.print("The greatest common denominator of: ");
    System.out.print("i (" + i + ") and j (" + j + ") is: ");
    System.out.println(gcd(i, j));

    return;
  }
}
