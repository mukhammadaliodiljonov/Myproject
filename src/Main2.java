class Employee{
    String name;
    int salary;
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", 20000);
        System.out.println(e1.name);
        System.out.println(e1.salary);
    }
}
