package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		
		/*
		 * Q1.各型の変数を宣言し、初期値を設定
		 */
		
		// バイト型
		byte byteNum;
		// 短整数型
		short shortNum;
		// 整数型
		int intNum;
		// 長整数型
		long longNum;
		// 単精度浮動小数点数型
		float floatNum;
		// 倍精度浮動小数点数型
		double doubleNum;
		// 文字型
		char letter;
		// 文字列型
		String letters;
		// ブーリアン型
		boolean isBoolean;
		
		/*
		 * Q2.1で宣言した各型の変数に指定された値を代入
		 */
		
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		/*
		 * Q3.値を代入した変数を用いて表示させる
		 */
		
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(floatNum + doubleNum);
		System.out.println(letter + letters + isBoolean);
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		
		/*
		 * Q4.nameという String型の変数を宣言し、その変数に"山田太郎"という値を代入。name変数を使用してコンソールに「こんにちは、山田太郎さん！」と表示させる。
		 */
		// 変数宣言→代入
		String name = "山田太郎";
		// コンソールに表示させる
		System.out.println("こんにちは" + name + "さん！");
		
		/*
		 * Q5.ageというint型の変数を宣言し、その変数に"25"を代入。age変数を使用してコンソールに「年齢:25歳」と表示させる。
		 */
		// 変数宣言→代入
		int age = 25;
		// コンソールに表示させる
		System.out.println("年齢:" + age + "歳");
		
		/*
		 * Q6.num1というint型の変数を宣言し、10を代入。num2というint型の変数を宣言し、5を代入。num1とnum2を足した結果をsumという変数に代入し、表示させる。
		 */
		// 「num1」変数宣言→代入
		int num1 = 10;
		// 「num2」変数宣言→代入
		int num2 = 5;
		// num1とnum2を足した結果をsumという変数に代入し、コンソールに表示させる
		int sum = num1 + num2;
		System.out.println(sum);
		
		/*
		 * Q7.scoreというint型の変数を宣言し、80を代入。scoreに20を加えて更新し、「最終スコア: 100」 を score を使用して表示させる。
		 */
		// 変数宣言→代入
		int score = 80;
		// scoreに20を加えて更新する
		score += 20;
		// コンソールに表示させる
		System.out.println("最終スコア:" + score);
		
		/*
		 * Q8.priceというdouble型の変数を宣言し、99.99を代入し、「整数価格:99」と表示させる。
		 */
		// 変数宣言→代入
		double price = 99.99;
		// priceをint型に変換
		int intPrice = (int)price;
		// コンソールに表示させる
		System.out.println("整数価格:" + intPrice);
		
		/*
		 * Q9.String型の変数numStrに"123"を代入。numStrをint型に変換し、変換後の値: の後ろに numStr + 10 した結果を表示させる。
		 */
		// 変数宣言→代入
		String numStr = "123";
		// numStrをint型に変換(Integer.parseInt() メソッドを使用して、文字列を整数（int）に変換し、新しい変数に格納)
		int convNum = Integer.parseInt(numStr);
		// numStr + 10 の計算
		int resultNum = convNum + 10;
		// コンソールに表示させる
		System.out.println("変換後の値:" + resultNum);
		
		/*
		 * Q10.int型の変数numに50を代入。numをString型に変換し、"得点:50点"の形で表示させる。
		 */
		// 変数宣言→代入
		int num = 50;
		// numをString型に変換
		String scoreStrA = String.valueOf(num); 
		// コンソールに表示させる
		System.out.println("得点:" + scoreStrA + "点");
		
		/*
		 * Q11. 次の条件を満たすプログラムを条件演算子を使用して作成。
		 * - int 型の変数 a に 10 を代入
		 * - int 型の変数 b に 20 を代入
		 * - a が b より小さいかどうかを boolean 変数 result に代入
		 * - result の値を表示
		 */
		// 変数宣言→代入
		int a = 10;
		// 変数宣言→代入
		int b = 20;
		// 比較演算子 < (より小さい) を使用。結果は true または false になる。
		boolean result = (a < b);
		// コンソールに表示させる
		System.out.println(result);
		
		/*
		 * Q12. 条件演算子(三項演算子)を使用して作成。
		 * -  int 型の変数 x に 15 を代入
		 * - 条件演算子を使用して、x が 10 以上なら "OK"、そうでなければ "NG" を表示
		 */
		// 変数宣言→代入
		int x = 15;
		// 条件演算子の構文: (条件式) ? (trueの場合の値) : (falseの場合の値)
		// 条件式: (x >= 10) -> xが10以上かどうか
		String status = (x >= 10) ? "OK" : "NG";
		// コンソールに表示させる
		System.out.println(status);
		
		/*
		 * Q13.String text = "私はJavaが好きです。Javaは楽しい！"; という文章内の「Java」を「Python」に置き換えて表示させる。
		 */
		// "私はJavaが好きです。Javaは楽しい！" という文章を定義
		String text = "私はJavaが好きです。Javaは楽しい！";
		// 文章の中にある「Java」を「Python」に置き換える
		// Stringクラスのreplaceメソッドを使用し、置換後の新しい文字列を変数に格納
		// replaceメソッドは、文字列中に含まれるすべての該当部分を置き換える
		String replacedText = text.replace("Java", "Python");
		// 置き換え後の結果をコンソールに表示させる
		System.out.println(replacedText);
	}

}
