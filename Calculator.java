package assignment2.week1;

public class Calculator {
	
	public int add(int num1,int num2,int num3) {
		int sum=num1+num2+num3;
		System.out.println(sum);
		return sum;
	}
	
	public int sub(int num1,int num2) {
		int subt=num1-num2;
		System.out.println(subt);
		return subt;
	}
	
	public double mul(double num1,double num2) {
		double mult=num1*num2;
		System.out.println(mult);
		return mult;
	}
	
	public float divide(float num1,float num2) {
		float divd=num1/num2;
		System.out.println(divd);
		return divd;
	}


}
