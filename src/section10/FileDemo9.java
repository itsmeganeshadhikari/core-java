package section10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo9 {
	public static void main(String[] args) {

		try (
				FileInputStream fis = new FileInputStream("C:/Users/user/Desktop/stuff/name.txt");
				FileOutputStream fos = new FileOutputStream("C:/Users/user/Desktop/out1.txt");

		) {

			int l;
			while ((l = fis.read()) != -1) {
				System.out.println(l);
				fos.write(l);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
