import java.util.Scanner;

public class meditation_goal {

    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]) /* this main method calls the three other methods & 
                                        accepts the return values from  */
    {
        double hours_to_Meditate, commited_days, average_hours_week;
        hours_to_Meditate = hours_want_Meditate();
        commited_days = commitment_days();
        average_hours_week = average_hours_Meditate(hours_to_Meditate, commited_days);

        /* PLEASE DISREGARD: I was trying to create a conversion method so it won't be a decimal but I couldn't do it. */
        //conversion(average_hours_week); 

        int final_hours_meditate = (int) hours_to_Meditate;
        int final_committment = (int) commited_days;

        System.out.println("In order to meditate for " + final_hours_meditate + " hours with your given commitment of " + final_committment); 
        System.out.printf(" days you will need to meditate for %s on your committed days. ", conversion(average_hours_week));

    }
    static double hours_want_Meditate() /* METHOD: this function collects the amount of hours a user wants to 
                                        meditate a week & returns it as a double back to our main function */
    {
        double meditation_goal_inHours;

        do
        {
            System.out.println("How many hours do you want to meditate each week? ");
            meditation_goal_inHours = scan.nextDouble();

            if(meditation_goal_inHours < 0 || meditation_goal_inHours > 168) //only 168hrs in a week
            {
                System.out.println("Please enter a correct amount of hours.");
            }
        } while(meditation_goal_inHours < 0 || meditation_goal_inHours > 168);

        return meditation_goal_inHours;
    }

    static double commitment_days() /* METHOD: this function collects the number of days a user can commit to 
                                     meditate a week & returns it as a double back to our main function */
    {
        double days_can_commit;

        do
        {
            System.out.println("Please enter how many days a week you can commit to? ");
            days_can_commit = scan.nextDouble();

            if (days_can_commit < 0 || days_can_commit > 7) //only 7 days in the week
            {
                System.out.println("Please enter a valid number of days. ");
            }
        } while (days_can_commit < 0 || days_can_commit > 7);

        return days_can_commit;
    }

    static double average_hours_Meditate(double hours_to_Meditate, double commited_days)
    /* METHOD: this function finds the average of how many days user must meditate in regards to given days
     * then returns it back to the main method.
     */
    {
        double average_in_decimal;
    
        average_in_decimal = hours_to_Meditate/commited_days;

        return average_in_decimal;
    }

   /* PLEASE DISREGARD: This method was supposed to be a conversion method so my average 
   meditation time wouldn't be a decimal. Alas, this method doesn't work correctly.*/
   
    static String conversion(double average)
    {
        int hours_to_convert = (int)average;
        double decimals_to_convert = average - hours_to_convert;
        int minutes_to_convert = (int) (decimals_to_convert * 60);

        return hours_to_convert + " hours and " + minutes_to_convert + " minutes";
    }


}
