import java.util.Scanner;
public class Main
{
	static double res = 0.0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n **********************Calculator*************************.");
		System.out.println("\n1. Addition.");
		System.out.println("\n2. Substraction.");
		System.out.println("\n3. Multiplication.");
		System.out.println("\n4. Division.");

		while(true){
			System.out.println("\nEnter Your Choice::");
			int inp = sc.nextInt();
			System.out.println("\nInp:: "+ inp);
			
					switch(inp){
						case 1:
										Sum s = new Sum();
										Main.res = s.Sum(args);
										System.out.println("\nSum of "+ args[0] + " and "+args[1] + "is:: "+ res);
										break;
						case 2:
										Sub su = new Sub();
										Main.res =su.Sub(args);
										System.out.println("\nSum of "+ args[0] + " and "+args[1] + "is:: "+ res);
										break;
						case 3:
										Mul m = new Mul();
										Main.res = m.Mul(args);
										System.out.println("\nSum of "+ args[0] + " and "+args[1] + "is:: "+ res);
										break;
						case 4:
										Div d = new Div();
										Main.res = d.Div(args);
										System.out.println("\nSum of "+ args[0] + " and "+args[1] + "is:: "+ res);
										break;
						default:
										System.out.println("\n\nThank You for using App.");
										//return 0;
					}
				System.out.println("\nDo You Want to Continue::(Y/N)");
				char wish = sc.next().charAt(0);

				if(wish == 'Y' || wish == 'y')
					continue;
				else
					break;
			}
	}
}
