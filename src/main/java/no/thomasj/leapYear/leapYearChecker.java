package no.thomasj.leapYear;
import java.util.Scanner;

public class leapYearChecker {
    public static void main(String[] args) {

       leapYearChecker inputYear = new leapYearChecker();

       int year =  Integer.parseInt(inputYear.getInput());

       boolean inputyear_leapyear_check = inputYear.isLeapYear(year);

       inputYear.output(year, inputyear_leapyear_check);
    }



    public String getInput() {

        Scanner Scnr = new Scanner(System.in);
        System.out.println("Skriv inn årstallet du ønsker å sjekke om er et skuddår: ");
        String input_arstall = Scnr.nextLine();
        return input_arstall;
    }

    public boolean isLeapYear(int year) {

        if (((year % 4) != 0) || ((year % 400) != 0) && ((year % 100) == 0) || ((year % 4000) == 0))
            return false;
        else if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0))
            return true;
        else{
            System.out.println("Noe gikk galt og beregningen er ikke korrekt. Err: isLeapYear_Error");
            return false;
        }
    }

    public void output(int year, boolean result_from_checker){

            if (result_from_checker){
                System.out.println("Året " + year + " er et skuddår. Husk å planlegg for den ekstra dagen 29.februar!");
            }
            else{
                System.out.println("Året " + year + " er ikke et skuddår");
            }
    }

}