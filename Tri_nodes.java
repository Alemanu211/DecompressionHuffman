package tri;

import java.util.ArrayList;

import arbre.Node;

public class Tri_nodes {
	// Tri d'une liste de noeuds par leur frequence croissante
	public static ArrayList<Node> tri_frequences(ArrayList<Node> listeInitiale) {
		
		for (int i=0; i<listeInitiale.size();i++) {
			listeInitiale = ComparaisonElements.croissant(listeInitiale);
		}
		return listeInitiale;
	}
}
