import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;

public class DrawingExamples
{
  public static void drawFunctionValues(int N)
  {
    StdDraw.setXscale(0, N);
    StdDraw.setYscale(0, N);
    StdDraw.setPenRadius(.01);

    for (int i = 0; i <= N; i++)
    {
      StdDraw.point(i, i);
      StdDraw.point(i, i*i);
      StdDraw.point(i, i * Math.log(i));
    }
  }

  public static void drawRandomArray(int N)
  {
    StdDraw.setXscale(0, N/8);
    StdDraw.setYscale(0, N/8);

    double[] a = new double[N];
    for (int i = 0; i < N; i++)
      a[i] = StdRandom.random();

    for (int i = 0; i < N; i++)
    {
      double x = 1.0 * i / N;
      double y = a[i] / 2.0;
      double rw = 0.5 / N;
      double rh = a[i] / 2.0;
      StdDraw.filledRectangle(x, y, rw, rh);
    }
  }

  public static void drawSortedArray(int N)
  {
    double[] a = new double[N];
    for (int i = 0; i < N; i++)
      a[i] = StdRandom.random();

    Arrays.sort(a);

    for (int i = 0; i < N; i++)
    {
      double x = 1.0 * i / N;
      double y = a[i] / 2.0;
      double rw = 0.5 / N;
      double rh = a[i] / 2.0;
      StdDraw.filledRectangle(x, y, rw, rh);
    }
  }

  public static void printUsage()
  {
    StdOut.println("Usage: java-algs4 DrawingExamples N");
    StdOut.println("Where N is an integer");
  }

  public static void waitForInput()
  {
    while(!StdDraw.hasNextKeyTyped());

    StdDraw.nextKeyTyped();
    StdDraw.clear();
  }

  public static void main(String[] args)
  {
    if (args.length != 1) {
      printUsage();
      return;
    }

    int N;
    try
    {
      N = Integer.parseInt(args[0]);
    }
    catch (NumberFormatException e)
    {
      printUsage();
      return;
    }

    drawFunctionValues(N);
    waitForInput();

    drawRandomArray(N);
    waitForInput();

    drawSortedArray(N);
    waitForInput();
  }
}
