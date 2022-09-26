import java.util.Scanner;

public class MovieDriver 
{
	public static void main(String[] args) 
	{   //creating a movie object
		Movie movieObject=new Movie();
		// creating a scanner object for user input
		Scanner myInput=new Scanner(System.in);
		// string to store the title of the movie
		String movieTitle;
		//string to store the Rating of the movie
		String movieRating;
		//string to store the user's yes or no response
		String selection;
		// while loop for user input
		while(true) 
		{	//ask user for the name of the movie
			System.out.println("Please enter the name of the movie ");			
			//store the imput in the movieTitle string
			movieTitle=myInput.nextLine();
			//uses the movie object to call setTitle method 
			movieObject.setTitle(movieTitle);
			//ask user for rating of movie
			System.out.println("Please enter the rating of the movie. (G, PG,PG13,R) ");
			// store input in movieRating String
			movieRating=myInput.nextLine();
			// uses the movie object to call the set rating method 
			movieObject.setRating(movieRating);
			// ask user for number of tickets sold
			System.out.println("How many tickets were sold for this movie? ");//asking user to enter number of tickets
			
			int thetickets=Integer.parseInt(myInput.nextLine());
			
			movieObject.setSoldTickets(thetickets);
			
			System.out.println(movieObject.toString());
			
			System.out.println("\nWant to enter another number? (yes or no)");
			
			selection =myInput.nextLine();
			
			if(selection.equals("yes")|| selection.equals("Yes")|| selection.equals("YES"))
			continue;
			else
			break;
		}
		System.out.println("Thank you and goodbye");
	}

}
	
	
	
	
	
	
		
