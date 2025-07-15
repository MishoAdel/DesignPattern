interface Employee {
    public void showEmployeeDetails();
}

class Developer implements Employee{

    private String name;
    private long empID;
    private String position;

    Developer(String name,long empID, String position){
        this.empID = empID;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empID + " " + name + " " + position);
    }
}

class Manager implements Employee{

    private String name;
    private long empID;
    private String position;

    Manager(String name,long empID, String position){
        this.empID = empID;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empID + " " + name + " " + position);
    }
}