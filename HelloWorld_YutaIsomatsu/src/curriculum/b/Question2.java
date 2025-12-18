package curriculum.b;

// コンソール入力を扱うためのクラス
import java.util.Scanner; 

public class Question2 {
	
	public static void main(String[] args) {
		
		// ScannerオブジェクトをQ5とQ6で共有。
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Q1.int型の変数scoreに75を代入、scoreが60以上なら"合格です！"と表示
		 */
		// 変数宣言→代入
		int score = 75;
		// 条件式「scoreが60以上」
		if  (score >= 60) {
			// コンソールに表示
			System.out.println("合格です！");
		}

		/*
		 * Q2.int型の変数ageに25を代入、ageが20以上30以下なら"適正年齢です"と表示、それ以外の場合は"対象外です"と表示
		 */
		// 変数宣言→代入
		int age = 25;
		// 条件式「ageが20以上30以下」 (論理AND演算子「&&」)
		if (age >= 20 && age <= 30) {
			// コンソールに表示
			System.out.println("適正年齢です");
		}
		// 条件式「上記以外の場合」
		else {
			// コンソールに表示
			System.out.println("対象外です");
		}
		
		/*
		 * Q3.int型の変数ageに18を代入、ageが20以上なら"成人です"と表示、ageが13以上19以下なら"ティーンエイジャーです"と表示、ageが12以下なら"子供です"と表示
		 */
		// 変数宣言→代入 (age重複宣言のため「変数名：age1」とする)
		int age1 = 18;
		// 条件式「ageが20以上」
		if (age1 >= 20) {
			// コンソールに表示
			System.out.println("成人です");
		}
		// 条件式「ageが13以上19以下」 (論理AND演算子「&&」)
		else if (age1 >= 13 && age1 <= 19) {
			// コンソールに表示
			System.out.println("ティーンエイジャーです");
		}
		// 条件式「12以下」
		else if (age1 <= 12) {
			// コンソールに表示
			System.out.println("子供です");
		}
		
		/*
		 * Q4.int型の変数x,y,zに30,15,50を代入、一番大きい数値を判定して表示
		 */
		// 変数宣言→代入
		int x = 30;
		int y = 15;
		int z = 50;
		// 一番大きい数値を判定する (max変数を利用して仮定の値を設定)
		int max = x;
		// yと暫定最大値を比較し、もしyの方が大きければ最大値をyに更新する
		if (y > max) {
			max = y;
		}
		// zと暫定最大値を比較し、もしzの方が大きければ最大値をzに更新する (処理前でxかyの大きいほうの値がmax変数に入っている)
		if (z > max) {
			max = z;
		}
		// コンソールに表示
		System.out.println(max);
		
		/*
		 * Q5.int型の変数numを用意、コンソール入力でいずれかの値を代入
		 * numの値が0より大きければ"正の数です"と表示、numの値が0なら"0です"と表示、numの値が0より小さければ"負の数です"と表示
、		 */
		// 変数宣言
		int num;
		// コンソール入力でいずれかの値を代入
		System.out.print("数値を入力してください: ");
		// ユーザーからの入力を受け取り、変数 num に代入（Scannerクラスを使用）
		num = scanner.nextInt();
		// nextInt()の後に残る改行文字を消費する
		scanner.nextLine();
		// 正の数,0,負の数の3パターンを判定する
		if (num > 0) {
			// コンソールに表示「正の数」
			System.out.println("正の数です");
		} else if (num == 0) {
			// コンソールに表示「0」
			System.out.println("0です");
		} else {
			// コンソールに表示「負の数です」
			System.out.println("負の数です");
		}
		
		/*
		 * Q6.int型の変数valueを用意、コンソール入力でいずれかの値を代入
		 * valueが偶数なら"偶数です"と表示、valueが奇数なら"奇数です"と表示
		 */
		// 変数宣言
		int value;
		// コンソール入力でいずれかの値を代入
		System.out.print("判定したい整数を入力してください: ");
		// ユーザーからの入力を受け取り、int型変数 value に代入（Scannerクラスを使用）
		value = scanner.nextInt();
		// nextInt()の後に残る改行文字を消費する
		scanner.nextLine();
		// 偶数判定の基本ロジック: 「2で割った余りが 0」かどうか
		if (value % 2 == 0) {
			// コンソールに表示「偶数です」
			System.out.println("偶数です");
		} else {
			// コンソールに表示「奇数です」
			System.out.println("奇数です");
		}

		/*
		 * Q7.int型の変数scoreにコンソール入力で0から100のいずれかの数値を代入
		 * - 90以上なら"優"
		 * - 70以上なら"良"
		 * - 50以上なら"可"
		 * - 50未満なら"不可"を表示
		 */
		// 変数宣言 (score重複宣言のため「変数名：score1」とする)
		int score1;
		// コンソール入力でいずれかの値を代入
		System.out.print("評価したい数値を入力してください: ");
		// ユーザーからの入力を受け取り、int型変数 value に代入（Scannerクラスを使用）
		score1 = scanner.nextInt();
		// nextInt()の後に残る改行文字を消費する
		scanner.nextLine();
		// 90以上
		if (score1 >= 90) {
			// コンソールに表示「優」
			System.out.println("優");
		// 70以上
		} else if (score1 >= 70) {
			// コンソールに表示「"良"」
			System.out.println("良");
		// 50以上
		} else if (score1 >= 50) {
			// コンソールに表示「"可"」
			System.out.println("可");
		// 50未満
		} else {
			// コンソールに表示「"不可"」
			System.out.println("不可");
		}
		
		/*
		 * Q8.コンソール入力が null または空文字（""）のときに「入力が無効です」と表示する処理
		 */
		// 変数宣言
		String inputStr;
		// コンソール入力でいずれかの値を代入
		System.out.print("任意の文字列を入力してください: ");
		// ユーザーからの入力を受け取り、String型変数 inputStr に代入
		// nextLine()は行全体を読み取るため、nextInt()のような改行文字消費は不要
		inputStr = scanner.nextLine();
		// 判定ロジック: inputStrが null または "" の場合
		// 1. null 判定: inputStr == null
		// 「isEmpty」は文字列の長さがゼロ（""）であるかどうかを判定する
		if (inputStr == null || inputStr.isEmpty()) {
		    // 条件に合致した場合
		    System.out.println("入力が無効です");
		} else {
		    // それ以外の場合（有効な入力があった場合）
		    System.out.println("正しい入力です -> " + inputStr);
		}
		
		/*
		 * Q9.int 型の変数 day を用意（コンソール入力で 1～7 のいずれかの数値を代入）
		 *  day の値に応じて曜日を表示
		 *  - 1 → "月曜日"
		 *  - 2 → "火曜日"
		 *  - 3 → "水曜日"
		 *  - 4 → "木曜日"
		 *  - 5 → "金曜日"
		 *  - 6 → "土曜日"
		 *  - 7 → "日曜日"
		 *  - それ以外の値なら "無効な入力です" と表示
		 *  ※Switch文を使用
		 */
		// 変数宣言
		int day;
		// コンソール入力で1~7のいずれかの値を代入
		System.out.print("1〜7の数値を入力してください: ");
		// ユーザーからの入力を受け取り、変数dayに代入
		day = scanner.nextInt();
		// 次の入力がある場合に備え、改行文字を消費してバッファをクリアする
		scanner.nextLine();
		// switch文による条件分岐
		switch (day) {
			case 1:
				System.out.println("月曜日");
				break;
			case 2:
				System.out.println("火曜日");
				break;
			case 3:
				System.out.println("水曜日");
				break;
			case 4:
				System.out.println("木曜日");
				break;
			case 5:
				System.out.println("金曜日");
				break;
			case 6:
				System.out.println("土曜日");
				break;
			case 7:
				System.out.println("日曜日");
				break;
			default:
				// 1〜7以外の数値が入力された場合
				System.out.println("無効な入力です");
				break;
		}
		
		/*
		 * Q10.int 型の変数 month を用意（コンソール入力で 1～12 のいずれかの数値を代入）
		 * month の値に応じて季節を表示
		 * - 12, 1, 2 → "冬"
		 * - 3, 4, 5 → "春"
		 * - 6, 7, 8 → "夏"
		 * - 9, 10, 11 → "秋"
		 * - それ以外の値なら "無効な月です" と表示
		 * ※Switch文を使用
		 */
		// 変数宣言
		int month;
		// コンソール入力で1~12のいずれかの値を代入
		System.out.print("1〜12の数値を入力してください: ");
		// ユーザーからの入力を受け取り、変数monthに代入
		month = scanner.nextInt();
		// 次の入力がある場合に備え、改行文字を消費してバッファをクリアする
		scanner.nextLine();
		// switch文による条件分岐
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("冬");
			break;
		case 3: case 4: case 5:
			System.out.println("春");
			break;
		case 6: case 7: case 8:
			System.out.println("夏");
			break;
		case 9: case 10: case 11:
			System.out.println("秋");
			break;
		default:
			// 1〜12以外の数値が入力された場合
			System.out.println("無効な月です");
			break;
		}
		
		// Scannerオブジェクトを閉じる
		scanner.close();
	}

}
