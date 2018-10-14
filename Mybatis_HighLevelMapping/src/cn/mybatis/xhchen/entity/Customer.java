package cn.mybatis.xhchen.entity;

import java.util.List;

/**
 * 
 * ClassName: Customer
 * 
 * @Description: �û���Ϣ
 * @author XHChen
 * @date 2018��10��12�� ����2:34:13
 */
public class Customer {

	private Integer id; // �û�id

	private String username; // �û�����

	private String sex; // �û��Ա�

	private String address; // �û���ַ

	private List<Orders> orderslist; // �����б�

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
