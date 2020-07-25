package section10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo5 {
	public static void main(String[] args) {
		FileReader fis = null;
		FileWriter fos = null;
		try {
			fis = new FileReader("C:/Users/user/Desktop/stuff/name.txt");
			fos = new FileWriter("C:/Users/user/Desktop/java/out2.txt");
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
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
