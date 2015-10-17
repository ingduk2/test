package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.ArticleVO;

public class ArticleDao {
	private static ArticleDao dao;
	public static ArticleDao getDao(){
		if(dao==null){
			dao = new ArticleDao();
		}
		return dao;
	}
	public void insertAll(ArticleVO vo){
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("article.insertat", vo);
		ss.close();
	}
	
	public List<ArticleVO> selectAll(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ArticleVO> list = ss.selectList("article.selectall");
		ss.close();
		return list;	
	}
	
	public ArticleVO detail(int article_id){
		SqlSession ss = FactoryService.getFactory().openSession();
		ArticleVO vo = ss.selectOne("article.detail",article_id);
		ss.close();
		return vo;
	}
	
	public void delete(int article_id){
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("article.delete", article_id);
		ss.close();
	}
	
	
	public void update(ArticleVO vo){
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("article.update", vo);
		ss.close();
	}
	
	public void hitup(int article_id){
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("article.hitup", article_id);
		ss.close();
	}
	
}
