package no.thomasj.leapYear;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapYearChecker {
    public static void main(String[] args) throws IOException {
        /*leapYear prog = new leapYear();
        System.out.println(prog.message());*/

        leapYearChecker inputYear = new leapYearChecker();

        int year =  Integer.parseInt(inputYear.getInput());

        boolean inputyear_leapyear_check = inputYear.isLeapYear(year);

        if (inputyear_leapyear_check){
            System.out.println("Året " + year + " er et skuddår. Husk å planlegg for den ekstra dagen 29.februar!");
        }
        else{
            System.out.println("Året " + year + " er ikke et skuddår");
        }
    }

    /*public String message() {
        return "Hello";
    }*/

    public String getInput() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Skriv inn årstallet du ønsker å sjekke om er et skuddår: ");
        String input_arstall = input.readLine();
        return input_arstall;
    }


    public boolean isLeapYear(int year) {

        if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
            return true;
        }

        else if(((year % 400) != 0) && ((year % 100) == 0) || ((year % 4) != 0)){
            return false;
        }
        else{
            System.out.println("Noe gikk galt og beregningen er ikke korrekt. Err: isLeapYear_Error");
            return false;
        }
    }

}