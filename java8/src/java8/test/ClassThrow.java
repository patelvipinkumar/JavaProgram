package java8.test;
public class ClassThrow{

    public static void main(String as[]){

        System.out.println(throwmethod());

    }

    public static int throwmethod(){

        try{

            throw new ClassNotFoundException();

        }catch(Exception e){

            throw new NullPointerException();

        }

    }

}