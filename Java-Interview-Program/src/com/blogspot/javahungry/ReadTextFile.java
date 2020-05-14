package com.blogspot.javahungry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) {
		
		
		
		try{    
	           FileWriter fw=new FileWriter("testout.txt");    
	           fw.write("Welcome to javaTpoint.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	        
		
		try {
			String line = null;
			FileReader fileReader=new FileReader("testout.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
			bufferedReader.close();
		}catch(FileNotFoundException ex) {
			System.out.println("unable to open file :");
			
		}catch(IOException ex) {
			System.out.println("error reading file :");
		}
	}

}
