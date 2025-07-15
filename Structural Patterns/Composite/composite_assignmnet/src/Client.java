import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor techDean = new Supervisor("Mike","Dean of Tech");
        Supervisor mathChair = new Supervisor("John","Chair of Math");
        Supervisor csChair = new Supervisor("Tom","Chair of Computer Science");

        Professor mathProf1 = new Professor("Paul","Adjunct",101);
        Professor mathProf2 = new Professor("Jack","Associate",102);

        Professor csProf1 = new Professor("Brad","Adjunct",201);
        Professor csProf2 = new Professor("Nick","Professor",202);
        Professor csProf3 = new Professor("Mark","Professor",203);

        techDean.add(mathChair);
        techDean.add(csChair);

        mathChair.add(mathProf1);
        mathChair.add(mathProf2);

        csChair.add(csProf1);
        csChair.add(csProf2);
        csChair.add(csProf3);

        List<FacultyInterface> chairs = techDean.getFaculty();
        for(int i = 0; i< chairs.size(); i++){
            System.out.println(chairs.get(i).getDetails());
        }

        List<FacultyInterface> cseProfs = csChair.getFaculty();
        for(int i = 0; i< cseProfs.size(); i++){
            System.out.println(cseProfs.get(i).getDetails());
        }

        List<FacultyInterface> mathProfs = mathChair.getFaculty();
        for(int i = 0; i< mathProfs.size(); i++){
            System.out.println(mathProfs.get(i).getDetails());
        }
    }
}
