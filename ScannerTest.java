//February 18 is a special date for the CCC this year.
//Write a program that asks the user for a numerical month and numerical day //of the month and then
//determines whether that date occurs before, after, or on February 18.
//If the date occurs before February 18, output the word Before. If the date //occurs after February
//18, output the word After. If the date is February 18, output the word //Special.




import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class ScannerTest{  
    public static void main(String[]args){
    int month = 2;
    int day = 18;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the Date dd/mm/yyyy");
    String date = sc.next();
    SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
    Date date2 = null;
    try {
        //parsing the string
    date2 = dateformat.parse(date);
    } catch(ParseException e) {
        e.printStackTrace();
    }
    System.out.println(date2);
    if(month == 2 )
        if (day == 18 ) { 
            System.out.println("Special");
        } else if(day > 18 ) {
            System.out.println("After");
        } else {
            System.out.println("Before");
            
    } else if(month > 2 ) {
        System.out.println("After");
    } else 
        System.out.println("Before");
        } 
  }