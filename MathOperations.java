public class MathOperations{
	public int add(int a, int b){
		return a+b;
	}
	public double add(double a, double b,double c){
		return a+b+c;	
	}
	public String add(String s1,String s2){
		return s1+s2;
	}
	public static void main(String args[]){
    	MathOperations op=new MathOperations();
    	int intAns=op.add(5,2);
    	System.out.println("Sum of 2 integers is: "+intAns);
    	double doubleAns=op.add(5.31,2.788,8.4788821);
    	System.out.println("Sum of 3 doubles is: "+doubleAns);
    	String stringAns=op.add("Data ","Valley");
    	System.out.println("Sum of 2 strings is: "+stringAns);
    }
}
