package cn.mybatis.xhchen.entity;

import java.util.List;

/**
 * 
 * ClassName: Customer
 * 
 * @Description: 用户信息
 * @author XHChen
 * @date 2018年10月12日 下午2:34:13
 */
public class Customer {

	private Integer id; // 用户id

	private String username; // 用户名称

	private String sex; // 用户性别

	private String address; // 用户地址

	private List<Orders> orderslist; // 订单列表

	public List<Orders> getOrderslist() {
		return orderslist;
	}

	public void setOrderslist(List<Orders> orderslist) {
		this.orderslist = orderslist;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", sex=" + sex
				+ ", address=" + address + ", orderslist=" + orderslist + "]";
	}

}
