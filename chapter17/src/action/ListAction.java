package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.ArticleDao;
import service.ListArticleService;
import vo.ArticleListVO;
import vo.ArticleVO;

public class ListAction implements Action{
	 private List<ArticleVO> list;
	 private ArticleListVO articleListVO; //listmodel
	 private int requestPageNumber;
	 private int beginPageNumber;
	 private int endPageNumber;
	 
//	 request.setAttribute("beginPage", beginPageNumber);
//		request.setAttribute("endPage", endPageNumber);
	 
	public ListAction() {
		requestPageNumber=1;
		// TODO Auto-generated constructor stub
	}

	public int getRequestPageNumber() {
		return requestPageNumber;
	}

	public void setRequestPageNumber(int requestPageNumber) {
		this.requestPageNumber = requestPageNumber;
	}

	public void setList(List<ArticleVO> list) {
		this.list = list;
	}

	public List<ArticleVO> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		
		ArticleDao dao=ArticleDao.getDao();
		int cnt=dao.selectCount();
		System.out.println(requestPageNumber);
		ListArticleService listService = ListArticleService.getInstance();
		articleListVO= listService.getArticleList(requestPageNumber, cnt);
		
		if (articleListVO.getTotalPageCount() > 0) {
			beginPageNumber = 
				(articleListVO.getRequestPage() - 1) / 10 * 10 + 1;
			endPageNumber = beginPageNumber + 9;
			if (endPageNumber > articleListVO.getTotalPageCount()) {
				endPageNumber = articleListVO.getTotalPageCount();
			}
			//request.setAttribute("beginPage", beginPageNumber);
			//request.setAttribute("endPage", endPageNumber);
		}
		
		list=articleListVO.getArticleList();
		
		return SUCCESS;
	}

	public int getBeginPageNumber() {
		return beginPageNumber;
	}

	public int getEndPageNumber() {
		return endPageNumber;
	}

	public ArticleListVO getArticleListVO() {
		return articleListVO;
	}

	public void setArticleListVO(ArticleListVO articleListVO) {
		this.articleListVO = articleListVO;
	}

}
