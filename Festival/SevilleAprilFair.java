import java.util.Random;

/**
 * 祭りの様子を再現したクラス（セビリアの春祭り版）
 * 
 * @author H.Aoki
 * @reviewer Y.Ashihara
 */
public class SevilleAprilFair extends Festival{
    
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

    /**
     * セビリアの春祭りでできることを再現するため、クラスに存在するメソッドを呼び出す。
     */
    @Override
    public void perform() {
        
        this.join();
        this.dance();
        this.rideCarriage();

    }

    /**
     * 祭りの名前（セビリアの春祭り版）を取得し、応答する。
     * 
     * @return 祭りの名前（セビリアの春祭り版）の文字列
     */
    public String getFestivalName() {

        return this.FESTIVAL_NAME;

    }

    /**
     * ダンスの名前（セビリアの春祭り版）を取得し、応答する。
     * 
     * @return ダンスの名前（セビリアの春祭り版）の文字列
     */
    public String getDanceName() {

        return this.DANCE_NAME;

    }

    /**
     * フラメンコを踊る。
     */
    public void dance() {

        System.out.println(getDanceName() + "を踊ろう！");
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