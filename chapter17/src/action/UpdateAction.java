package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ArticleDao;
import vo.ArticleVO;

public class UpdateAction implements Action, Preparable, ModelDriven<ArticleVO>{
 private ArticleVO vo;
	
	@Override
	public ArticleVO getModel() {

		return vo;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		vo = new ArticleVO();
		
	}

	@Override
	public String execute() throws Exception {
		ArticleDao.getDao().update(vo);
		return SUCCESS;
	}
	
}
