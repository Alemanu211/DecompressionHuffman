import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Dict_frequences {
	public static Object get_data () {
		String file = "C:\\Users\\Alexandre\\Desktop\\Decompression Huffman/exemple_freq.txt";
		Map <String, Integer> freq = new HashMap<>();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
			String line = reader.readLine();
			
			while (line != null) {
				line = reader.readLine();
				if (line != null) {
					freq.put(line.substring(0,1), Integer.parseInt(line.substring(2,3)));
				}
			}
			reader.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return freq;
	}
	
}


