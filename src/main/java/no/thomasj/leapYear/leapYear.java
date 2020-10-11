package no.thomasj.leapYear;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapYear {
    public static void main(String[] args) throws IOException {
        /*leapYear prog = new leapYear();
        System.out.println(prog.message());*/

        leapYear inputYear = new leapYear();
        int year =  Integer.parseInt(inputYear.getInput());

        System.out.println(year);
        boolean input_leapyear_check = inputYear.isLeapYear();
        System.out.println(input_leapyear_check);
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


    public boolean isLeapYear() {
        return true;
    }

}