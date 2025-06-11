// Synchronized method
public class SingletonSynchronized {
    private  static  SingletonSynchronized uniqueInstance = null;

    private int data = 0;

    private  SingletonSynchronized(){}

    public static synchronized SingletonSynchronized  getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SingletonSynchronized() ;
        return uniqueInstance;
    }

    public  void setData(int newData){
        data = newData;
    }

    public  int getData(){
        return data;
    }
}
