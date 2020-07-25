package section10;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileDemo7 {

	public static void main(String[] args) {
		RandomAccessFile fis = null;
		RandomAccessFile fos = null;
		try {
			fis = new RandomAccessFile("C:/Users/user/Desktop/stuff/name.txt", "r");
			fos = new RandomAccessFile("C:/Users/user/Desktop/java/out4.txt", "rw");
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
