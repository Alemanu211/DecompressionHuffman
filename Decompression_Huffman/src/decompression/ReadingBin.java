package decompression;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
//"C:\\Users\\Alexandre\\Desktop\\Decompression Huffman/exemple_comp.bin"

public class ReadingBin {
	
	
	public static void read() {
		String file = "C:\\Users\\Alexandre\\Desktop\\Decompression Huffman/exemple_comp.bin";
		
		// custom buffer size
		int BUFFER_SIZE = 16 * 1024; // 16KB

		
		try {
			// create a reader
			FileInputStream fis = new FileInputStream(new File(file));
			BufferedInputStream reader = new BufferedInputStream(fis, BUFFER_SIZE);

		    // read one byte at a time
		    int ch;
		    while ((ch = reader.read()) != -1) {
		        System.out.print((char) ch); 
		    	String s1 = String.format("%8s", Integer.toBinaryString(ch & 0xFF)).replace(' ', '0');
		    	System.out.println(s1);
		    }

		    // close the reader
		    reader.close();

		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
	}
}
