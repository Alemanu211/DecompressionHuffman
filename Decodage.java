package decompression;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import arbre.Arbre;
import dictHuffman.Codage_caracteres;
//File file = new File("C:\\Users\\Alexandre\\Desktop\\Decompression Huffman/exemple_bis.bin");
public class Decodage {
	
	public static void display() {
	  
		Map <String, String> dict = (Map<String, String>) Codage_caracteres.codeCaracteres(Arbre.create_tree(),"");
		System.out.println(dict);
		String chaine = "";
		// Le fichier d'entrée
		File file = new File("C:\\Users\\Alexandre\\Desktop\\Decompression Huffman/exemple_bis.bin");
		try {
			// create a reader
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream reader = new BufferedInputStream(fis);

		    // read one byte at a time
		    int ch;
		    while ((ch = reader.read()) != -1) {
		        chaine = chaine + (char) ch;
		    }

		    // close the reader
		    reader.close();
		} catch (IOException ex) {
		    ex.printStackTrace();
		} 
		String res = "";
		String iter = "";
		System.out.println("Avant conversion: " + chaine); 
	    for (int i = 0; i<chaine.length() ; i++) {
	    	iter = iter + chaine.charAt(i);
	    	for (Map.Entry mapentry : dict.entrySet()) {
	    		if (iter.equals(mapentry.getValue().toString())) {
	    			res = res+ mapentry.getKey();
	    			iter = "";
	    		}
	    		
		    }
	    }
	    System.out.println("Après conversion: " + res);
	    
	}
}
