package section10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos=null;
		try {
			fis = new FileInputStream("C:/Users/user/Desktop/stuff/name.txt");
			fos=new FileOutputStream("C:/Users/user/Desktop/java/out1.txt");
			int l;
			while ((l = fis.read()) != -1) {
				System.out.println(l);
				fos.write(l);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
