package Java_Exercise;

import java.util.Arrays;

public class StringSplitTask12 {

	public static void main(String[] args) {
		String str=" Welcom, to, the ,world";
		String[] tokens=str.split(" , ");
		Arrays.stream(tokens).forEach(a->System.out.print(a));

	}

}
