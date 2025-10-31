import java.util.ArrayList;
import java.util.List;

public interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);

    public void notifyObservers();

    public Object getUpdate(Observer obj);
}

class MyTopic implements Subject{

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer obj) {
        if(obj  == null)
            throw new NullPointerException("Null Observer");
        if(!observers.contains(obj))
            observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
    observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        if(!changed)
            return;
        observersLocal = new ArrayList<Observer>();
        this.changed = false;
        for(Observer observer : observers){
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public  void postMessage(String msg){
        System.out.println("Message posted to Toic: "+ msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }

}
