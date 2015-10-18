package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ArticleDao;
import vo.ArticleVO;

public class ReplyInsertAction implements Preparable, ModelDriven<ArticleVO>, ServletRequestAware{

	private ArticleVO vo;
	private HttpServletRequest reip;
	
	public String execute(){
		//ip주소가 필요합니까..?
		//ArticleDao.getDao().re
		//☆Dao가 끝나고 하겠습니다.
		
		
		return null;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest reip) {
		this.reip=reip;
	}
	@Override
	public ArticleVO getModel() {
		return vo;
	}
	@Override
	public void prepare() throws Exception {
		vo=new ArticleVO();
	}
	
	
	
	
}  //end ReplyInsertAction class
