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

	// �����Ự����
	private SqlSessionFactory sqlSessionFactory;

	@Before
	/**
	 * 
	 * @Description: ����mapper
	 * @param @throws IOException   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��12�� ����2:40:23
	 */
	public void setUp() throws IOException {

		// ������������ļ�
		String resource = "SqlMapConfig.xml";

		// ��ú��������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����Ự���������������ļ���
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	@Test
	/**
	 * 
	 * @Description: һ��һ��ѯ����,������ѯ�û���Ϣ,ResultTypeʵ��
	 * @param @throws Exception   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��12�� ����3:02:42
	 */
	public void testfindOrderCustomerResultType() throws Exception {

		// ����sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// ��̬����
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);

		List<OrdersCustom> list = ordersCustomMapper.findOrderCustomerResultType();

		// �������
		for (OrdersCustom ordersCustom : list) {
			System.out.println(ordersCustom);
		}
		System.out.println(list.size());

		sqlSession.close();

	}

	@Test
	/**
	 * 
	 * @Description: һ��һ��ѯ����,������ѯ�û���Ϣ,ResultMapʵ��
	 * @param @throws Exception
	 * @return void
	 * @throws
	 * @author XHChen
	 * @date 2018��10��12�� ����3:22:30
	 */
	public void testfindOrderCustomerResultMap() throws Exception {

		// ����sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// ��̬����
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);

		List<Orders> list = ordersCustomMapper.findOrderCustomerResultMap();

		// �������
		for (Orders orders : list) {
			System.out.println(orders);
		}
		System.out.println(list.size());

		sqlSession.close();

	}
	
	@Test
	/**
	 * 
	 * @Description: һ�Զ��ѯ����������ѯ�û���������ϸ,ʹ��resultMapʵ��
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��12�� ����5:17:32
	 */
	public void findOrdersAndOrderdetailResultMap() throws Exception {
		
		// ����sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// ��̬����
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);

		List<Orders> list = ordersCustomMapper.findOrdersAndOrderdetailResultMap();
		
		// ����
		for (Orders orders : list) {
			System.out.println(orders);
		}
		System.out.println(list.size());
		
		sqlSession.close();
		
	}
	
	@Test
	/**
	 * 
	 * @Description: ��Զ��ѯ�û��Լ��û��������Ʒ��Ϣ
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��14�� ����10:52:34
	 */
	public void testfindCustomerAndOrderdetailResultMap() throws Exception {
		
		// ����sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// ���ض�̬����
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);
		
		// ��ѯ����
		// ����mapper����
		List<Customer> list = ordersCustomMapper.findCustomerAndOrderdetailResultMap();
		
		// �������
		for (Customer customer : list) {
			System.out.println(customer);
		}
		System.out.println(list.size());
		
		sqlSession.close();
	}

}
