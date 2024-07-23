import java.util.Scanner;

public class Name{
    String firstname,middlename,lastname;
    
    public static void main(String args[]){
       Scanner scanner = new(system.in);
       
       System.out.println("Enter the first name: ");
       firstname = scanner.nextLine();
       System.out.println("Enter the middle name: ");
       middlename = scanner.nextLine();
       System.out.println("Enter the last name: ");
       lastname = scanner.nextLine();
       
       StringBuilder sb = new StringBuilder(); 
             sb.append(lastname); 
             sb.append(","); 
             sb.append(firstname); 
             sb.append(middlename);
             String name = sb.toString();
    System.out.println("%s",name);
    }
    }
