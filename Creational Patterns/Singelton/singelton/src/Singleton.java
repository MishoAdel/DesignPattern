//lazy instantiation method
public class Singleton {
        private  static  Singleton uniqueInstance = null;

        private int data = 0;

        private  Singleton(){}

        public static Singleton  getInstance(){
            if(uniqueInstance == null)
                uniqueInstance = new Singleton() ;
            return uniqueInstance;
        }

        public  void setData(int newData){
            data = newData;
        }

        public  int getData(){
            return data;
        }
}
