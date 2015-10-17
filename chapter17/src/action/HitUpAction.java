package action;

import com.opensymphony.xwork2.Action;

import dao.ArticleDao;

public class HitUpAction implements Action {
	private int article_id;
	
	public void setArticle_id(int article_id) {
	this.article_id = article_id;
}

	@Override
	public String execute() throws Exception {
		ArticleDao.getDao().hitup(article_id);
		return SUCCESS;
	}

}
