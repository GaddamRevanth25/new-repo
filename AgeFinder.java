import java.time.LocalDate;
import java.util.Scanner;

public class AgeFinder {
	
	public static int[] convertToInt(String string[]) {
		int intString[] = new int[string.length];
		int i=0;
		for(String j : string) {
			intString[i] = Integer.parseInt(j);
			i++;
		}
		return intString;
	} 

	public static String getAge(String dateOfBirth) {
		int years,months,days;
		String age = "Invalid Year Input";
		LocalDate currentDate = LocalDate.now();
		
		int currentDateSplit[] = AgeFinder.convertToInt(currentDate.toString().split("-"));
		int dateOfBirthSplit[] = AgeFinder.convertToInt(dateOfBirth.split("-"));
		
		
		if(currentDateSplit[0] >= dateOfBirthSplit[0]) {
			
		years = dateOfBirthSplit[1] > currentDateSplit[1]?(currentDateSplit[0]-dateOfBirthSplit[0])-1 : currentDateSplit[0]-dateOfBirthSplit[0];
		months = ( dateOfBirthSplit[2] > currentDateSplit[2] ) ? ( ( dateOfBirthSplit[1] > currentDateSplit[1] ) ? ( (currentDateSplit[1] ) + (12 - dateOfBirthSplit[1]) -1) : ( currentDateSplit[1]-dateOfBirthSplit[1] ) -1 ) : ( ( dateOfBirthSplit[1] > currentDateSplit[1] ) ? ( (currentDateSplit[1] ) + (12 - dateOfBirthSplit[1]) -1) : ( currentDateSplit[1]-dateOfBirthSplit[1] ) );
		days = ( dateOfBirthSplit[2] > currentDateSplit[2] )? ( ( currentDateSplit[2]-dateOfBirthSplit[2] ) )+ 30 : ( currentDateSplit[2]-dateOfBirthSplit[2] );
		age = years + "years " + months +"Months " + days +"Days";
		
		return age;
		
		}
		else {
			
			return age;
			
		}
	}
	

	public static void main(String[] args) {
		//revanth the coder
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Date Of Birth (Format :- yyyy-mm-dd): ");
		String dateOfBirth = scn.nextLine();
		System.out.println(AgeFinder.getAge(dateOfBirth));
		scn.close();
	}

}
