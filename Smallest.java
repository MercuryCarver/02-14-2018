
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 2;
int b = 4;
int c = smallestNumber(a,b);
System.out.println(c + " is the smallest number.");
int d = 6;
int e = 21;
System.out.println(smallestNumber(6,21) + " is the smallest number.");
int f = 119;
int g = 112;
System.out.println(smallestNumber(119,112) + " is the smallest number.");

	}
	public static int smallestNumber(int num1, int num2) {
		if (num1<num2) {
			return num1;
		}else {
			return num2;
		}
	}
}
