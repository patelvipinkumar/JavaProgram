package com.java2blog.Numbers;
class CheckArmStrongNumberMain
{
 public static void main(String[] args)
 {
   CheckArmStrongNumberMain casnm=new CheckArmStrongNumberMain();
  System.out.println(" Is 153 Armstrong number: "+casnm.isArmStrongNumber(153));
  System.out.println(" Is 234 Armstrong number: "+casnm.isArmStrongNumber(234));
     System.out.println(" Is 371 Armstrong number: "+casnm.isArmStrongNumber(371));
 }
 public boolean isArmStrongNumber(int number)
 {
  int sum=0;
  int originalNumber=number;
  while(number!=0)
  {
   
  int remainder=number%10;
  sum=sum+remainder*remainder*remainder;
  number=number/10;
  }
  if(originalNumber==sum)
  {
   return true;
  }
  return false;
 }
}