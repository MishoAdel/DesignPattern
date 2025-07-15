public interface FacultyInterface {
    String getDetails();
}

class Professor implements FacultyInterface{

    int officeNumber;
    String name;
    String position;

    Professor(String name, String position, int officeNumber){
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;

    }

    @Override
    public String getDetails() {
        return "Name: "+ name + ", Position: " + position+", Office Number: "+ officeNumber;
    }
}

