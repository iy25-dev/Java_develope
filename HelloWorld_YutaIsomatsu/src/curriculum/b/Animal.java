package curriculum.b;

//Question5-Q5用 (データを管理するクラス)
public class Animal {
	// フィールド(メンバ変数)の定義
	private String name;    // 動物名
	private double length; // 体長
	private int speed;       // 速度
	
	/*
	 *  setterとgetterの作成
	 */
	// 動物名の設定と取得
	public void setName(String name) {
		this.name = name; // thisを使ってフィールドに値を代入
	}
	public String getName() {
		return this.name;
	}
	// 体長の設定と取得
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return this.length;
	}
	// 速度の設定と取得
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	
}
