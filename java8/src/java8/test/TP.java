package java8.test;
public class TP{

    public static void main(String[] args) {

        int iReturned = new TP().testEMethod();

        System.out.println("Returned value of i = " + iReturned);

    }

    public int testEMethod(){

        int i = 0;

        try{

            i = 100/0;

            return i;

        }

        catch(Exception e){

            i = 200/0;

            return i;

        }

        finally{

            i = 300;

        }

    }

}