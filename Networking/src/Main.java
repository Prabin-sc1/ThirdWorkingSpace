import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args){
		//System.out.println("Good morning dude");
		try(ServerSocket serverSocket = new ServerSocket(5000)){//port number =5000
			Socket socket = serverSocket.accept();
			System.out.println("Client connected");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
			
			while(true) {
				String echoString = input.readLine();
				if(echoString.equals("exit")) {
					break;
				}
				output.println("Echo from the server: " +echoString);
			}
			
		}catch(IOException e) {
			System.out.println("Server Exception"+e.getMessage());
			
		}
	}

}
/*
 * network = a group of computers connected together to share resources 
 * networking = it refers how the connected computers communicate
 * computers may be communicate across a private network called intranets.
 * when discussing networking, a machine usually referred as a host. 
 */

/*
 *java.net.package contains of two sets of APIs: low-level API and high-level API
 *While using low-level networking API, you'll use sockets to establish connections, send requests, and receives.A socket is one end-point of the two-way 
 *connection.The client will have a socket, and the server will have a socket.
 *
*/
// When you have multiple clients connecting to the same server, they'll use the same port number, but each client will have its own socket.You'll use the Socket 
//class for the client socket, and the ServerSocket class for the server's socket. 

//handshaking in which data can be sent as packets which must be in a specific format.

