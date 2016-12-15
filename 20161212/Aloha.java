
import java.io.*;
public class Aloha {
public static void main(String[]args){
	String filename=args[0];
	FileReader infile;
	int data;
	int n=0;

	try{
		inFile=new FileReader(fileName);

		while((data = inFile.read())!=-1){
			System.out.println((char)data);
			n++;
		}
		inFile.close();
		System.out.println(n+"display");
	}catch (IOException e){
		System.out.println("error");
	}
	FileReader inf
}	
}