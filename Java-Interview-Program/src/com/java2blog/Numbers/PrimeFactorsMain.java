package com.java2blog.Numbers;
import java.util.ArrayList;
import java.util.List;
 
public class PrimeFactorsMain {
 
 // This method calculate prime factor and add it to primeFactor list
 public static List primeFactors(int number) {
  int n = number;
  List primeFactors = new ArrayList();
  for (int i = 2; i <= n; i++) {
   while (n % i == 0) {
    primeFactors.add(i);
    n /= i;
   }
  }
  return primeFactors;
 }
 
 public static void main(String[] args) {
  System.out.println("Primefactors of 15 are : ");
  System.out.printf("%s %n",primeFactors(15));
 
  System.out.println("Primefactors of 48 are :");
  System.out.printf("%s %n",primeFactors(48));
 
  System.out.println("Primefactors of 91");
  System.out.printf("%s %n",primeFactors(91));
 
 }
}
 
