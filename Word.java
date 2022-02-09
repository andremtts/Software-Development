package Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Word {

	public static void main(String[] args) throws IOException {

		//Creating input for poem
		FileInputStream poem = new FileInputStream(""); // Insert poem file inside " "
		
		//Creating Scanner
		Scanner scanner = new Scanner(poem);
		
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		while(scanner.hasNext()) {
			
			String nextWord = scanner.next();
			
			if(words.contains(nextWord)) {
				int index = words.indexOf(nextWord);
				count.set(index, count.get(index)+1);
		}
			else {
				words.add(nextWord);
				count.add(1);
			}
	}
		scanner.close();
		poem.close();
		
		
		for(int i = 0; i < 19; i++) {
			System.out.print(words.get(i) +", " +count.get(i));
		}
}
}
