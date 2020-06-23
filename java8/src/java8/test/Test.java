package java8.test;
class Test {

    public static void main (String []s) {

        System.out.println ("something() returns: " + something () );

    }

    static Boolean something() {

        while (true) {

            try { return true; }

            finally { break;}

        }

        return false;

    }

}