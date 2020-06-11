package employee;

import java.util.Scanner;

/**
 *
 * @author SamyB
 */

/*

Instructions:

Imagine you are an employer assigning information to your new employee. 

The application should do the following:

- List an email including the employee's first name, last name, sector, and  company
- Grants input for a certain sector to choose
- Generate an identification number
- Methods to change an identification number, set an annual wage, and include an additional email
- Getters to display the name, email, and annual wage of your employee as a summary of the information
        
*/

public class Employee {

    // Encapsulation
    
    private String firstName;
    private String lastName;
    private String email;
    private String sector;
    private String identification;
    private int defaultAnnualWage = 20000;
    private int defaultIdentificationLength = 10;
    private String companySite = "sciencespire.com";
    private String diffEmail;

    
    // firstName and lastName parameters
    
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Employee's Name: " + this.firstName + " " + this.lastName);
        
        
        // method call for sector
        this.sector = setSector();
        System.out.println("Employee's sector is: " + this.sector);
        
        // method call for random ID number
        this.identification = randomIdentification(defaultIdentificationLength);
        System.out.println("Employee's ID number: " + this.identification);
        
        // email concatenation
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + sector + "." + companySite;
        System.out.println("Employee's email: " + email);
    }
    
    
    // asking for sector entry
    
    private String setSector() {
        System.out.print("Sector Entries:\n1 for Finance\n2 for Production\n3 for R & D\n0 for none\nPlease enter a sector number: ");
        Scanner sc = new Scanner(System.in);
        int secPick = sc.nextInt();
        if (secPick == 1)
            return "finance";
        else if (secPick == 2)
            return "production";
        else if (secPick == 3)
            return "research";
        else
            return "N/A";
    }
    

    // random ID number generation
    
    private String randomIdentification(int length) {
        String identificationSet = "123456789";
        char[] identification = new char[length];
        for (int i = 0; i < identification.length; i++) {
            int random = (int) (Math.random() * identificationSet.length());
            identification[i] = identificationSet.charAt(random);
        }
        
        
        return new String(identification);
    }
    
    // getters and setters
    
    public void setDiffEmail(String diffEmail) {
        this.diffEmail = diffEmail;
    }
    
    public String getDiffEmail() {
        return diffEmail;
    }
    
    public void setAnnualWage(int wage) {
        this.defaultAnnualWage = wage;
    }
    
    public int getAnnualWage() {
        return defaultAnnualWage;
}
    
    public String getIdentification() {
        return identification;
    }
    
    public String summFacts() {
        return "Display Name: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nAnnual Wage: " + "$" + defaultAnnualWage;
    }
    
}
