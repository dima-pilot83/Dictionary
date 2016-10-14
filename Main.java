
import java.io.IOException;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {

		HashMap<String, String> trMap1 = new HashMap<>();
		Translation tr = new Translation();

		tr.setTrMap(trMap1);
		trMap1.put("he", "on");
		trMap1.put("cat", "kot");
		trMap1.put("she", "ona");
		trMap1.put("runs", "bezhit");
		trMap1.put("to", "v");
		trMap1.put("school", "shkoly");
		trMap1.put("home", "domoi");
		
		tr.saveDictionary();
		tr.translatefromFile();
		tr.writeresult();
	}

}
