package task8;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=23;
		int i;
		boolean x = true;
		for (i=2 ; i<a ; i++) {
			if (a % i == 0) {
				x=false;
			}
		}
		System.out.println(x);
		if (x) {
			System.out.println(a + " is a prime number");
		}else {
			System.out.println(a + " is NOT a prime number");
		}
		

}
}


