public class PayCalc {
	
	public static void calculate(int y, int p, float r){
		System.out.println("Monthly Payment: " + ((p * (Math.exp(y * r))) / 12));
		}
	public static void main(String [] args){
		int years = Integer.parseInt(args[0]);
		int princip = Integer.parseInt(args[1]);
		float rate = Float.parseFloat(args[2]);
		calculate(years, princip, rate);
		System.out.println();
	}
}