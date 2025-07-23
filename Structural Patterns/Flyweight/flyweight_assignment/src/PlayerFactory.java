import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static Map<String,PlayerInterface> players = new HashMap<String,PlayerInterface>();

    public static PlayerInterface getPlayer(String type) throws  Exception {
        PlayerInterface player = null;

        if(players.containsKey(type)){
            player = players.get(type);
        } else {
            switch (type){
                case "terrorist":
                    System.out.println("We don't have a terrorist player, we are creating a new one");
                    player = new Terrorist();
                    players.put("terrorist",player);
                    break;
                case "counter terrorist":
                    System.out.println("We don't have a counter terrorist player, we are creating a new one");
                    player = new CounterTerrorist();
                    players.put("counter terrorist",player);
                    break;
                default:
                    throw  new Exception("Player factory only produces terrorist or counter terrorist players");
            }
        }
        return player;
    }
}
