// java標準ライブラリ　ハンドモーション操作用
import java.util.Random;

/**
 * 祭りの様子を再現したクラス（フラフェスティバル版）
 * 
 * @author H.Aoki
 * @reviewer Y.Ashihara
 */
public class HulaFestival extends Festival{
    
    /**
     * 祭りの名前（フラフェスティバル版）
     */
    private final String  FESTIVAL_NAME = "フラフェスティバル";

    /**
     * ダンスの名前（フラフェスティバル版）
     */
    private final String  DANCE_NAME = "フラダンス";

    /**
     * ハンドモーション（フラダンスの振り付け）
     */
    private final String HANDMOTIONS[] = {

        "フラ", "アロハ", "オエ", "クウ", "ナニ", "プウヴァイ", "オナオナ", "ホイマイ", 
        "ナオ", "プア", "レイ", "マカニ", "マヒナ", "ウア", "ラウ", "アイナ" 

    };

    /**
     * フラフェスティバルでできることを再現するため、クラスに存在するメソッドを呼び出す。
     */
    public void perform() {
        
        this.join();
        this.dance();
        this.appreciate();

    }

    /**
     * 祭りの名前（フラフェスティバル版）を取得し、応答する。
     * 
     * @return 祭りの名前（フラフェスティバル版）の文字列
     */
    public String getFestivalName() {

        return this.FESTIVAL_NAME;

    }

    /**
     * ダンスの名前（フラフェスティバル版）を取得し、応答する。
     * 
     * @return ダンスの名前（フラフェスティバル版）の文字列
     */
    public String getDanceName() {

        return this.DANCE_NAME;

    }

    /**
     * フラダンスを踊る。
     */
    public void dance() {

        System.out.println(getDanceName() + "を踊ろう！");
        
        for(int cnt = 0; cnt < 3; cnt++) {
            
            Random random     = new Random(); 
            String handmotion = this.HANDMOTIONS[(int)(random.nextInt(this.HANDMOTIONS.length))]; // ハンドモーション（振り付け）の取得
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
