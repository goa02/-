import java.util.ArrayList;
import java.util.List;

/**
 * @author H.Aoki
 * @reviewer Y.Ashihara
 */
public class Main extends Object{
    public static void main(String[] args) {
    
        List<Festival> festivals = new ArrayList<>();

        festivals.add(new HulaFestival());
        festivals.add(new RioCarnival());
        festivals.add(new SevilleAprilFair());

        for(Festival festival : festivals) {

            festival.perform();
            System.out.println(""); // 改行
            
        }
    
    }
     
}
