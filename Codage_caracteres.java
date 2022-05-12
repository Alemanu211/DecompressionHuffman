import java.util.HashMap;
import java.util.Map;

public class Codage_caracteres {
	static Map <String, String> dictionnaireCode = new HashMap<>();
	
	public static Object codeCaracteres(Node node, String code) {
		if (node.getCaractere() != null) {
			dictionnaireCode.put(node.getCaractere(), code);
		}
		else {
			codeCaracteres(node.getLeft_child(), code + "0");
			codeCaracteres(node.getRight_child(), code + "1");
		}
		return dictionnaireCode;
	}
}
