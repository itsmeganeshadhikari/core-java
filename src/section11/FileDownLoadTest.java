package section11;

public class FileDownLoadTest {

	public static void main(String[] args) {

		DownLoader d1= new DownLoader("url1");
		DownLoader d2= new DownLoader("url2");
		DownLoader d3= new DownLoader("url3");
		
		d1.start();
		d2.start();
		d3.start();

	}

}
