import java.sql.DriverManager;

public class Example {
	public static void main(String []args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		//DriverManager.getConnection(url)
		}catch(ClassNotFoundException e) {
			System.out.println("Exception:"+e.getMessage());
			
		}
	}
	
}
