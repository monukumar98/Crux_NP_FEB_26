package Lec34;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> list;

	public Heap() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
	}

	public void add(int x) {
		list.add(x);
		upheapify(list.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (list.get(pi) > list.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int ith = list.get(i);
		int jth = list.get(j);
		list.set(i, jth);
		list.set(j, ith);

	}

	public int size() {
		return list.size();
	}

	public int get() {
		return list.get(0);
	}

	public void display() {
		System.out.println(list);
	}

	public int remove() {

		swap(0, list.size() - 1);
		int val = list.remove(list.size() - 1);
		downheapify(0);
		return val;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < list.size() && list.get(lci) < list.get(mini)) {
			mini = lci;
		}
		if (rci < list.size() && list.get(rci) < list.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

}







