package cn.mybatis.xhchen.entity;

import java.util.Date;
import java.util.List;

/**
 * 
 * ClassName: Orders
 * 
 * @Description: 订单实体类
 * @author XHChen
 * @date 2018年10月12日 下午2:29:25
 */
public class Orders {

	private Integer id; // 订单Id

	private Integer user_id; // 下单用户id

	private String number; // 订单号

	private Date createtime; // 创建订单时间

	private String note; // 备注

	private Customer customer; // 用户信息

	private List<OrderDetail> orderDetail; // 订单明细

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", user_id=" + user_id + ", number="
				+ number + ", createtime=" + createtime + ", note=" + note
				+ ", customer=" + customer + ", orderDetail=" + orderDetail
				+ "]";
	}

}
