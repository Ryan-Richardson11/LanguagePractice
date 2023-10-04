class Employee {
    String name;
    int age;
    int salary;
    String location;

    public Employee(String name, int age, int salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary() {
        this.salary += 10000;
    }
}
