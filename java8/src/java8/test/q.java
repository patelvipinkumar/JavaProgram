package java8.test;
import java.io.*;
import java.util.*;

class q{
    public static void main(String[] args)
    {
        TreeSet<Monkey> d = new TreeSet<Monkey>();
        d.add(new Monkey(1));
        d.add(new Monkey(2));
        d.add(new Monkey(1));
        System.out.println(d.size());
    }
    static class Monkey
    {
        Monkey(int i){}    
    }
}
