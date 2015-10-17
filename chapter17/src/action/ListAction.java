package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.ArticleDao;
import vo.ArticleVO;

public class ListAction implements Action{
	 private List<ArticleVO> list;

	public void setList(List<ArticleVO> list) {
		this.list = list;
	}

	public List<ArticleVO> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		list=ArticleDao.getDao().selectAll();
		System.out.println("ddd");
		return SUCCESS;
	}

}
