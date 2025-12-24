
package curriculum.b;

public class Question5 {
	
	public static void main(String[] args) {
		// Q1の呼び出し
		helloWorld();
		
		// Q2の呼び出し
		int original = 10;
		// メソッドを呼び出し、戻り値を変数 result に格納
		int result = doubleValue(original);
		// 結果を表示
		System.out.println(original + "を2倍すると" + result + "です。");
		
		// Q3の呼び出し
		int num1 = 7;
		int num2 = 10;
		// num2(10)の判定と表示
		if (isEven(num2)) {
			System.out.println(num2 + "偶数です。");
		} else {
			System.out.println(num2 + "奇数です。");
		}
		// num1(7)の判定と表示
		if (isEven(num1)) {
			System.out.println(num1 + "偶数です。");
		} else {
			System.out.println(num1 + "奇数です。");
		}

	}
	
		/*
		 * Q1. helloWorld メソッドの定義
		 * 条件: 引数なし、戻り値なし
		 * Hello, World! を表示
		 */
		public static void helloWorld() {
			// 指定された文字列を表示
			System.out.println("Hello, World!");
		}
		
		/*
	     * Q2. doubleValue メソッドの定義
	     * 引数: 整数 (int num)
	     * 戻り値: 整数 (引数の2倍の値)
	     * 10を2倍すると20です。
	     */
		public static int doubleValue(int num) {
			return num * 2;
		}
		
		/*
	     * Q3. isEven メソッドの定義
	     * 引数: 整数 (int num)
	     * 戻り値: boolean (偶数なら true, 奇数なら false)
	     */
		public static boolean isEven(int num) {
			// 2で割った余りが0なら偶数
			if (num % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}
		
}
