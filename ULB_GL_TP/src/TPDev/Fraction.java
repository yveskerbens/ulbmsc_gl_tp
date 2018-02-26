package TPDev;

public class Fraction {
	private int numerator; 
	private int denominator;
	
	public Fraction (){
		this.numerator = 0;
		this.denominator = 0;
	}
	
	public Fraction(int a, int b){
		this.numerator = a; 
		this.denominator=b;
	}
		
/*	public void setFraction(int a, int b){
		numerator= a;
		denominator =b;
	}
*/	

	public String  getFraction() {
		return this.numerator+"/"+this.denominator;
	}
	
	public  Fraction add(Fraction f1, Fraction f2){
		if(f1.denominator == 0 || f2.denominator == 0) {
			 throw new ArithmeticException("Division by Zero not allowed"); 
		}
		Fraction sum = new Fraction();
		int factor1 = lcm(f1.denominator, f2.denominator)/f1.denominator;
		int factor2 = lcm(f1.denominator, f2.denominator)/f2.denominator;
		sum.numerator = f1.numerator * factor1 + f2.numerator * factor2;
		sum.denominator = lcm(f1.denominator, f2.denominator);
		return sum;
	}
	
	public int lcm(int f1denom, int f2denom) {
		while (f1denom%f2denom != 0) {
			int  factor = f1denom;
			f1denom +=factor;
		}
		return f1denom;
	}
}
