import java.util.Random;

/**
 * 祭りの様子を再現したクラス（セビリアの春祭り版）
 * 
 * @author H.Aoki
 * @reviewer Y.Ashihara
 */
public class SevilleAprilFair extends Object{
    
    /**
     * 祭りの名前（セビリアの春祭り版）
     */
    public final String  FESTIVAL_NAME = "セビリアの春祭り";  

    /**
     * ダンスの名前（セビリアの春祭り版）
     */
    public final String DANCE_NAME = "フラメンコ";

    /**
     * ハレオ（フラメンコの掛け声）
     */
    public String[] jaleos = {

        "アイ！", "オレ！", "アスーカ！" ,"ビエン！", "トカビエン！", "カンタビエン！",
        "バイラビエン！", "バジャ！", "アシ・セ・カンタ！", "アシ・セ・バイラ！"

    };

    public void go() {
        this.join();
        this.dance();
        this.rideCarriage();
    }


    /**
     * 
     * 
     * セビリアの春祭りに参加する。
     */
    public void join() {

        System.out.println("ようこそ、" + FESTIVAL_NAME + "へ！");

    }

    /**
     * 
     * 
     * フラメンコを踊る。
     */
    public void dance() {

        System.out.println(DANCE_NAME + "を踊ろう！");
        System.out.println("バモス・アジャ！"); // ショーや曲の初めなどによく用いられるハレオ

        for(int cnt = 0; cnt < 3; cnt++) {
            
            Random random = new Random(); 
            String jaleo  = jaleos[(int)(random.nextInt(jaleos.length))]; // ハレオ(掛け声)の取得
            System.out.print(jaleo);

        }

        System.out.println(""); // 改行

    }

    /**
     * 馬車に乗る。
     */
    public void rideCarriage() {

        System.out.println("馬車に乗って会場を巡ろう！");

    }

}