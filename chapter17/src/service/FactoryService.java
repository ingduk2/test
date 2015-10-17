package service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	private static SqlSessionFactory factory;
	static{
		
		try {
			// config.xml�� �о�ͼ� �ε� �س��´�.		
			Reader reader;
			reader = Resources.getResourceAsReader("config/config.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//SqlSessionFactoryBuilder�� ����ؼ� �о�� config.xml
		//�� ������ �޸𸮿� �÷� ���� factory��ü�� �����Ѵ�.
		//SqlSessionFactory�� �ᱹ Mybatis�� ��� ��ü�� �����Ѵ�.	
	}
   // SqlSessionFactory�� ��ȯ���ִ� �޼���� Ȱ��
	public static SqlSessionFactory getFactory(){
		return factory;
	}
}
