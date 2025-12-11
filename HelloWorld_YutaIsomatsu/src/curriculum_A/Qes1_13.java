package curriculum_A;

public class Qes1_13 {
	
    /*
     * 【概要】 カリキュラム問題 変数編
     */
	
	public static void main(String[] args) {
		
        // 1.9つのデータ型をローカル変数として宣言のみ行う
		
		// バイト型
		byte byteValue;		
		// 短整数型
		short shortValue;
		// 整数型
		int intValue;
		// 長整数型
		long longValue;
		// 単精度浮動小数点数型
		float floatValue;
		// 倍精度浮動小数点数型
		double doubleValue;
		// 文字型
		char charValue;
		// 文字列型
		String stringValue;
		// ブーリアン型
		boolean booleanValue;
		
		// 2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化する
		byteValue = 0;
		shortValue = 0;
		intValue = 0;
		longValue = 0;
		floatValue = 0;
		doubleValue = 0;
		charValue = ' ';
		stringValue = "";
		booleanValue = true;
		
		// 3.初期化をしたそれぞれの変数に下記の値を代入する
		byteValue = 10;
		shortValue = 100;
		intValue = 1000;
		longValue = 10000;
		floatValue = 9.5f;
		doubleValue = 10.5;
		charValue = 'a';
		stringValue = "ハロー";
		booleanValue = true;
		
		// 4.上記で作成した変数を必ず使用し、コンソール出力されるようにする
		System.out.println(byteValue + shortValue + intValue + longValue);
		System.out.println(floatValue + doubleValue);
		System.out.println(charValue + stringValue + booleanValue);
		System.out.println(byteValue + shortValue + intValue + longValue + floatValue + doubleValue);
		System.out.println(byteValue * shortValue * intValue * longValue);
		System.out.println(doubleValue / shortValue);
		System.out.println(byteValue - shortValue);
		
		// 5. 「ハローJAVA43」と表示とさせるように修正
		// 元のソース String num = "20";
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA"+(num+num1));
		
		// 6.指定のフォーマット通りに出力させる
		// ローカル変数の宣言と代入を行う
		String name = "山田太郎";
		int age = 18;
		float personHeight = 170.5f;
		double personWeight = 62.2;
		String likeFood = "寿司";
		
		// 上記内容をコンソールに出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + personHeight + "cmです");
		System.out.println("体重" + personWeight + "kgです");
		System.out.println("好きな食べ物は" + likeFood + "です");
		
		// 7.上記で作成した自己紹介に続いてBMIが出力させる
		// 身長をメートル単位に変換する(floatをdoubleにキャストして割り算)
		double heightM = (double)personHeight / 100.0;
		double bmi = personWeight / (heightM * heightM);
		System.out.println("BMIは" + bmi + "です");
	}

}
