public class OperatorDemo01 {
	public static void main (String [] args){
		int num = 3;
		num = num++;

		System.out.println(num);

		//��ֵ�����
		byte a = 3;
		byte b = 4;
		a += b;

		System.out.println(a);
		System.out.println(a += b);//11
		System.out.println(a -= b);//7
		System.out.println(a *= b);//28
		System.out.println(a /= b);//7
		
		//��ϵ�������
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a <= b);
	}
	
}