package section8.genericsdemo;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo1 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(12);
		l.add(23);
		System.out.println(l);
	}
}
