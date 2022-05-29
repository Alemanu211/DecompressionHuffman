package arbre;

import java.util.ArrayList;
import java.util.Map;

import dictHuffman.Dict_frequences;

public class Creation_feuilles {
	
	public static ArrayList<Node> feuilles() {
		
		ArrayList<Node> ListeFeuilles = new ArrayList<Node>();
		@SuppressWarnings("unchecked")
		Map<String, Integer> dict_alphabet = (Map<String, Integer>) Dict_frequences.get_data();
		
		for (Map.Entry<String, Integer> entry : dict_alphabet.entrySet()) {
			
	        Node NodeVar = new Node(entry.getValue(), entry.getKey(), null, null);
	        ListeFeuilles.add(NodeVar);
	    }
		
		return ListeFeuilles;
	}
}
