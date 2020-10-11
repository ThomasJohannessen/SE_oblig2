package no.thomasj.leapYear;
import java.util.Scanner;

public class leapYearChecker {
    public static void main(String[] args) {

       leapYearChecker inputYear = new leapYearChecker();

       //input
       int year =  Integer.parseInt(inputYear.getInput());

       //sender input inn og får returnert om det er skuddår ifa. en boolien
       boolean inputyear_leapyear_check = inputYear.isLeapYear(year);

       //sender årstall og bollienen fra over til en ny funkjson som skriver ut resultatet i terminal.
       inputYear.output(year, inputyear_leapyear_check);
    }



    public String getInput() {

        //lser inn årstall ved bruk av scanner
        Scanner Scnr = new Scanner(System.in);
        System.out.println("Skriv inn årstallet du ønsker å sjekke om er et skuddår: ");
        //variabalen brukes til å teste input
        String input_arstall = Scnr.nextLine();
        return input_arstall;
    }

    public boolean isLeapYear(int year) {

        //blitt testet enkeltvis først, for så å refactorere til en stor if
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

        /*siden dette er en void og skriver ut i konsoll er det vanskelig å få testet denne, men men så lenge de
         resterende testene går gjennom og blir godkjent er denne også forbentet å fungere da den har svært lite logikk,
          kun for lagdeling. Ved videreutvikkling kunne man lagt inn tester her ved mer avansert output.
         */

            if (result_from_checker){
                System.out.println("Året " + year + " er et skuddår. Husk å planlegg for den ekstra dagen 29.februar!");
            }
            else{
                System.out.println("Året " + year + " er ikke et skuddår");
            }
    }

}