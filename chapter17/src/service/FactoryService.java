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
			// config.xml을 읽어와서 로드 해놓는다.		
			Reader reader;
			reader = Resources.getResourceAsReader("config/config.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//SqlSessionFactoryBuilder를 사용해서 읽어온 config.xml
		//의 내용을 메모리에 올려 놓고 factory객체로 생성한다.
		//SqlSessionFactory는 결국 Mybatis의 모든 객체를 관리한다.	
	}
   // SqlSessionFactory를 반환해주는 메서드로 활용
	public static SqlSessionFactory getFactory(){
		return factory;
	}
}
