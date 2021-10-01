package corejava.assignment;
import java.io.*;
import java.util.Scanner;
public class LineCharWords {

	public static void main(String[] args)throws IOException{
		int num=1,w=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File name: ");
		String str = sc.nextLine();
		FileInputStream f = new FileInputStream(str);
		int n = f.available();
		for(int i=0;i<=n;i++) {
			ch=(char)f.read();
			if(ch=='\n')
				n++;
			else if(ch==' ')
				w++;
		}
		System.out.println("Number of lines:"+num);
		System.out.println("Number of words:"+(num+w));
		System.out.println("Number of characters:"+n );
	}

}
