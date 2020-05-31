package com.javatpoint.array;
public class Length
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5};
        int count=0;
        for(int i:a)
        {
          count++;
        }

        System.out.println(count);
    }
}