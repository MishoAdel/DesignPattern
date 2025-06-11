public class Captain {


    private  Captain(){}

    private static class SingletonHelper{
        private static final Captain uniqueInstance = new Captain();
    }

    public static Captain  getInstance(){
        return SingletonHelper.uniqueInstance;
    }
}

