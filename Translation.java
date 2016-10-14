import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Translation {

	private ArrayList<String> a = new ArrayList<String>();
	private HashMap<String, String> trMap = new HashMap<>();
	
	
	public HashMap<String, String> getTrMap() {
		return trMap;
	}

	public void setTrMap(HashMap<String, String> trMap) {
		this.trMap = trMap;
	}

	public void saveDictionary(){ // save Dictionary to file (HashMap)
		try {
			File fileOne = new File("Dictionary.txt");
			FileOutputStream fos = new FileOutputStream(fileOne);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(trMap);
			oos.flush();
			oos.close();
			fos.close();
		} catch (Exception e) {
		}
	}
		
		public void translatefromFile(){ // translating text from English.in
		try (BufferedReader br = new BufferedReader(new FileReader("English.in.txt"))) {
			String text = "";

			for (; (text = br.readLine()) != null;) {
				text = text.toLowerCase();
				for (String s : text.split(" ")) {
					;
					System.out.print(trMap.get(s) + " ");
					a.add(trMap.get(s));
				}

			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public void writeresult(){ // Writing result to Russian.in
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Russian.in.txt"))) {

			bw.write(a+ " ");

		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
