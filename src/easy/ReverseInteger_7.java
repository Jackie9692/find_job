package easy;

import java.lang.Math;

public class ReverseInteger_7 {
	public int reverse(int x) {
		int result = 0;// 保留结果
		int tempResult = 0;
		int tempx = x;//

		int current = 0;// 当前除数
		int left = -1;// 余数


		
/*		boolean isNegative = false;
		if (tempx < 0) {
			isNegative = true;
			tempx = -tempx;
		}*/
		while (tempx != 0) {
			current = tempx / 10;
			left = tempx % 10;
			tempx = current;
			tempResult = result * 10 + left;
			
			if ((tempResult - left) / 10 != result){
				return 0;
			}
			result = tempResult;
		}

/*		if (isNegative) {
			result = -result;
		}*/
		


		return result;
	}

	public static void main(String[] args) {
		ReverseInteger_7 r = new ReverseInteger_7();
//		System.out.println(r.reverse(1534236469));
		System.out.println(r.reverse(-13432423));
	}
}
