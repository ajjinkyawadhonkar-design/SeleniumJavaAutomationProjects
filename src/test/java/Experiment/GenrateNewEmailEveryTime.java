package Experiment;

import java.util.Date;

public class GenrateNewEmailEveryTime {

	public static void main(String[] args) {
		Date date = new Date() ;
		String dateString= date.toString();
		String noSpaceDateString = dateString.replaceAll(" ","");
		String NoSymbolDate = noSpaceDateString.replaceAll("\\:","");
		String EmailNew = NoSymbolDate+"@gmail.com";
		System.out.print(EmailNew);
		
	}

}
//new Date().toString().replaceAll(" ","").replaceAll("\\:","")+"@gmail.com";
 