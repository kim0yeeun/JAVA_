
public class Board {
	// 번호, 제목, 글쓴이, 내용, 글쓴이의 ip주소, 방문자수
	int num;
	String subject;
	String writer;
	String content;
	String ip;
	int readcount;
	
	public Board() {}
	public Board(int num,String subject,String writer,String content,String ip,int readcount) {
		this.num=num;
		this.subject=subject;
		this.content=content;
		this.ip=ip;
		this.writer=writer;
		this.readcount=readcount;
	}
	
	// setter
	public void setNum(int num) {
		this.num = num;
	}
	public void setSubject(String subject) {
		this.subject =subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setIp(String ip) {
		this.ip=ip;
	}
	public void setWriter(String writer) {
		this.writer =writer;
	}

	public void setReadcount(int readcount) {
		this.readcount =readcount;
	}
	
	
	// getter
	public int getNum() {
		return this.num;
	}
	public String getSubject() {
		return this.subject;
	}
	public String getContent() {
		return this.content;
	}
	public String getIp() {
		return this.ip;
	}
	public String getWriter() {
		return this.writer;
	}
	public int getReadcount() {
		return this.readcount;
	}
}
	
	
	
	
	
	
