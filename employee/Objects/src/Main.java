public class Main {

    public static void main(String[] args) {
        Employee newEmployee1 = new Employee("John", 33, 55000, "New York");
        Employee newEmployee2 = new Employee("Mary", 52, 70000, "Boston");
        System.out.println(newEmployee1.salary);
        System.out.println(newEmployee2.salary);
        newEmployee2.raiseSalary();
        System.out.println(newEmployee2.salary);
    }
}