package harmadik.feladat;
import java.util.Scanner;

		
public class Main {

			
	public static void main(String[] args) {

				Names names = new Names();
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Please enter a name: ");
				String name = sc.nextLine();
				
				while(!name.equals("Számol")){
					names.putName(name);
					System.out.println("Please enter a name: ");
					name = sc.nextLine();
				}
				System.out.println(names);
			}

		}
