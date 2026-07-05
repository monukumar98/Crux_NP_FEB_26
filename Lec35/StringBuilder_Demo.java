package Lec35;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("hello");
		sb.append(10);
		sb.append('a');
		sb.append(true);
		System.out.println(sb.length());
		System.out.println(sb.charAt(1));
		System.out.println(sb.substring(1, 3));
		sb = sb.reverse();
		System.out.println(sb);
		sb.append("hell");
		System.out.println(sb.length());
		sb.append('p');
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(sb.length() - 1));
		String s=sb.toString();

	}

}
