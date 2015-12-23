import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class BinarySearch {
  public static int rank(int key, int[] a)
  {
    int lo = 0;
    int hi = a.length - 1;

    while(lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if(key < a[mid]) hi = mid - 1;
      else if(key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }

  public static int rankRecursive(int key, int[] a)
  {
    return rankRecursive(key, a, 0, a.length - 1);
  }

  public static int rankRecursive(int key, int[] a, int lo, int hi)
  {
    if (lo > hi) return -1;

    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) return rankRecursive(key, a, lo, mid - 1);
    else if (key > a[mid]) return rankRecursive(key, a, mid + 1, hi);
    else return mid;
  }

  public static void main(String[] args)
  {
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();

    Arrays.sort(whitelist);

    while(!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      if(rank(key, whitelist) == -1){
        StdOut.println(key);
      }
    }
  }
}
