package easy;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		solution();
	}
	public static void solution(){
		int count;
		String tempLine;
		
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		System.out.println(count);
				
		for (int i = 0; i < count; i++) {
			tempLine = sc.nextLine();
			System.out.println(tempLine);
		}
	}
	
	
	public void getInputofLeftRight(){
		String left;
		int right;
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String strArr[] = line.split(" ");
		
		if(strArr.length < 2){
			return ;
		}
		left = strArr[0];
		right = Integer.parseInt(strArr[1]);
		
		System.out.println(left);
		System.out.println(right);
		
	}
	
	
	public void getInputofCountAContent(){
		String left;
		int right;
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String strArr[] = line.split(" ");
		
		if(strArr.length < 2){
			return ;
		}
		left = strArr[0];
		right = Integer.parseInt(strArr[1]);
		
		System.out.println(left);
		System.out.println(right);
		
	}
	
	
	
}
