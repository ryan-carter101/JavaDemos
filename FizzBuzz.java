import java.util.Scanner;
//It's fizzbuzz. Everyone's favorite tool to weed out people who don't know what a modulus is.
public class FizzBuzz{
	public static void main(String args[]){
		//Ususally you're just asked to write the fizzbuzz method, but this shell is convenient, so we'll toss it in.
		Scanner in = new Scanner(System.in);
		System.out.println("Please input an integer: ");
		int x = in.nextInt();
		System.out.println(fizzBuzz(x));
		in.close();
	}
	public static String fizzBuzz(int i){
		String ret = "";
		if(i%3 ==0){
			ret+="Fizz";
		}
		if(i%5 ==0){
			ret+="Buzz";
		}
		if(ret.length()==0){
			ret = String.valueOf(i);
		}
		return ret;
	}
}