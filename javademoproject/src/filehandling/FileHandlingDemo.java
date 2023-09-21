package filehandling;

import java.io.*;

public class FileHandlingDemo {
	public static void main(String[] args) {
		//fileInputStreamDemo();
		//fileOutputStreamDemo();
		//fileReaderDemo();
		//fileWriterDemo();
		bufferedReaderDemo();
	}
	static void fileInputStreamDemo()
	{
		int i;
	File myfile = new File("C:\\Users\\Amulya VR\\OneDrive\\Desktop\\myfile.txt");
	try {
		FileInputStream fis= new FileInputStream(myfile);
		System.out.println("file opened");
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
	fis.close();
	} catch (IOException e) {
		System.out.println("exception "+e.getMessage());
	}
	}
	static void fileOutputStreamDemo()
	{
		int i;
	File myfile = new File("C:\\Users\\Amulya VR\\OneDrive\\Desktop\\myfile.txt");
	try {
		FileOutputStream fos= new FileOutputStream(myfile);
		System.out.println("file opened");
		String data="from the program";
		fos.write(data.getBytes());
	fos.close();
	} catch (IOException e) {
		System.out.println("exception "+e.getMessage());
	}
	}
	static void fileReaderDemo()
	{
		int i;
	File myfile = new File("C:\\Users\\Amulya VR\\OneDrive\\Desktop\\myfile.txt");
	try {
		FileReader fr= new FileReader(myfile);
		System.out.println("file opened");
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
	fr.close();
	} catch (IOException e) {
		System.out.println("exception "+e.getMessage());
	}
	}
	
	static void fileWriterDemo()
	{
		int i;
	File myfile = new File("C:\\Users\\Amulya VR\\OneDrive\\Desktop\\myfile.txt");
	try {
		FileWriter fw= new FileWriter(myfile);
		System.out.println("file opened");
		fw.write("from file writer\n");
		fw.write("from file writer one more time");
	fw.close();
	} catch (IOException e) {
		System.out.println("exception "+e.getMessage());
	}
	}
	
	static void bufferedReaderDemo()
	{
		String line;
	File myfile = new File("C:\\Users\\Amulya VR\\OneDrive\\Desktop\\myfile.txt");
	try {
		FileReader fr= new FileReader(myfile);
		BufferedReader br= new BufferedReader(fr);
		System.out.println("file opened");
		while((line=br.readLine()) != null) {
			System.out.println(line);
		}
	fr.close();
	} catch (IOException e) {
		System.out.println("exception "+e.getMessage());
	}
	}
}
