import java.util.Scanner;

class Employee {
  private int id;
  private int age;
  
  public Employee(int id, int age) {
    this.id = id;
    this.age = age;
  }
  
  public int getId() {
    return id;
  }
  
  public int getAge() {
    return age;
  }
}

public class EmployeeArray {
  public static void main(String[] args) {
    Scanner str = new Scanner(System.in);
    
    
    int n = str.nextInt();
    
   
    if (n < 1 || n > 10) {
      System.out.println("Invalid input");
      return;
    }
    
   
    Employee[] employees = new Employee[n];
    
    for (int i = 0; i < n; i++) {
     
      int id = str.nextInt();
      int age = str.nextInt();
      
      
      if (id < 10 || id > 1000 || age < 18 || age > 50) {
        System.out.println("Invalid data");
        return;
      }
      
      
      employees[i] = new Employee(id, age);
    }
    
    
    int smallestAge = Integer.MAX_VALUE;
    int smallestAgeId = -1;
    for (int i = 0; i < n; i++) {
      Employee e = employees[i];
      if (e.getAge() < 30) {
        
        if (e.getAge() < smallestAge) {
          smallestAge = e.getAge();
          smallestAgeId = e.getId();
        }
      }
    }
    
   
    if (smallestAgeId != -1) {
      System.out.println(  +smallestAgeId+ " "  +smallestAge);
    }
  }
}
