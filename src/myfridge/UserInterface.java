package myfridge;
// 各画面の生成(標準入出力)を担うクラス

import java.util.Scanner;

public class UserInterface {

	// ユーザーの選択した番号に応じて、各画面を呼び出す
	public void run() {
		// ユーザーに操作を選択させる
		System.out.println("何をしますか？");
		System.out.println("1:冷蔵庫の中身を見る 2:賞味期限切れ一覧 3:追加 4:削除 5:終了");

		// 入力値の取得
		var sc = new Scanner(System.in);
		String strChoice = sc.nextLine();

		// 入力された番号を整数に変換 String ⇒ int
		int choice;
		try {
			choice = Integer.parseInt(strChoice);
		} catch (NumberFormatException e) {
			//変換できなかった場合、「5：終了」とする
			choice = 5;
		}

		// 番号に応じて画面を呼び出す
		switch (choice) {
		case 1:
			System.out.println("アイテム一覧");
			break;
		case 2:
			System.out.println("賞味期限切れ一覧");
			break;
		case 3:
			System.out.println("アイテム追加");
			break;
		case 4:
			System.out.println("アイテム削除");
			break;
		default:
			System.out.println("終了");

		}
		sc.close();

	}

}
