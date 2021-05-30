import java.io.FileOutputStream;
import java.io.IOException;

public class A {
	public static void main(String []args) {
		FileOutputStream g ;
		try {
			g	= new FileOutputStream("abc.txt");
			String s = "Prabin";
			byte b[] = s.getBytes();
			g.write(b);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
