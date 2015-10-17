package action;

import com.opensymphony.xwork2.Action;

public class ReplyAction implements Action {
	
	private int ref, seq, lvl;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
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
