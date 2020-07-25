package section10;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File file= new File("C:/Users/user/Desktop/demo.txt");
		if(file.createNewFile()) {
			System.out.println("created");
		}else {
			System.out.println("already exists");
		}
		
		System.out.println("=============");
		
		file= new File("C:/Users/user/Desktop/java");
		if(file.mkdirs()) {
			System.out.println("created");
		}else {
			System.out.println("already exists");
		}
		
		File file1= new File("C:/Users/user/Desktop/demo.txt");
		File file2= new File("C:/Users/user/Desktop/demo.txt");
		
		if(file1.equals(file2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		
	}
}
