package tri;
import java.util.ArrayList;

import arbre.Node;

public class ComparaisonElements {
	
	public static ArrayList<Node> croissant(ArrayList<Node> ListeFournie) {
		
		for (int i=0; i< ListeFournie.size()-1 ;i++) {
			int e1 = ListeFournie.get(i).getFrequence();
			int e2 = ListeFournie.get(i+1).getFrequence();
			
			if (e1 > e2) {
				
				Node Sto1 = ListeFournie.get(i);
				Node Sto2 = ListeFournie.get(i+1);
				
				ListeFournie.set(i, Sto2);
				ListeFournie.set(i+1, Sto1);
				
			}

		}
		return ListeFournie;
	}
}
