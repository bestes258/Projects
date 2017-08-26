import java.text.DecimalFormat;
import java.util.Scanner;

public class Tips {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print("Enter Total Bill: ");
		double bill= scan.nextDouble();
		System.out.print("Enter Percentage: ");
		int percent=scan.nextInt();
		double tip=(double)percent/100;
		tip=tip*bill;
		
		System.out.print("Your tip should be:\n"+df.format(tip)+"\n");
		System.out.print("Your total bill should be:\n"+df.format(tip+bill));
		
		scan.close();
		
	}
	
}
