import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<num/2;i++){
			if(i*i==num){
				System.out.println("number is perfect square "+i);
			}
		}
	}
}