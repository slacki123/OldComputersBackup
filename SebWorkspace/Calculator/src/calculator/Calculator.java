package calculator;

public class Calculator {

	private int num1;
	private int num2;
	private int num3;

	public String add(int num1, int num2, int num3) {
		if (num1 + num2 == num3) {
			return num1 + "+" + num2 + "=" + num3;
		} else if (num1 + num3 == num2) {
			return num1 + "+" + num3 + "=" + num2;
		} else if (num2 + num3 == num1) {
			return num2 + "+" + num3 + "=" + num1;
		} else {
			return "numbers not valid";
		}
	}

	public String subtractA(int num1, int num2, int num3) {

		if (num1 - num2 == num3) {
			return num1 + "-" + num2 + "=" + num3;

		} else if (num2 - num3 == num1) {
			return num2 + "-" + num3 + "=" + num1;

		} else if (num3 - num2 == num1) {
			return num3 + "-" + num2 + "=" + num1;

		} else {
			return "numbers not valid";
		}
	}

	public String subtractB(int num1, int num2, int num3) {

			
			if(num1-num3==num2)

	{
		return num1 + "-" + num3 + "=" + num2;

	}else if(num2-num1==num3)
	{
		return num2 + "-" + num1 + "=" + num3;

	}else if(num3-num1==num2)
	{
		return num3 + "-" + num1 + "=" + num2;
	}else
	{
		return "numbers not valid";
	}

}

}
