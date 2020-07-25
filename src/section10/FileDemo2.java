package section10;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo2 {

	public static void main(String[] args) {
		File file = new File("C:/Users/user/Desktop/demo.txt");
		long l=file.lastModified();
		System.out.println(l);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd EEEEE HH:mm a");
		System.out.println(sdf.format(new Date(l)));
//		System.out.println(file.canWrite());
//		file.setReadOnly();
//		System.out.println(file.canWrite());
//		file.setWritable(true);
//		System.out.println(file.canWrite());
//		System.out.println(file.canExecute());
//		System.out.println(file.canRead());
//		System.out.println(file.getName());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.exists());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		System.out.println(file.isHidden());
//		System.out.println(file.getTotalSpace());
//		System.out.println(file.getUsableSpace());
//		System.out.println(file.getFreeSpace());
//		System.out.println(file.length());
//		File file1 =new File("C:/Users/user/Desktop/java/hello.txt");
//		file.renameTo(file1);
//		file1.delete();
	}

}
