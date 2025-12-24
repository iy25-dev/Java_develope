package curriculum.b;

//Question5-Q5用 (実行用のクラス)
public class MainQ5 {
	public static void main(String[] args) {
		// Animalクラスのインスタンスを作成
		Animal lion = new Animal();
		// setterを使って値を設定
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		// getterを使って値を取り出し、表示させる
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}
