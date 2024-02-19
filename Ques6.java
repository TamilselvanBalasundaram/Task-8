package task8;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum = 1;	
	int i;
	for (i=1 ; i<=5 ; i++) {
		System.out.println(i);
		sum = sum*i;
		System.out.println("sum - " + sum);
	}
        System.out.println("5! = " + sum);
	}

}

Output:
1
sum - 1
2
sum - 2
3
sum - 6
4
sum - 24
5
sum - 120
5! = 120
