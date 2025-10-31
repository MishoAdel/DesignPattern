import java.util.LinkedList;

public interface Iterator {
    String first();
    String next();
    boolean isDone();
    String currentItem();
}

class  ArtIterator implements Iterator{
    int pos;
    String[] subjects;

    ArtIterator(String[] subjects){
        pos = 0;
        this.subjects = subjects;
    }

    @Override
    public String first() {
        return subjects[0];
    }

    @Override
    public String next() {
        return subjects[pos++];
    }

    @Override
    public boolean isDone() {
        return pos>= subjects.length || subjects[pos]== null;
    }

    @Override
    public String currentItem() {
        return subjects[pos];
    }
}

class  ScienceIterator implements Iterator{
    int pos;
    LinkedList<String> subjects;

    ScienceIterator(LinkedList<String> subjects){
        pos = 0;
        this.subjects = subjects;
    }

    @Override
    public String first() {
        return subjects.getFirst();
    }

    @Override
    public String next() {
        return subjects.get(pos++);
    }

    @Override
    public boolean isDone() {
        return pos>= subjects.size() || subjects.get(pos)== null;
    }

    @Override
    public String currentItem() {
        return subjects.get(pos);
    }
}