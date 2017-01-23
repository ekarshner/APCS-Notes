public class MinCoins{
    public static void main(String [] args){
	int cents = Integer.parseInt(args[0]);
	if (cents % 25 == 0);
	System.out.println("Quarters: " + cents / 25);
	cents = cents % 25;
	if (cents % 10 == 0);
	System.out.println("Dimes: " + cents / 10);
	cents = cents % 10;
	if (cents % 5 == 0);
	System.out.println("Nickels: " + cents / 5);
	cents = cents % 5;
	if (cents % 1 == 0);
	System.out.println("Pennies: " + cents / 1);
	cents = cents % 1;
    }
}
