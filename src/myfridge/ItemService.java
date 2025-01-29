package myfridge;
// アイテム操作するためのインターフェース

import java.util.List;

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
