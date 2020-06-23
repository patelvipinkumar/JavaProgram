package com.javatpoint.array;
class calculate
{
      public static void main(String args[])
     {
         int a[] = {3, 5, 10, 9, 7};
         int b[] = a;
         int sum = 0;
         for (int j = 0; j < 3; ++j)
            sum += (a[j] * b[j + 1]) + (a[j + 1] * b[j]);
            System.out.println(sum);
      }
}