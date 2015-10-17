package action;

import com.opensymphony.xwork2.Action;

import dao.ArticleDao;

public class DeleteAction implements Action{
	private int article_id;
	
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(article_id);
		ArticleDao.getDao().delete(article_id);
		return SUCCESS;
	}

	
}
