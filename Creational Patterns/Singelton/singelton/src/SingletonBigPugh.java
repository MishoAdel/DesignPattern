public class SingletonBigPugh {

    private int data = 0;

    private  SingletonBigPugh(){}

    private static class SingletonHelper{
        private static final SingletonBigPugh uniqueInstance = new SingletonBigPugh();
    }

    public static SingletonBigPugh  getInstance(){
       return SingletonHelper.uniqueInstance;
    }

    public  void setData(int newData){
        data = newData;
    }

    public  int getData(){
        return data;
    }
}
