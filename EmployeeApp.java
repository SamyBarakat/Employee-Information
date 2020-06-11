package employee;

/**
 *
 * @author SamyB
 */

public class EmployeeApp {
  
    public static void main(String[] args) {
        
        // Constructed Object
        Employee em1 = new Employee("Samy", "Barakat");
        System.out.println("----------------------");
        System.out.println("Reduced Information:\n----------------------");
        System.out.println(em1.summFacts());
        
    }
}
