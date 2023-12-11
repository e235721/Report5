public class Main {
    public static void main(String[] args) {

    // 条件1: String型変数 str を宣言し、初期値として null を代入する。（"null"ではない！）
    // 条件2: str.length() の内容を表示しようとする

    // 条件3: 「NullPointerException」を catch せよ。
    // 条件4: NullPointerExceptionが発生したことを標準出力せよ。出力文は、NullPointerExceptionが発生したことが分かる内容であれば自由とする。
    // 条件5: 例外インスタンスを用いて、getMessage()を出力せよ。

        try {
            String str = null ;
            str.length();

        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました。" + e.getMessage()) ;

        }
    }
}
