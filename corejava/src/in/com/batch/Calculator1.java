package in.com.batch;

public class Calculator1 {
public static void main(String[] args) {
	double num1=1700;
	double num2=2;
	char operator='+';
	double  result;
	
	switch (operator) {
	case '+':
	result =num1+num2;
	System.out.println("add="+result);
		break;

		
	case '-':
		result =num1-num2;
		System.out.println("sub="+result);
			break;
		
	case '*':
		result =num1*num2;
		System.out.println("mult="+result);
			break;
			
	case '/':
		result =num1/num2;
		System.out.println("devide="+result);
			break;
			
	default:
		System.out.println("Invailid operator!!!!");
		break;
	}
}
}
