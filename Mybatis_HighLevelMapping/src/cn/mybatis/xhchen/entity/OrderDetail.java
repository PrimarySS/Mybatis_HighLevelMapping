package cn.mybatis.xhchen.entity;

/**
 * 
 * ClassName: OrderDetail
 * 
 * @Description: ������ϸ
 * @author XHChen
 * @date 2018��10��12�� ����4:30:50
 */
public class OrderDetail {

	private Integer id; // ��ϸ����id

	private Integer items_id; // ��ϸ��Ŀ

	private Integer items_num; // ��ϸ���

	private Integer orders_id; // ����id

	private Items items; // ��Ʒ��Ϣ

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItems_id() {
		return items_id;
	}

	public void setItems_id(Integer items_id) {
		this.items_id = items_id;
	}

	public Integer getItems_num() {
		return items_num;
	}

	public void setItems_num(Integer items_num) {
		this.items_num = items_num;
	}

	public Integer getOrders_id() {
		return orders_id;
	}

	public void setOrders_id(Integer orders_id) {
		this.orders_id = orders_id;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", items_id=" + items_id
				+ ", items_num=" + items_num + ", orders_id=" + orders_id
				+ ", items=" + items + "]";
	}

}
