package co.yedam.board;

import java.util.List;

public interface ReplyService {
	public boolean addReply(Reply reply);
	public List<Reply> replyList(int brdNo);
	public boolean delReply(int replyNo);
	public void save();
}
