public class OperatorDemo02 {
	public static void main (String [] args){
		int x = 30;
		int y = 45;

		String m  = (x > y) ? "x´ó" : "y´ó" ;
		System.out.println(m);

		int z = 5;

		int a = (x > y) ? x : y;
		int b = (z > a) ? z : a;

		System.out.println(b);

		int c = (z > ((x > y) ? x : y)) ? z : ((x > y) ? x : y);

		System.out.println(c);
	
	}
	
}