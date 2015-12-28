# Chapter 1, Exercises

## 1.1.1
Give the value of the following expressions
a) (0 + 15) / 2 = 7
b) 2.0e-6 * 100000000.1 = 200.0000002
c) true && false || false && true = false

## 1.1.2
Give the type and value of each of the following expressions
a) (1 + 2.236) / 2 = 1.618 (double)
b) 1 + 2 + 3 + 4.0 = 10.0 (double)
c) 4.1 >= 4 = true (boolean)
d) 1 + 2 + "3" = "33" (string)

## 1.1.3
Write a program that takes 3 command line integer arguments and prints *equal* if
all three are equal and *not equal* otherwise.

    import edu.princeton.cs.algs4.StdOut;

    public class EqualIntegers
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
            StdOut.println("Usage: java-algs4 EqualIntegers a b c");
            StdOut.println("where a, b and c are integers");
          }
        }
      }
    }

## 1.1.4
