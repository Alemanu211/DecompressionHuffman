import java.util.ArrayList;

public class Arbre {

	public static Node create_tree() {
		
		ArrayList<Node> Arbre = Creation_feuilles.feuilles();
		while (Arbre.size()>1) {
			Arbre = Tri_nodes.tri_frequences(Arbre);
			int NewFrequence = Arbre.get(0).getFrequence() + Arbre.get(1).getFrequence();
			Node Nadd = new Node(NewFrequence, null, Arbre.get(0), Arbre.get(1));
			Arbre.add(Nadd);
			// Suppression des deux premiers elements
			Arbre.remove(0);
			Arbre.remove(0);
		}
		return Arbre.get(0); //Racine de l'arbre
	}
}
