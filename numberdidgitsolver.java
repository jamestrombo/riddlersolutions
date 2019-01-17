import java.math.BigInteger;
/*
https://fivethirtyeight.com/features/in-space-no-one-can-hear-your-3d-printer-die/
*/
public class NumberSolverMain {
	public static void main(String [] args) {
	BigInteger number = new BigInteger("530131801762787739802889792754109700000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger numberpt2 = new BigInteger("139358547710066257652050346294484433323974747960297803292989236183040000000000");
	BigInteger didgit1 = new BigInteger("1000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit2 = new BigInteger("2000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit3 = new BigInteger("3000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit4 = new BigInteger("4000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit5 = new BigInteger("5000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit6 = new BigInteger("6000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit7 = new BigInteger("7000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit8 = new BigInteger("8000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit9 = new BigInteger("9000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger didgit0 = new BigInteger("0000000000000000000000000000000000000000000000000000000000000000000000000000000");
	BigInteger numberdidgit1 = number.add(didgit1).add(numberpt2);
	BigInteger numberdidgit2 = number.add(didgit2).add(numberpt2);
	BigInteger numberdidgit3 = number.add(didgit3).add(numberpt2);
	BigInteger numberdidgit4 = number.add(didgit4).add(numberpt2);
	BigInteger numberdidgit5 = number.add(didgit5).add(numberpt2);
	BigInteger numberdidgit6 = number.add(didgit6).add(numberpt2);
	BigInteger numberdidgit7 = number.add(didgit7).add(numberpt2);
	BigInteger numberdidgit8 = number.add(didgit8).add(numberpt2);
	BigInteger numberdidgit9 = number.add(didgit9).add(numberpt2);
	BigInteger numberdidgit0 = number.add(didgit0).add(numberpt2);
	BigInteger zero = new BigInteger(Integer.toString(0));
	int runthroughs = 1;
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit1, zero);
	System.out.println(number.add(didgit1).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit2, zero);
	System.out.println(number.add(didgit2).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit3, zero);
	System.out.println(number.add(didgit3).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit4, zero);
	System.out.println(number.add(didgit4).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit5, zero);
	System.out.println(number.add(didgit5).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit6, zero);
	System.out.println(number.add(didgit6).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit7, zero);
	System.out.println(number.add(didgit7).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit8, zero);
	System.out.println(number.add(didgit8).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit9, zero);
	System.out.println(number.add(didgit9).add(numberpt2));
	System.out.println("Testing " + runthroughs + "...");
	runthroughs++;
	calculate(numberdidgit0, zero);
	System.out.println(number.add(didgit0).add(numberpt2));
	}
	public static void calculate (BigInteger numberdidgit, BigInteger zero) {
	for (int i=2;i<=99;i++) {
		boolean candivide = true;
		while (candivide) {
		BigInteger temp = new BigInteger(Integer.toString(i));
		int snyder = numberdidgit.mod(temp).compareTo(zero);
		if (snyder==0) {
			numberdidgit = numberdidgit.divide(temp);
		}
		else {
			candivide=false;
		}
		}
	}
	System.out.println(numberdidgit);
	
	}
}
