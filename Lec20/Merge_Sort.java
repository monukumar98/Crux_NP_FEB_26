package Lec20;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 2, 5, 9, 6 };
		int [] a=Sort(arr, 0, arr.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static int[] Sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] a = new int[1];
			a[0] = arr[si];
			return a;
		}
		int mid = (si + ei) / 2;
		int[] f = Sort(arr, si, mid);
		int[] s = Sort(arr, mid + 1, ei);
		return Merge_Two_Array(f, s);

	}

	public static int[] Merge_Two_Array(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k++] = arr1[i++];

			} else {
				ans[k++] = arr2[j++];

			}
		}
		while (i < n) {
			ans[k++] = arr1[i++];
		}
		while (j < m) {
			ans[k++] = arr2[j++];
		}
		return ans;
	}

}
