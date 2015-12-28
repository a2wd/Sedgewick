import edu.princeton.cs.algs4.StdOut;

public class Example
{
  public static void main(String[] args)
  {
    if(args.length == 3)
    {
      try
      {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        if (a == b && a == c)
          StdOut.println("equal");
        else
          StdOut.println("not equal");
      }
      catch (Exception e)
      {
        StdOut.println("Usage: java-algs4 Example a b c");
        StdOut.println("where a, b and c are integers");
      }
    }
  }
}
