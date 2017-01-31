
import java.io.*;

public class Aloha2 {

	public static void main(String[] args) {
		
		String[] data = new String[100];
		Dataman dataman = new Dataman();
		Fileman fileman = new Fileman();

		dataman.inputData();
		dataman.saveData(data);

	
		fileman.writeFile(data);
	}
}

class Dataman {
	String[] data;
	int numData;
	public Dataman(){
		data = new String[100];
	}
	public void inputData(){
		System.out.print("choose the number of people");
		this.numData = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
	}
	public void saveData(String[] strData){
		System.out.println("enter the names");
		strData[0] = "Aoki";
		strData[1] = "Horie";
		strData[2] = "Miwa";
	}
}












class Fileman {
	public Fileman(){
		System.out.println("Fileman!");
	}
	public void writeFile(String[] strData) {
		System.out.println("writeFile()!");
	}
}
