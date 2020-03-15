package elso.feladat;

import java.util.Random;

public class Elsofeladat {

	public static void main(String[] args) {
		int parosösszeg =0;
		int paratlanösszeg=0;
		Random rn = new Random();

		for(int i =0; i < 100; i++)
		{
		    int randomnumb = rn.nextInt(200) + 1;
		  
		    if((randomnumb %2) ==0) {
		    	  parosösszeg= parosösszeg+randomnumb;
		    	 }
		   else  {
		    		paratlanösszeg=paratlanösszeg+randomnumb;
		    	}
		    }
		
		System.out.println("Párosszamok összege: " + parosösszeg);
		System.out.println("Páratlanszámok összege: " + paratlanösszeg);
		    
		}
		
		
	}


