package vo;

public class ArticleVO {
	private String sequence_no, posting_date, writer_name;
	private String password,  title, content;
	private int article_id, group_id, read_count;
	private int ref, seq, lvl; // 답글 처리를 위한 변수
	
	public String getSequence_no() {
		return sequence_no;
	}
	public void setSequence_no(String sequence_no) {
		this.sequence_no = sequence_no;
	}
	public String getPosting_date() {
		return posting_date;
	}
	public void setPosting_date(String posting_date) {
		this.posting_date = posting_date;
	}
	public String getWriter_name() {
		return writer_name;
	}
	public void setWriter_name(String writer_name) {
		this.writer_name = writer_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public int getRead_count() {
		return read_count;
	}
	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
}
