package cn.mybatis.xhchen.mapper;

import java.util.List;

import cn.mybatis.xhchen.entity.Customer;
import cn.mybatis.xhchen.entity.Orders;
import cn.mybatis.xhchen.entity.OrdersCustom;

/**
 * 
 * ClassName: OrdersCustomMapper
 * 
 * @Description: 查询订单
 * @author XHChen
 * @date 2018年10月12日 下午2:26:05
 */
public interface OrdersCustomMapper {

	// 一对一查询订单,关联查询用户信息,resultType实现
	public List<OrdersCustom> findOrderCustomerResultType() throws Exception;

	// 一对一查询订单,关联查询用户信息,ResultMap实现
	public List<Orders> findOrderCustomerResultMap() throws Exception;

	// 一对多查询订单关联查询用户及订单明细,使用resultMap实现
	public List<Orders> findOrdersAndOrderdetailResultMap() throws Exception;

	// 多对多查询用户以及用户购买的商品信息
	public List<Customer> findCustomerAndOrderdetailResultMap() throws Exception;

}
