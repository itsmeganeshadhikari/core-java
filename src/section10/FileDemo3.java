package section10;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		File file = new File("C:/Users/user/Desktop/stuff");
		// String [] fileList=file.list();
		// for (String f : fileList) {
		// System.out.println(f);
		// }

		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}

	}

}
