
public class AVERAGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 118;
int b = 36;
int c = 22;
double d = averageNumber(a,b,c);
System.out.println(d + " is the average of all three numbers.");
int e = 200;
int f = 6;
int g = 97;
double h = averageNumber(e,f,g);
System.out.println(h + " is the average of all three numbers.");
	}
	public static double averageNumber(double num1, double num2, double num3) {
		double print = ((num1 + num2 + num3)/3);
		return print;
	}
}
