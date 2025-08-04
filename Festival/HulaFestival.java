import java.util.Random;

/**
 * 祭りの様子を再現したクラス（フラフェスティバル版）
 * 
 * @author H.Aoki
 * @reviewer Y.Ashihara
 */
public class HulaFestival extends Object{
    
    /**
     * 祭りの名前（フラフェスティバル版）
     */
    public final String  FESTIVAL_NAME = "フラフェスティバル";

    /**
     * ダンスの名前（フラフェスティバル版）
     */
    public final String  DANCE_NAME = "フラダンス";

    /**
     * ハンドモーション（フラダンスの振り付け）
     */
    public String handmotions[] = {
        "フラ", "アロハ", "オエ", "クウ", "ナニ", "プウヴァイ", "オナオナ", "ホイマイ", 
        "ナオ", "プア", "レイ", "マカニ", "マヒナ", "ウア", "ラウ", "アイナ" 
    };

    public void go() {
        this.join();
        this.dance();
        this.appreciate();
    }

    /**
     * 
     * 
     * フラフェスティバルに参加する。
     */
    public void join() {

        System.out.println("ようこそ、" + FESTIVAL_NAME + "へ！");

    }

    /**
     * 
     * 
     * フラダンスを踊る。
     */
    public void dance() {

        System.out.println(DANCE_NAME + "を踊ろう！");
        
        for(int cnt = 0; cnt < 3; cnt++) {
            
            Random random     = new Random(); 
            String handmotion = handmotions[(int)(random.nextInt(handmotions.length))]; // ハンドモーション（振り付け）の取得
            System.out.print(handmotion + "♪");

        }

        System.out.println(""); // 改行

    }

    /**
     * 感謝する。
     */
    public void appreciate() {

        System.out.println("自然、神々、家族、友達、過去、現在、全てに感謝！");
        
    }
}
