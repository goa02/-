/**
 * 祭りの様子を再現したクラス
 * 
 * @author H.Aoki
 * @reviewer Y.Ashihara
 */
public abstract class Festival extends Object{

    /**
     * 祭りでできることを再現するため、クラスに存在するメソッドを呼び出す。
     *
     * 具体的な祭りが定まらないのでここで実装できない。
     * 具体的な祭りが定まるクラスにおいて、実装すること。
     */
    public abstract void perform();
    

    /**
     * 祭りの名前を取得し、応答する。
     * 
     * 具体的な祭りが定まらないのでここで実装できない。
     * 具体的な祭りが定まるクラスにおいて、実装すること。
     * 
     * @return 祭りの名前の文字列
     */
    public abstract String getFestivalName();
    
    /**
     * ダンスの名前を取得し、応答する。
     * 
     * 具体的な祭りが定まらないのでここで実装できない。
     * 具体的な祭りが定まるクラスにおいて、実装すること。
     * 
     * @return ダンスの名前の文字列
     */
    public abstract String getDanceName();

    /**
     * 祭りに参加する。
     */
    public void join() {
        System.out.println("ようこそ、" + this.getFestivalName() + "へ！");

    }

    /**
     * ダンスを踊る。
     * 
     * 具体的な祭りが定まらないのでここで実装できない。
     * 具体的な祭りが定まるクラスにおいて、実装すること。
     */
    public abstract void dance();
}
