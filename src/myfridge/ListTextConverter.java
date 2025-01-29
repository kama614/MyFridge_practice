package myfridge;
// List<Item>とitems.txtの相互変換を担うクラス

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ListTextConverter {

	// items.txtを読み込み、List<Item>に変換、@returnアイテムのリスト
	public List<Item> read() {
		List<Item> list = new ArrayList<>();

		// テキストファイルの読み込み
		try {
			InputStream is = new FileInputStream("items.txt");
			try (var br = new BufferedReader(new InputStreamReader(is))) {
				// 文字列の日付 ⇒ Date型への変換用
				var sdf = new SimpleDateFormat("y年MM月dd日");

				String line;
				while ((line = br.readLine()) != null) {
					// テキスト一行分を賞味期限とアイテム名に分割
					// 半角スペースを区切りとして配列に変換
					String[] item = line.split(" ");
					// 文字列の日付 ⇒ Date型への変換
					System.out.println(sdf.parse(item[0]));
					System.out.println(item[1]);
				}

			} catch (ParseException e) {
				e.printStackTrace();
				System.out.println("データの読み込みに失敗しました");
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("データの読み込みに失敗しました");
		}
		return list;
	}

}
