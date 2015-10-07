package taxperson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxPerson {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ENTER THE COST OF ITEM :");
		double cost  = Double.parseDouble(br.readLine());
		
		System.out.println("WHETHER THE ITEM IS NECCESSARY OR LUXURY");
		System.out.println("TYPE a FOR LUXURY");
		System.out.println("TYPE b FOR NECCESSARY ITEM");
		
		String s = br.readLine();
		char choice = s.charAt(0);
		
		double result=0.0;
		
		boolean flag = false;
		
		do{
		switch(choice){
			case 'a':
				result = cost + (cost)*0.09;
				break;
			case 'b':
				result = cost + (cost)*.01;
				break;
			default:
				System.out.println("ENTER VALID ENTRY");
				flag = true;
		}	
		}while(flag);
		
		System.out.println("RESULT IS :"+result);
	}

}
