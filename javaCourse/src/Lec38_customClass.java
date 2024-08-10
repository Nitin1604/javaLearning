class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}


public class Lec38_customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee nitin = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for nitin
        nitin.id = 12;
        nitin.salary = 34;
        nitin.name = "Nitin"; 

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        nitin.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        System.out.println(nitin.id);
        System.out.println(nitin.name);
    }
}
