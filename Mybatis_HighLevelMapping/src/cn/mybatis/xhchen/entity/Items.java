package cn.mybatis.xhchen.entity;

/**
 * 
 * ClassName: Items
 * 
 * @Description: ��Ʒ��Ϣ
 * @author XHChen
 * @date 2018��10��14�� ����10:34:04
 */
public class Items {

	private Integer id; // ��Ʒ����id

	private String items_name; // ��Ʒ����

	private String items_detail; // ��Ʒ��ϸ

	private Integer items_price; // �۸�

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItems_name() {
		return items_name;
	}

	public void setItems_name(String items_name) {
		this.items_name = items_name;
	}

	public String getItems_detail() {
		return items_detail;
	}

	public void setItems_detail(String items_detail) {
		this.items_detail = items_detail;
	}

	public Integer getItems_price() {
		return items_price;
	}

	public void setItems_price(Integer items_price) {
		this.items_price = items_price;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", items_name=" + items_name
				+ ", items_detail=" + items_detail + ", items_price="
				+ items_price + "]";
	}

}
