import java.io.BufferedReader;
import java.io.FileReader;

public class CountWord {
	public static void main(String []args) throws Exception {
		//System.out.println("R");
		FileReader f = null;
		BufferedReader b = null;
		
			f = new FileReader("abc.txt");
			b = new BufferedReader(f);
			String s;
			String [] words;
			while((s = b.readLine()) != null) {
				
				words = s.split(" ");
				for(String w : words) {
					if(w.equalsIgnoreCase("java")) {
						System.out.println(w);
					}
				}
				
			}
			
		
	}

}
