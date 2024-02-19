import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        // Create a new object of type Scanner that reads from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Loop for entering information for multiple movies
        while (true) {
            // Create a new movie object
            Movie movie = new Movie();

            // Prompt the user to enter the title of a movie
            System.out.println("Enter the title of a movie: ");
            String title = scanner.nextLine();

            // Set the title in the movie object
            movie.setTitle(title);

            // Prompt the user to enter the movie’s rating
            System.out.println("Enter the movie's rating: ");
            String rating = scanner.nextLine();

            // Set the rating in the movie object
            movie.setRating(rating);

            // Prompt the user to enter the number of tickets sold at a (unnamed) theater
            System.out.println("Enter the number of tickets sold: ");
            int tickets = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left in the buffer

            // Set the number of tickets sold in the movie object
            movie.setSoldTickets(tickets);

            // Print out the information using the movie’s toString method
            System.out.println("Movie Information:");
            System.out.println(movie.toString());

            // Ask the user if they want to enter another movie
            System.out.println("Do you want to enter another? (y or n): ");
            String continueResponse = scanner.nextLine().toLowerCase();

            // Check if the user wants to continue, break the loop if not
            if (!continueResponse.equals("y")) {
                break;
            }
        }

        // Close the scanner outside the loop
        scanner.close();
    }
}
