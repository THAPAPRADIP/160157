
import java.net.*;
import java.io.*;

public class ChatClient{
	public static void main(String[] args) {
		System.out.println("Aloha");
		try{
			T1 t = new T1();
			t.openConnection(args[0],Integer.parseInt(args[1]));
			t.mainProc();
			
		}catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
}
class T1{
	protected Socket sock = null;
	public OutputStream outSt;
	public BufferedInputStream inBIS;


	public void openConnection(String name , int port ){
		
		System.out.println("IP_アドレス："+ name);
		System.out.println("ポート番号："+ port);

		try{
			sock = new Socket(name, port);
			System.out.println("ネットワークをつなぎました。");

			outSt = sock.getOutputStream();

			inBIS = new BufferedInputStream(sock.getInputStream());
			System.out.println("streamを作りました。");

		}catch(Exception e){
			System.err.println("エラーです。");
			e.printStackTrace();
			System.exit(1);

		}
	}
	public void mainProc(){
		System.out.println("ALOHA!");
	
	try{
		StreamConnector kbToSock = new StreamConnector(System.in,outSt);
		StreamConnector sockToCmd = new StreamConnector(inBIS,System.out);

		Thread inThread = new Thread(sockToCmd);
		Thread outThread = new Thread(kbToSock);
		System.out.println("Threadを作りました。");

		inThread.start();
		outThread.start();
		System.out.println("Threadをstartしました。");

	}catch(Exception e){
		System.err.println("エラーです。");
		e.printStackTrace();
		System.exit(1);
		}
	}
}

class StreamConnector implements Runnable{
	InputStream src = null;
	OutputStream dist = null;

	public StreamConnector(InputStream in, OutputStream out){
		src = in;
		dist = out;

	}

	public void run(){
		try{
			byte[] buff = new byte[1024];
			while(true){
			int n = src.read(buff);
			if(n>0){
				dist.write(buff,0,n);
			}	
		}
		}catch(Exception e){
		System.err.println("エラーです。");
		e.printStackTrace();
		System.exit(1);
		}
	}


}


