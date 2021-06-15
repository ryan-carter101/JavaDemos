import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/*takes a txt file as a command line argument, and develops a huffman tree according to it.
Huffman then creates a Gui to allow users to input different txt files, and ouputs compressed txt files.
*/
public class Huffman{
	public static void main(String[] args) {
		if (args.length!=1){
			System.out.println("Format is \"java huffman [filepath]\". Please try again.");
			return;
		}
		File source = new File(args[0]);
		try{
			Scanner in = new Scanner(source);

			in.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File "+args[0]+" does not exist!");
		}
	}
}
