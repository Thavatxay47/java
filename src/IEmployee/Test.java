package IEmployee;
public class Test {
    public static void main(String[] args) {
        IEmployee employee1 = new PartTimeEmployee("The joey KEOBORLAKOT", 45000, 5);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        IEmployee employee2 = new FullTimeEmployee("Phonekham VILAYVONG", 65000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}