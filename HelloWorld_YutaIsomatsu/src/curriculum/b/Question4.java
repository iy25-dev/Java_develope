package curriculum.b;

//コンソール入力を扱うためのクラス
import java.util.Scanner; 

public class Question4 {
	
	public static void main(String[] args) {
		
		// Scannerオブジェクトを共有。
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Q1. int 型の配列を作成し、1, 2, 3, 4, 5 を格納
		 * 配列の全要素を順番に表示
		 */
		// int 型の配列を作成し、値を初期化
		int[] numbers = {1, 2, 3, 4, 5};
		// for 文を使って配列の全要素を順番に表示
		// numbers.length を使用し、配列の要素数（今回は5）を自動で取得
		for (int i = 0; i < numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		
		/*
		 * Q2. int 型の配列 {10, 20, 30, 40, 50} を用意し、配列の要素を 逆順 に表示
		 */
		// 配列の用意
		int[] data = {10, 20, 30, 40, 50};
		// 逆順に表示するための for 文
		// 開始点： data.length - 1 (最後のインデックスである 4)
		// 条件： i >= 0 (最初のインデックス 0 まで繰り返す)
		// 変化： i-- (1ずつ減らす)
		for (int i = data.length - 1; i >= 0; i--) {
		    System.out.println(data[i]);
		}
		
		/*
		 * Q3. int 型の配列 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} を用意
		 * 配列の全要素の 合計 を表示
		 */
		// 配列の用意
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 合計値を保存するための変数を 0 で初期化
		int sum = 0;
		// for 文を使って配列の全要素を sum に加算
		for (int i = 0; i < values.length; i++) {
		    // values[i] を sum に足していく
		    sum += values[i];
		}
		// 合計結果を表示
		System.out.println(sum);
		
		/*
		 * Q4. int 型の配列 {12, 7, 9, 21, 5, 18} を用意
		 * 配列の 最大値 と 最小値 を求めて表示
		 */
		// 配列の用意
		int[] num = {12, 7, 9, 21, 5, 18};
		// 最大値・最小値を保持する変数を、配列の最初の要素で初期化
		int max = num[0];
		int min = num[0];
		// for 文で 2 番目（インデックス 1）の要素から順に比較
		for (int i = 1; i < num.length; i++) {
		    // 現在の最大値より大きければ、max を更新
		    if (num[i] > max) {
		        max = num[i];
		    }
		    // 現在の最小値より小さければ、min を更新
		    if (num[i] < min) {
		        min = num[i];
		    }
		}
		System.out.println(max);
		System.out.println(min);
		
		/*
		 * Q5. int 型の配列 {1, 2, 3, 4, 5} を用意
		 * 配列のすべての要素を 2 倍し、拡張 for 文を使って結果を表示
		 */
		// 配列の用意
		int[] numb = {1, 2, 3, 4, 5};
		// 配列の全要素を 2 倍に書き換える
		// 値を代入する場合は、インデックスが必要なので通常の for 文を使用
		for (int i = 0; i < numb.length; i++) {
			numb[i] = numb[i] * 2;
		}
		// 拡張 for 文を使用して結果を表示
		// メモ：「配列 numbers から要素を 1 つずつ取り出して n に入れる」という動き
		for (int n : numb) {
		    System.out.println(n);
		}
		
		/*
		 * Q6. int 型の配列 {4, 7, 10, 15, 20} を用意する
		 * ユーザーがコンソール入力した数が配列に含まれているかを判定し、結果を表示
		 * 結果：（"入力した値"は配列に含まれています／含まれていません）
		 */
		// int 型の配列を用意
		int[] dt = {4, 7, 10, 15, 20};
		// ユーザーから数値を入力してもらう
		System.out.print("検索する数値を入力してください: ");
		int input = scanner.nextInt();
		// 含まれているかを判定するためのフラグ
		boolean found = false;
		// 配列をループして、入力値と一致するものがあるか探す
		for (int nm : dt) {
			if (nm == input) {
				found = true;
				break; // 見つかったらそれ以上探す必要はないのでループを抜ける
			}
		}
		// 結果を表示
		if (found) {
			System.out.println("入力した値は配列に含まれています");
		} else {
			System.out.println("入力した値は配列に含まれていません");
		}
		
		/*
		 * Q7. 2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意
		 * 配列のすべての要素を表示
		 */
		// 2次元配列の用意
		int[][] array = {{1, 2}, {3, 4}, {5, 6}};
		// 二重の for 文を使って要素を取り出す
		// 外側のループ：行の数（array.length = 3行）
		for (int i = 0; i < array.length; i++) {
			// 内側のループ：各行の中にある列の数（array[i].length = 2列）
			for (int j = 0; j < array[i].length; j++) {
				// i行j列の要素を表示
				System.out.print(array[i][j] + " ");
			}
			// 1行分表示したら改行
			System.out.println();
		}
		
		/*
		 * Q8. 2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意
		 * 配列のすべての要素の 合計値 を表示
		 */
		// 2次元配列の用意
		int[][] ar = {
			{10, 20, 30},
			{40, 50, 60},
			{70, 80, 90}
		};
		// 合計値を保持するための変数を 0 で初期化
		int sm = 0;
		// 二重の for 文ですべての要素を sum に加算する
		for (int i = 0; i < ar.length; i++) {           // 行のループ
			for (int j = 0; j < ar[i].length; j++) {   // 列のループ
				sm += ar[i][j];                               // 要素を足し合わせる
			}
		}
		// 結果を表示
		System.out.println(sm);
		
		/*
		 * Q9. 2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意
		 * 配列内の 最大値 と 最小値 を求めて表示
		 */
		// 2次元配列の用意
		int[][] arr = {
			{12, 15, 8},
			{6, 19, 25},
			{30, 2, 10}
		};
		// 最大値・最小値を保持する変数を、配列の最初の要素 [0][0] で初期化
		int mx = arr[0][0];
		int mn = arr[0][0];
		// 二重の for 文ですべての要素をチェック
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 現在の最大値より大きければ更新
				if (arr[i][j] > mx) {
					mx = arr[i][j];
				}
				// 現在の最小値より小さければ更新
				if (arr[i][j] < mn) {
					mn = arr[i][j];
				}
			}
		}
		// 結果を表示
		System.out.println(mx);
		System.out.println(mn);
		
		/*
		 * Q10. 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意
		 * 配列内のすべての要素を 表示
		 */
		// 3次元配列の用意
		int[][][] ay = {
			{
				{1, 2}, {3, 4}
			}, 
			{
				{5, 6}, {7, 8}
			}
		};
		// 三重の for 文を使って要素を取り出す
		// 一番外側：面（奥行き）のループ
		for (int i = 0; i < ay.length; i++) {
			// 真ん中：行のループ
			for (int j = 0; j < ay[i].length; j++) {
				// 一番内側：列のループ
				for (int k = 0; k < ay[i][j].length; k++) {
					// i面、j行、k列の要素を表示
					System.out.print(ay[i][j][k] + " ");
				}
				// メモ：可読性向上のため、行が終わるごとに半角スペース（または改行）を入れる
				System.out.println(); 
			}
		}
		
		// Scannerオブジェクトを閉じる
		scanner.close();
		
	}
	
}
