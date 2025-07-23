import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet{
    private RealInternet realInternet;

    private List<String> restrictedSties = new ArrayList<String>();
    InternetProxy(){
        restrictedSties.add("site1");
        realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String site) {
            if(restrictedSties.contains(site)){
                System.out.println("Access Denied");
            } else{
                realInternet.connectTo(site);
            }
    }
}
