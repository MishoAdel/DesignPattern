public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("John",101, "Pro Developer");
        Employee dev2 = new Developer("Tom",102,"Entry Level Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Misho",201,"CEO");
        Employee man2 = new Manager("Nick",202,"Dev Manager");

        Directory arcDirectory = new Directory();
        arcDirectory.addEmployee(man1);
        arcDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(arcDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
