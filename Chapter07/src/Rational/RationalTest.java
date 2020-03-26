package Rational;

public class RationalTest {

	public static void main(String[] args) {
		Rational myFract = new Rational(24, 36);
		System.out.println("myFract = " + myFract);
		System.out.println("Numerator: " + myFract.getNumerator() + ", " 
				           + "denominator: " + myFract.getDenominator());
		
		Rational num1 = new Rational(1, 2);
		Rational num2 = new Rational(2, 3);
		System.out.println(num1 + " * " + num2 + " = " + num1.multiply(num2));
		System.out.println(num1 + " / " + num2 + " = " + num1.divide(num2));
		
		num2 = new Rational(1, 3);
		System.out.println(num1 + " + " + num2 + " = " + num1.add(num2));
		System.out.println(num1 + " - " + num2 + " = " + num1.subtract(num2));
		
		System.out.println(num2 + " = " + num2.toDouble());
		
		
		System.out.println("Zero = " + Rational.ZERO + ", one = " + Rational.ONE);
		
		Rational product = Rational.ONE.multiply(num1);
		System.out.println(product);

	}

}
