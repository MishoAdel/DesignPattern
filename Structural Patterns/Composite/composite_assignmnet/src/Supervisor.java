import java.util.ArrayList;
import java.util.List;

public class Supervisor implements FacultyInterface{
    private String departmentName;
    private String name;

    private List<FacultyInterface> myFacultyList = new ArrayList<FacultyInterface>();

    Supervisor(String name, String departmentName){
        this.name = name;
        this.departmentName = departmentName;
    }

    public void add(FacultyInterface prof){
        myFacultyList.add(prof);
    }

    public void remove(FacultyInterface prof){
        myFacultyList.remove(prof);
    }

    public List<FacultyInterface> getFaculty(){
        return this.myFacultyList;
    }

    @Override
    public String getDetails() {
        return name + " is the " + departmentName;
    }
}
