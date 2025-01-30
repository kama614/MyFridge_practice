package myfridge;
// アイテム操作するためのインターフェース
// 実装と内容を記述するのはItemServiceImplクラス

import java.util.List;

// 処理を書かない（抽象メソッド）
public interface ItemService { 
	// 全アイテムの取得
	List<Item> getItemList();

	// 賞味期限切れアイテムの取得
	List<Item> getExpiredList();

	// アイテムを追加
	void addItem(Item item);

	//アイテムを削除
	void deleteItem(int index);

}

/*
親クラス（スーパークラス）
・extends を使う。
・既に実装されたメソッドやフィールドを持てる。
・単一継承（1つしか継承できない）。
・「共通の機能を持たせたいとき」に使う。

インターフェース
・implements を使う。
・メソッドの宣言だけで、処理は書かない（実装クラスで書く必要がある）。
・多重実装が可能（複数のインターフェースを実装できる）。
・「ルールや契約を決めるとき」に使う。

もし「どっちを使えばいいか」迷ったら、
✅ 「継承したい機能（メソッドや変数）がある？」 → 親クラス（extends）
✅ 「ただのルールとして定めるだけ？」 → インターフェース（implements）
*/