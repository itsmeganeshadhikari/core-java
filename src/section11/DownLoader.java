package section11;

public class DownLoader extends Thread {

	public String url;

	public DownLoader(String url) {
		this.url = url;
	}

	public void run() {
		FileDownLoad fd = new FileDownLoad();
		fd.downLoad(this.url);
	}
}
