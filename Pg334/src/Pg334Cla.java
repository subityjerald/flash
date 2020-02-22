import java.util.Scanner;
public class Pg334Cla {
	public static void main (String args[]) {
		Scanner Keyboard=new Scanner(System.in);
		double amount;
		boolean taxable;
		double total;
		System.out.println("what is the purchase amount? ");
		amount=Keyboard.nextDouble();
		System.out.println(" is the purchase taxable? ");
		taxable=Keyboard.nextBoolean();
		if(taxable  ) {
			total=amount*1.05;
		}else {
			total=amount;
		}
		System.out.print("total: ");
		System.out.println(total);
	}

}
