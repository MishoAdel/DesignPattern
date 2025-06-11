public class Client {

    public static  void main(String[] args) {
//        Lazy instantiation
//        Singleton singleton1  = Singleton.getInstance();
//        singleton1.setData(55);
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton2.getData());

//        Synchronized Method
//        SingletonSynchronized singleton1  = SingletonSynchronized.getInstance();
//        singleton1.setData(55);
//        SingletonSynchronized singleton2 = SingletonSynchronized.getInstance();
//        System.out.println(singleton2.getData());

//        Double-checked method
//        SingletonDoubleChecked singleton1  = SingletonDoubleChecked.getInstance();
//        singleton1.setData(55);
//        SingletonDoubleChecked singleton2 = SingletonDoubleChecked.getInstance();
//        System.out.println(singleton2.getData());

//        Eager initialization method
//        SingletonEager singleton1  = SingletonEager.getInstance();
//        singleton1.setData(55);
//        SingletonEager singleton2 = SingletonEager.getInstance();
//        System.out.println(singleton2.getData());

//        Big Pugh method
        SingletonBigPugh singleton1  = SingletonBigPugh.getInstance();
        singleton1.setData(55);
        SingletonBigPugh singleton2 = SingletonBigPugh.getInstance();
        System.out.println(singleton2.getData());
    }
}
