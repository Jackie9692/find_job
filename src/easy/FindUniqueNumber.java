package easy;

public class FindUniqueNumber {
	public static void main(String[] args) {
		solve1();
	}

	public static void solve1() {

		int A[] = { 1, 2, 3, 4, 5, 5, 3, 2, 1};
		
	    int temp = 0;
	    for(int i = 0 ; i < A.length; i++){
	        temp ^= A[i];            //异或运算
	    }
	    System.out.println(temp);
	}
}
