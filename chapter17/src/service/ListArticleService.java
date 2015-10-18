package service;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.ArticleDao;
import vo.ArticleListVO;
import vo.ArticleVO;
import vo.PaginVO;



public class ListArticleService {
	private static ListArticleService instance;
	public static ListArticleService getInstance() {
		if(instance==null){
			instance=new ListArticleService();
		}
		return instance;
	}
	
	
	public static final int COUNT_PER_PAGE = 10;

	public ArticleListVO getArticleList(int requestPageNumber, int cnt) {
		if (requestPageNumber < 0) {
			throw new IllegalArgumentException("page number < 0 : "
					+ requestPageNumber);
		}
		
//		
//		ArticleDao articleDao = ArticleDao.getInstance();
//		Connection conn = null;
//		try {
//			conn = ConnectionProvider.getConnection();
//			int totalArticleCount = articleDao.selectCount(conn);
//
//			if (totalArticleCount == 0) {
//				return new ArticleListModel();
//			}

		//媛��닔 援ы븯怨� count
		int totalArticleCount=cnt; //dao�븸�뀡�뿉�꽌 �뿰寃�
		if (totalArticleCount == 0) {
		return new ArticleListVO();
	}
		
			int totalPageCount = calculateTotalPageCount(totalArticleCount);

			int firstRow = (requestPageNumber - 1) * COUNT_PER_PAGE + 1;
			int endRow = firstRow + COUNT_PER_PAGE - 1;

			if (endRow > totalArticleCount) {
				endRow = totalArticleCount;
			}
			
			PaginVO pv= new PaginVO(firstRow, endRow);
			
			//dao 異붽��븯怨� where row, endrow
//			List<ArticleVO> articleList = articleDao.select(conn, firstRow,
//					endRow);

			List<ArticleVO> articleList = ArticleDao.getDao().selectcnt(pv);
			
			ArticleListVO articleListVO = new ArticleListVO(
					articleList, requestPageNumber, totalPageCount, firstRow,
					endRow);
			return articleListVO;
		
	}

	private int calculateTotalPageCount(int totalArticleCount) {
		if (totalArticleCount == 0) {
			return 0;
		}
		int pageCount = totalArticleCount / COUNT_PER_PAGE;
		if (totalArticleCount % COUNT_PER_PAGE > 0) {
			pageCount++;
		}
		return pageCount;
	}
}
 