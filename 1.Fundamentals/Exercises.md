# Chapter 1, Exercises

## 1.1.1
Give the value of the following expressions
1. (0 + 15) / 2 = 7
2. 2.0e-6 * 100000000.1 = 200.0000002
3. true && false || false && true = false

## 1.1.2
Give the type and value of each of the following expressions
1. (1 + 2.236) / 2 = 1.618 (double)
2. 1 + 2 + 3 + 4.0 = 10.0 (double)
3. 4.1 >= 4 = true (boolean)
4. 1 + 2 + "3" = "33" (string)

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
What, if anything, is wrong with the following statements?
1. if (a > b) then c = 0; *then statement not part of an if statement*
2. if a > b { c = 0; } *if statements require parentheses around the conditions*
3. if (a > b) c = 0;  *nothing wrong with 3.*
4. if (a > b) c = 0 else b = 0; *assignment to c is missing a semicolon*

## 1.1.5
Write a code fragment that prints true if the double variables x and y are both
strictly between 0 and 1 and false otherwise.

    if (x > 0 && x < 1 && y > 0 && y < 1) StdOut.print("true");
    else  StdOut.print("false");

## 1.1.6
What does the following program print?

    int f = 0;
    int g = 1;
    for (int i = 0; i <= 15; i++)
    {
       StdOut.println(f);
       f = f + g;
       g = f - g;
    }

The printed output is 0, followed by the first 15 fibonacci numbers, each on a new line.

## 1.1.7
What is the output of the following code fragments?
1. 3.00009
    double t = 9.0;
    while (Math.abs(t - 9.0/t) > .001)
      t = (9.0/t + t) / 2.0;
    StdOut.printf("%.5f\n", t);
2. 499500
    int sum = 0;
    for (int i = 1; i < 1000; i++)
      for (int j = 0; j < i; j++)
        sum++;
    StdOut.println(sum);
3. 1023
    int sum = 0;
    for (int i = 1; i < 1000; i = i * 2)
      for (int j = 0; j < i; j++)
        sum++;
    StdOut.println(sum);

## 1.1.8
What do each of the following print? Explain each outcome.
1. System.out.println('b'); `b \n`, the character 'b' is printed to screen.
2. System.out.println('b' + 'c'); `197\n` the addition of 'b' and 'c' causes them to be coerced to integers and their integer value is displayed.
3. System.out.println((char) ('a' + 4)); `e\n`, when 'a' is added to 4 it is coerced to an integer, but the `char` cast causes the computed value to be rendered as a character.
