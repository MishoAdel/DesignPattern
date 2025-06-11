public class SingletonDoubleChecked {
    private volatile static SingletonDoubleChecked uniqueInstance = null;

    private int data = 0;

    private SingletonDoubleChecked(){}

    public static SingletonDoubleChecked getInstance(){
        if(uniqueInstance == null)
            synchronized (SingletonSynchronized.class){
            if(uniqueInstance == null)
                uniqueInstance = new SingletonDoubleChecked() ;
        }
        return uniqueInstance;
    }

    public  void setData(int newData){
        data = newData;
    }

    public  int getData(){
        return data;
    }
}
