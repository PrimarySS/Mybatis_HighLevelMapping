package cn.mybatis.xhchen.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.mybatis.xhchen.entity.Customer;
import cn.mybatis.xhchen.entity.Orders;
import cn.mybatis.xhchen.entity.OrdersCustom;

public class OrdersCustomMapperTest {

	// 创建会话工厂
	private SqlSessionFactory sqlSessionFactory;

	@Before
	/**
	 * 
	 * @Description: 加载mapper
	 * @param @throws IOException   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月12日 下午2:40:23
	 */
	public void setUp() throws IOException {

		// 定义核心配置文件
		String resource = "SqlMapConfig.xml";

		// 获得核心配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建会话工厂，加载配置文件流
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	@Test
	/**
	 * 
	 * @Description: 一对一查询订单,关联查询用户信息,ResultType实现
	 * @param @throws Exception   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月12日 下午3:02:42
	 */
	public void testfindOrderCustomerResultType() throws Exception {

		// 开启sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 动态代理
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);

		List<OrdersCustom> list = ordersCustomMapper.findOrderCustomerResultType();

		// 遍历结果
		for (OrdersCustom ordersCustom : list) {
			System.out.println(ordersCustom);
		}
		System.out.println(list.size());

		sqlSession.close();

	}

	@Test
	/**
	 * 
	 * @Description: 一对一查询订单,关联查询用户信息,ResultMap实现
	 * @param @throws Exception
	 * @return void
	 * @throws
	 * @author XHChen
	 * @date 2018年10月12日 下午3:22:30
	 */
	public void testfindOrderCustomerResultMap() throws Exception {

		// 开启sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 动态代理
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);

		List<Orders> list = ordersCustomMapper.findOrderCustomerResultMap();

		// 遍历结果
		for (Orders orders : list) {
			System.out.println(orders);
		}
		System.out.println(list.size());

		sqlSession.close();

	}
	
	@Test
	/**
	 * 
	 * @Description: 一对多查询订单关联查询用户及订单明细,使用resultMap实现
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月12日 下午5:17:32
	 */
	public void findOrdersAndOrderdetailResultMap() throws Exception {
		
		// 开启sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 动态代理
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);

		List<Orders> list = ordersCustomMapper.findOrdersAndOrderdetailResultMap();
		
		// 遍历
		for (Orders orders : list) {
			System.out.println(orders);
		}
		System.out.println(list.size());
		
		sqlSession.close();
		
	}
	
	@Test
	/**
	 * 
	 * @Description: 多对多查询用户以及用户购买的商品信息
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月14日 上午10:52:34
	 */
	public void testfindCustomerAndOrderdetailResultMap() throws Exception {
		
		// 开启sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 加载动态代理
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);
		
		// 查询操作
		// 调用mapper方法
		List<Customer> list = ordersCustomMapper.findCustomerAndOrderdetailResultMap();
		
		// 遍历结果
		for (Customer customer : list) {
			System.out.println(customer);
		}
		System.out.println(list.size());
		
		sqlSession.close();
	}

}
