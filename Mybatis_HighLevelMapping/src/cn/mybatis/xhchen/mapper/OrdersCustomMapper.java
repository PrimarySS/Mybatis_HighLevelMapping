package cn.mybatis.xhchen.mapper;

import java.util.List;

import cn.mybatis.xhchen.entity.Customer;
import cn.mybatis.xhchen.entity.Orders;
import cn.mybatis.xhchen.entity.OrdersCustom;

/**
 * 
 * ClassName: OrdersCustomMapper
 * 
 * @Description: ��ѯ����
 * @author XHChen
 * @date 2018��10��12�� ����2:26:05
 */
public interface OrdersCustomMapper {

	// һ��һ��ѯ����,������ѯ�û���Ϣ,resultTypeʵ��
	public List<OrdersCustom> findOrderCustomerResultType() throws Exception;

	// һ��һ��ѯ����,������ѯ�û���Ϣ,ResultMapʵ��
	public List<Orders> findOrderCustomerResultMap() throws Exception;

	// һ�Զ��ѯ����������ѯ�û���������ϸ,ʹ��resultMapʵ��
	public List<Orders> findOrdersAndOrderdetailResultMap() throws Exception;

	// ��Զ��ѯ�û��Լ��û��������Ʒ��Ϣ
	public List<Customer> findCustomerAndOrderdetailResultMap() throws Exception;

}
