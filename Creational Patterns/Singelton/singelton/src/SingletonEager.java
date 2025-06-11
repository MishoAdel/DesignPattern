public class SingletonEager {
    private  static  SingletonEager uniqueInstance = new SingletonEager();

    private int data = 0;

    private  SingletonEager(){}

    public static SingletonEager  getInstance(){
        return uniqueInstance;
    }

    public  void setData(int newData){
        data = newData;
    }

    public  int getData(){
        return data;
    }
}
