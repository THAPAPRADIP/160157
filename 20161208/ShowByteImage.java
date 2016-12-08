
import java.io.*;
public class ShowByteImage{
	public static void main(String[]args){
	FileInputStream inFile=null;
 	try{
	inFile=new FileInputStream("oknjikn.jpg");
	int data=inFile.read();
	int data;
	while ((data=inFile.read())!=-1){
	System.out.println(data);
	inFile.close();
	}catch(IOException e){
	System.err.println("error");
	System.exit(1);
	}
}
}