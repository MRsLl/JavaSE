public class Test01 {
	public static void main (String [] args){
		int num = 1234;
		int ge = num%10;
		int shi = num/10%10;
		int bai = num/100%10;
		int qian = num/1000%10;

		System.out.println(ge);
		System.out.println(shi);
		System.out.println(bai);
		System.out.println(qian);

		int sum = 0;
		while(num > 0){
			System.out.println(num%10);
			num/=10;
			sum++;
		}

		System.out.println(sum);
	}
}