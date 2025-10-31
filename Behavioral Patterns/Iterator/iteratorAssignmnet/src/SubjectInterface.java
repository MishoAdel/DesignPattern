import java.util.LinkedList;

public interface SubjectInterface {
    Iterator createIterator();
}

class Arts implements  SubjectInterface{
    private  String[] subjects;

    public Arts(){
        subjects = new String[2];
        subjects[0] = "Arabic";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtIterator(subjects);
    }
}

class Science implements  SubjectInterface{
    private LinkedList<String> subjects;

    public Science(){
        subjects = new LinkedList<String>();
        subjects.add( "Biology");
        subjects.add( "Math");
        subjects.add( "Physics");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
