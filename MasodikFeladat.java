package masodik.feladat;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MasodikFeladat {
	
static Random rand = new Random();
	
	private static ArrayList<Integer> uploadArray(){
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 1; i <= 90; i++){
			numbers.add(i);
		}
		return numbers;
	}

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("lotto2018.txt");
			PrintWriter pw = new PrintWriter(fw);
			ArrayList<Integer> numbers = uploadArray();
			
			for(int i = 0; i < 52; i++){
				ArrayList<Integer> week = new ArrayList<>();
				for(int j = 0; j < 5; j++) {
					int randomNum = rand.nextInt(numbers.size());
					week.add(numbers.get(randomNum));
					numbers.remove(randomNum);
				}
				Collections.sort(week);
				pw.print(week.get(0));
				for(int k = 1; k < 5; k++)
				pw.print(" " + week.get(k));
				if(i != 51)
				pw.println();
				pw.flush();
				numbers = uploadArray();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
