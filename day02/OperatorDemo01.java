public class OperatorDemo01 {
	public static void main (String [] args){
		int num = 3;
		num = num++;

		System.out.println(num);

		//赋值运算符
		byte a = 3;
		byte b = 4;
		a += b;

		System.out.println(a);
		System.out.println(a += b);//11
		System.out.println(a -= b);//7
		System.out.println(a *= b);//28
		System.out.println(a /= b);//7
		
		//关系型运算符
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a <= b);
	}
	
}