import edu.princeton.cs.algs4.StdOut;

public class ArrayBasics
{
  static double arrayMax(double[] arr)
  {
    double max = 0.0;
    for(int i = 0; i < arr.length; i++)
      if(arr[i] > max) max = arr[i];

    return max;
  }

  static double arrayAve(double[] arr)
  {
    double sum = 0.0;
    for(int i = 0; i < arr.length; i++)
      sum += arr[i];

    return sum / arr.length;
  }

  static double[] arrayCopy(double[] arrIn)
  {
    int N = arrIn.length;
    double[] arrOut = new double[N];
    for(int i = 0; i < N; i++)
      arrOut[i] = arrIn[i];

    return arrOut;
  }

  static void arrayReverse(double[] arr)
  {
    int N = arr.length;
    for (int i = 0; i < N/2; i++)
    {
      double temp = arr[i];
      arr[i] = arr[N - 1 - i];
      arr[N - i - 1] = temp;
    }
  }

  static double[][] arrayMatrixMultiplication(double[][] a, double[][] b)
  {
    int N = a.length;
    double[][] c = new double[N][N];
    for (int i = 0; i < N; i++)
    {
      for (int j = 0; j < N; j++)
      {
        for (int k = 0; k < N; k++)
        {
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return c;
  }

  static void printArray(double[] arr)
  {
    int N = arr.length;

    StdOut.print("Array[" + N + "] = { ");
    for(int i = 0; i < N; i++)
    {
      StdOut.print(arr[i]);
      if(i != N - 1)
        StdOut.print(", ");
    }
    StdOut.println(" }");
  }

  static void printArray(double[][] arr)
  {
    int N = arr.length;

    StdOut.println("Array[" + arr.length + "] = {");
    for(int i = 0; i < N; i++)
    {
      StdOut.print("\t{ ");
      for(int j = 0; j < N; j++)
      {
        StdOut.print(arr[i][j]);

        if(j != N - 1)
          StdOut.print(", ");
      }
      StdOut.println("}");
    }
    StdOut.println("}");
  }

  public static void main(String[] args)
  {
    int N = 20;

    //Long form
    double[] a;
    a = new double[N];
    for (int i=0; i<N; i++)
    {
      a[i] = 0.0;
    }

    //Short form
    double[] b = new double[N];


    //Initialising declaration
    double[] c = { 1.0, 2.0, 3.0, 4.0, 5.0 };

    //Array aliasing
    int[] firstArray = new int[N];
    firstArray[2] = 12;

    int[] secondArray = firstArray;
    secondArray[2] = 31;

    StdOut.println("secondArray aliased to firstArray");
    StdOut.println("firstArray[2] = " + firstArray[2]);

    printArray(c);
    StdOut.println("Max of array = " + arrayMax(c));
    StdOut.println("Average of array = " + arrayAve(c));

    StdOut.println("Copy of array:");
    printArray(arrayCopy(c));

    StdOut.println("Reverse of array:");
    arrayReverse(c);
    printArray(c);

    double[][] x = { {1.0, 2.0}, {3.0, 4.0} };
    double[][] y = { {5.0, 6.0}, {7.0, 8.0} };
    StdOut.println("Dot-product of:");
    printArray(x);
    StdOut.println("and: ");
    printArray(y);
    StdOut.println("is: ");
    printArray(arrayMatrixMultiplication(x, y));
  }
}
