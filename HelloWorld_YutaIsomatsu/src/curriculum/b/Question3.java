package curriculum.b;

// コンソール入力を扱うためのクラス
import java.util.Scanner; 

public class Question3 {
	
	public static void main(String[] args) {
		
		// Scannerオブジェクトを共有。
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Q1. for 文を使って 1 から 10 までの数字を 1 つずつ表示
		 */
		// for (初期化式; 条件式; 増減処理)
		for (int i = 1; i <= 10; i++) {
		    // 1から10までの数字を順番に表示
		    System.out.println("カウント: "  + i);
		}
		
		/*
		 * Q2. for 文を使って 2 から 20 までの偶数を 1 つずつ表示
		 */
		// 初期化: i = 2 (2から開始)
		// 条件: i <= 20 (20以下の間繰り返す)
		// 増減処理: i += 2 (偶数のみ扱うため、2ずつ増やす)
		for (int i = 2; i <= 20; i += 2) {
		    System.out.println("カウント: "  + i);
		}
		
		/*
		 * Q3. for 文を使って 10 から 1 までカウントダウンして表示
		 */
		// 初期化: i = 10 (10から開始)
		// 条件: i >= 1 (1以上の間繰り返す)
		// 増減処理: i-- (1ずつ減らす)
		for (int i = 10; i >= 1; i--) {
		    System.out.println("カウント: "  + i);
		}
		
		/*
		 * Q4. for 文を使って 1 から 100 までの合計を表示
		 */
		// 合計値を保存するための変数を 0 で初期化
		int sum = 0;
		// for 文で 1 から 100 まで繰り返す
		for (int i = 1; i <= 100; i++) {
		    // 現在の数字 i を合計変数 sum に足していく
		    sum += i;
		}
		System.out.println("カウント: "  + sum);
		
		/*
		 * Q5. for 文を使って以下のような三角形を出力
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		// 外側のループ：行数（1行目から5行目まで）を制御
		for (int i = 1; i <= 5; i++) {
		    // 内側のループ：各行に表示する"*"の個数を制御
		    // 「現在の行数 (i) 」と同じ数だけ繰り返す
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    // 1行分の"*"を書き終えたら改行する
		    System.out.println();
		}
		
		/*
		 * Q6. while 文を使って 1 から 10 までを 1 つずつ表示
		 */
		// カウンタ変数の初期化
		int i = 1;
		// 繰り返しの条件式（count が 10 以下の間ループを継続）
		while (i <= 10) {
		    // 数字を表示
		    System.out.println("カウント: "  + i);
		    // 増減処理（count を 1 ずつ増やす）
		    i++;
		}
		
		/*
		 * Q7. while 文を使って 2 から 20 までの偶数を 1 つずつ表示
		 */
		// 初期化: count = 2 (2から開始)
		int x = 2;
		// 繰り返しの条件式 (count が 20 以下の間ループを継続)
		while (x <= 20) {
			// 数字を表示
			System.out.println("カウント: " + x);
			// 増減処理: count += 2 (偶数のみ扱うため、2ずつ増やす)
			x += 2;
		}
		
		/*
		 * Q8. while 文を使って 10 から 1 まで のカウントダウンを表示
		 */
		// カウンタ変数の初期化（10から開始）
		int y = 10;
		// 繰り返しの条件式（i が 1 以上の間ループを継続）
		while (y >= 1) {
		    // 数字を表示
		    System.out.println("カウント: " + y);
		    // 増減処理（1ずつ減らす）
		    y--;
		}
		
		/*
		 * Q9. while 文を使って 1 から 100 までの合計を表示
		 */
		// 合計値を保存するための変数を 0 で初期化
		int num = 0;
		// カウンタ変数の初期化（1から開始）
		int z = 1;
		// 繰り返しの条件式（z が 100 以下の間ループを継続）
		while (z <= 100) {
		    // 現在の数字 z を合計変数 num に足していく
		    num += z;
		    // 変化式（1ずつ増やす）
		    z++;
		}
		System.out.println("カウント: " + num);
		
		/*
		 * Q10. ユーザーから数値入力を受け付け、0 になるまで繰り返し、0 が入力されたら「終了しました」と表示
		 */
		int input;
		// 最初の入力を受け取る
		System.out.print("数値を入力してください（0で終了）: ");
		input = scanner.nextInt();
		// 入力が 0 でない間、入力を繰り返す
		while (input != 0) {
		    System.out.print("次の数値を入力してください（0で終了）: ");
		    input = scanner.nextInt();
		}
		// 0 が入力されたらループを抜けて表示
		System.out.println("終了しました");
		
		/*
		 * Q11. for 文を使用して九九の表を出力
		 * フォーマット: "行 * 列 = 答え || " 
		 * ※ 1桁の数字は 0 をつけて 2 桁で表示（01, 02...）
		 */
		// 外側のループ：行 (1〜9)
		for (int ii = 1; ii <= 9; ii++) {
		    // 内側のループ：列 (1〜9)
		    for (int j = 1; j <= 9; j++) {
		        // 答えを計算
		        int result = ii * j;
		        // String.format を使って 0 埋め 2 桁 ("%02d") で表示
		        System.out.print(String.format("%02d * %02d = %02d", ii, j, result));
		        // 最後の列 (9) 以外は区切り線 " || " を表示
		        if (j < 9) {
		            System.out.print(" || ");
		        }
		    }
		    // 1行（1〜9の掛け算）が終わったら改行
		    System.out.println();
		}
		
		// Scannerオブジェクトを閉じる
		scanner.close();
		
	}

}
