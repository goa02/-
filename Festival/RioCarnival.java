import java.util.Random;

/**
 * 祭りの様子を再現したクラス（リオのカーニバル版）
 * 
 * @author H.Aoki
 * @reviewer Y.Ashihara
 */

public class RioCarnival extends Festival{
    
    /**
     * 祭りの名前（リオのカーニバル版）
     */
    public final String FESTIVAL_NAME = "リオのカーニバル";

    /**
     * ダンスの名前（リオのカーニバル版）
     */
    public final String  DANCE_NAME = "サンバ";

    /**
     * サンバのステップ
     */
    public final String STEPS[] = {

        "サンバ・ノ・ペ", "ジンガ", "パソ・バシーコ", "ジーロ", "バリーダ・ジ・クアドラ", "アポイオ",
        "キック・エ・ポイント", "カイーダ・ジ・ラテラウ", "マルカソン", "アバネイラ"

    };

    /**
     * 仮装する衣装
     */
    public final String COSTUMES[] = {

        "ヒーロー", "動物", "サンバの衣装"

    };

    /**
     * リオのカーニバルでできることを再現するため、クラスに存在するメソッドを呼び出す。
     */
    @Override
    public void perform() {
                
        this.join();
        this.dance();
        this.disguise();

    }

    /**
     * 祭りの名前（リオのカーニバル版）を取得し、応答する。
     * 
     * @return 祭りの名前（リオのカーニバル版）の文字列
     */
    public String getFestivalName() {

        return this.FESTIVAL_NAME;

    }

    /**
     * ダンスの名前（リオのカーニバル版）を取得し、応答する。
     * 
     * @return ダンスの名前（リオのカーニバル版）の文字列
     */
    public String getDanceName() {

        return this.DANCE_NAME;

    }

    /**
     * サンバを踊る。
     */
    public void dance() {

        System.out.println(getDanceName() + "を踊ろう！");
        System.out.println("エントラーダ♪"); // 登場のステップ

        for(int cnt = 0; cnt < 3; cnt++) {
            
            Random random = new Random(); 
            String step   = this.STEPS[(int)(random.nextInt(this.STEPS.length))]; // ステップの取得
            System.out.print(step + "♪ ");

        }

        System.out.println(""); // 改行
        System.out.println("サイーダ♪"); // パフォーマンス終わり際のステップ

    }

    /**
     * 仮装する。
     */
    public void disguise() {

        Random random  = new Random(); 
        String costume = this.COSTUMES[(int)(random.nextInt(this.COSTUMES.length))]; // 衣装の取得

        System.out.println(costume + "に変身！");

    }

}