package section8.genericsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo3 {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(10, 20, 30);
		sum(l1);
		List<Double> l2 = Arrays.asList(10.3, 20.5, 30.6);
		sum(l2);
		List<String> l3 = Arrays.asList("Ganesh", "Prithu", "Nabina");
		// sum(l3);

		List<? extends Number> l = new ArrayList<>();
		List<? super Integer> ll = new ArrayList<>();
	}

	public static void sum(List<? extends Number> l) {
		double s = 0;
		for (Number a : l) {
			s = s + a.doubleValue();
		}
		System.out.println("sum is: " + s);
	}

}
