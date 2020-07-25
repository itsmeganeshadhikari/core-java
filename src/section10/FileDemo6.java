package section10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo6 {

	public static void main(String[] args) {
		FileReader fis = null;
		FileWriter fos = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fis = new FileReader("C:/Users/user/Desktop/stuff/name.txt");
			br = new BufferedReader(fis);
			fos = new FileWriter("C:/Users/user/Desktop/java/out3.txt");
			bw = new BufferedWriter(fos);
			String l;
			while ((l = br.readLine()) != null) {
				System.out.println(l);
				bw.write(l);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
