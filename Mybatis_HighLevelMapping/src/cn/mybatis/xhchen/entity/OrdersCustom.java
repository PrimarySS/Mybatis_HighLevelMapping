package cn.mybatis.xhchen.entity;

/**
 * 
 * ClassName: OrdersCustom
 * 
 * @Description: Custom��pojo��װ��
 * @author XHChen
 * @date 2018��10��12�� ����2:29:44
 */
public class OrdersCustom extends Orders {

	// ����û�������
	private String username;

	private String sex;

	private String address;

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
		return "OrdersCustom [username=" + username + ", sex=" + sex
				+ ", address=" + address + "]";
	}

}
