package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ArticleDao;
import vo.ArticleVO;

public class DetailAction implements Action {
	private int article_id;
	private ArticleVO vo;
	
	public int getArticle_id() {
		return article_id;
	}
	
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	
	public ArticleVO getVo() {
		return vo;
	}
	@Override
	public String execute() throws Exception {
		//article_id=vo.getArticle_id();
		System.out.println(article_id);
		
		ArticleDao.getDao().hitup(article_id);
		vo = ArticleDao.getDao().detail(article_id);
		return SUCCESS;
	}
	

}
