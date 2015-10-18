package vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArticleListVO {
	
	private List<ArticleVO> articleList;
	private int requestPage;
	private int totalPageCount;
	private int startRow;
	private int endRow;

	public ArticleListVO() {
		this(Collections.<ArticleVO>emptyList(), 0, 0, 0, 0);
	}
	
	public ArticleListVO(List<ArticleVO> articleList, int requestPageNumber,
			int totalPageCount, int startRow, int endRow) {
		this.articleList = articleList;
		this.requestPage = requestPageNumber;
		this.totalPageCount = totalPageCount;
		this.startRow = startRow;
		this.endRow = endRow;
	}

	public List<ArticleVO> getArticleList() {
		return articleList;
	}
	
	public boolean isHasArticle() {
		return ! articleList.isEmpty();
	}

	public int getRequestPage() {
		return requestPage;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}
	
}

