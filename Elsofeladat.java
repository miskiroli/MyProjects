package elso.feladat;

import java.util.Random;

public class Elsofeladat {

	public static void main(String[] args) {
		int paros�sszeg =0;
		int paratlan�sszeg=0;
		Random rn = new Random();

		for(int i =0; i < 100; i++)
		{
		    int randomnumb = rn.nextInt(200) + 1;
		  
		    if((randomnumb %2) ==0) {
		    	  paros�sszeg= paros�sszeg+randomnumb;
		    	 }
		   else  {
		    		paratlan�sszeg=paratlan�sszeg+randomnumb;
		    	}
		    }
		
		System.out.println("P�rosszamok �sszege: " + paros�sszeg);
		System.out.println("P�ratlansz�mok �sszege: " + paratlan�sszeg);
		    
		}
		
		
	}


