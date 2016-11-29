import java.io.*;
import java.net.*;
public class Readnet{
	public static void main(String[] args) {
		String host=args[0];
		int port=Integer.parseInt(args[1]);
		Socket sock=null;
		InputStream inStr=null;
		byte[]buff=new byte[1024];
		boolean flag=true;
		try{
			sock=new Socket(host,port);
			inStr=sock.getInputStream();
			System.out.println("connecting...");
		}catch(Exception e){
			System.out.println("error");
			System.exit(1);
		}
		while(flag){
		try{
			int n=inStr.read(buff);
			System.out.write(buff,0,n);
		}catch (Exception e){
				flag=false;
			}
		}
		try{
			inStr.close();
		}catch(Exception e){
			System.err.println("error");
			System.exit(1);
		}
	}
}
		
