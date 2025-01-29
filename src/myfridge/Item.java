package myfridge;
// 冷蔵庫内のアイテム情報（賞味期限と商品名）を保持するためのクラス
// ⇒ DTO (Data Transfer Object)としての役割を担う

import java.util.Date;

public class Item {

	// フィールド
	private Date expDate;
	private String name;
	
	// コンストラクタ
	public Item(Date expDate, String name) {
		super();
		this.expDate = expDate;
		this.name = name;
	}

	// アクセッサ
	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
