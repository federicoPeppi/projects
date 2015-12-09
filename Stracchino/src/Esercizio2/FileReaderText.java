package Esercizio2;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


public class FileReaderText {
	private BufferedReader BR;
	private BufferedWriter BW;

       public void testFile(String path){
    	   match("Ciao",readFromFile(path));
    	   writeToFile(path, "Prova");
    	   match("Prova",readFromFile(path));
    	   writeToFile(path, "Ciao");
       }
       
       public void writeToFile(String path, String what){
    	   try {
			BW = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "utf-8"));
			BW.write(what);
			BW.close();
    	   } catch (UnsupportedEncodingException e) {
    		   System.out.println("Eccezione: Encode non supportato");
			e.printStackTrace();
    	   } catch (FileNotFoundException e) {
    		   System.out.println("Eccezione: File non trovato");
			e.printStackTrace();
    	   } catch (IOException e) {
    		   System.out.println("Eccezione: Input/Output");
			e.printStackTrace();
    	   }
    	   System.out.println("Scriviamo sul file: "+what);
       }
       
       public String readFromFile(String path){
    	   String readed = "";
    	   try {
			BR = new BufferedReader(new FileReader(new File(path)));
			readed = BR.readLine();
			BR.close();
    	   } catch (FileNotFoundException e) {
			System.out.println("Eccezione: File non trovato");
			e.printStackTrace();
    	   } catch (IOException e) {
			System.out.println("Eccezione: Input/Output");
			e.printStackTrace();
    	   }
    	   System.out.println("Leggiamo dal file: " + readed);
    	   return readed;
       }
       
       public void match(String expected, String what){
    	   assertEquals(expected, what);
       }
}
