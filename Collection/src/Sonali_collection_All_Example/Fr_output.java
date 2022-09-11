package Sonali_collection_All_Example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import assignment_array_frq_01_09_2022.Fr;

public class Fr_output {

	public static void main(String[] args) {

		int[] input = { 3, 5, 3, 2, 3, 4, 5, 7, 6, 9 };

		List<Fr> Storage = new ArrayList<>();
		for (int item : input) {
			boolean flag = checkNumberIsPresent(item, Storage);
			if (flag == false) {
				Fr obj = new Fr(item, 1);
				Storage.add(obj);
			}

		}
		System.out.println(Storage);
	}

	static boolean checkNumberIsPresent(int item, List<Fr> Storage) {
		ListIterator<Fr> itr = Storage.listIterator();
		while (itr.hasNext()) {
			Fr obj = itr.next();
			if (item == obj.getItem()) {
				Integer count = obj.getCount();
				count++;

				Fr new1 = new Fr(item, count);

				itr.set(new1);
				return true;
			}

		}
		return false;
	}

}
