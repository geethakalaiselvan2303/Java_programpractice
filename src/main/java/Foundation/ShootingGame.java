package Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShootingGame {
	
	static int count = 0;

	public static void main(String[] args) {
		int n = 8;
		List<Integer> list = new ArrayList<Integer>();
		for (int j = 1; j <= n; j++) {
			list.add(j);
		}
		while (list.size() != 1) {
			list = callshootingMethod(list);
		}

		System.out.println(count);
	}

	public static List<Integer> callshootingMethod(List<Integer> list) {
		List<Integer> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 != 0) {
				newList.add(list.get(i));
			} else {
				count += list.get(i);
			}
		}
		return newList;

	}
}
