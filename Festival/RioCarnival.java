import java.util.Random;

/**
 * 祭りの様子を再現したクラス（リオのカーニバル版）
 * 
 * @author H.Aoki
 * @reviewer Y.Ashihara
 */

public class RioCarnival extends Object{
    
    /**
     * 祭りの名前（リオのカーニバル版）
     */
    public final String  FESTIVAL_NAME = "リオのカーニバル";

    /**
     * ダンスの名前（リオのカーニバル版）
     */
    public final String  DANCE_NAME = "サンバ";

    /**
     * サンバのステップ
     */
    public String steps[] = {

        "サンバ・ノ・ペ", "ジンガ", "パソ・バシーコ", "ジーロ", "バリーダ・ジ・クアドラ", "アポイオ",
        "キック・エ・ポイント", "カイーダ・ジ・ラテラウ", "マルカソン", "アバネイラ"

    };

    /**
     * 仮装する衣装の種類
     */
    public String costumes[] = {

        "ヒーロー", "動物", "サンバの衣装"

    };

    public void go() {
        this.join();
        this.dance();
        this.disguise();
    }

    /**
     * 
     * 
     * リオのカーニバルに参加する。
     */
    public void join() {

        System.out.println("ようこそ、" + FESTIVAL_NAME + "へ！");

    }

    /**
     * 
     * 
     * サンバを踊る。
     */
    public void dance() {

        System.out.println(DANCE_NAME + "を踊ろう！");
        System.out.println("エントラーダ♪"); // 登場のステップ

        for(int cnt = 0; cnt < 3; cnt++) {
            
            Random random = new Random(); 
            String step   = steps[(int)(random.nextInt(steps.length))]; // ステップの取得
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
        String costume = costumes[(int)(random.nextInt(costumes.length))]; // 衣装の取得

        System.out.println(costume + "に変身！");

    }

}