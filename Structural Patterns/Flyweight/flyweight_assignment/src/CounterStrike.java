import java.util.Random;

public class CounterStrike {
    private static final  String[] playerType = {"terrorist","counter terrorist"};

    private static final String[] weapons = {"AK-47","M16","Gut Knife","Desert Eagle"};

    public static String getRandomPlayerType(){
        Random r = new  Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }

    public static String getRandomWeapon(){
        Random r = new  Random();
        int randInt = r.nextInt(weapons.length);
        return weapons[randInt];
    }

    public static void main(String[] args) throws Exception {
        for(int i=0;i<10;i++){
            PlayerInterface P = PlayerFactory.getPlayer(getRandomPlayerType());
            P.assignWeapon(getRandomWeapon());

            P.mission();
        }

    }
}



