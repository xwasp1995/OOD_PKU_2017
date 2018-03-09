public class monthlyPayment{
    private static double loanAmount = 1000000;
    private static double monthlyInterestRate = 0.0042;
    private static int numberOfYears = 30;
    
    public static void main(String[] args){
		double fenmu = 1 - 1/Math.pow((1+monthlyInterestRate),numberOfYears*12);
		double fenzi = loanAmount * monthlyInterestRate;
		System.out.println(fenzi*12*30/fenmu);
    }
}
