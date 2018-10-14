package cn.mybatis.xhchen.entity;

/**
 * 
 * ClassName: OrderDetail
 * 
 * @Description: 订单明细
 * @author XHChen
 * @date 2018年10月12日 下午4:30:50
 */
public class OrderDetail {

	private Integer id; // 明细主键id

	private Integer items_id; // 明细项目

	private Integer items_num; // 明细编号

	private Integer orders_id; // 订单id

	private Items items; // 商品信息

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
