package medium;

public class StingToInteger_8 {
	public int myAtoi(String str) {
		int result = 0;
		int sign = 1;// 符号，1为正号

		int index = 0;// 字符串下标
		char chtemp;// 字符变量

		//空字符串
		if(str.length() == 0) return 0;
		// 跳过空格
		while (index < str.length() && str.charAt(index) == ' ') {
			index++;
		}

		// 判断符号位
		if(index >= str.length()) return 0;
		chtemp = str.charAt(index);
		if (chtemp == '+' || chtemp == '-') {
			sign = (chtemp == '+' ? 1 : -1);
		} else {// 非符号
			if (chtemp > '9' || chtemp < '0') return 0;
			result = chtemp - '0';
		}
		index++;

		// 符号外部分
		for (; index < str.length(); index++) {
			chtemp = str.charAt(index);
			if (chtemp > '9' || chtemp < '0') break;
			if(Integer.MAX_VALUE/10 < result ||(Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE%10 < (chtemp-'0')))
				return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
			result = result * 10 + (chtemp - '0');


		}
		return sign * result;
	}

	public static void main(String[] args) {
		StingToInteger_8 sti = new StingToInteger_8();
		System.out.println(sti.myAtoi("abc"));
		
		
	}
}
