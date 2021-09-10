package prob02;

public class Book {
	
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}
	
	public void print() {
		
		String checkStateCode;
		if(stateCode == 0) {
			checkStateCode = "대여중";
		}else {
			checkStateCode = "재고있음";
		}
		System.out.println("책 제목 : " + title + "작가 : " + author + "대여 유무 : " + checkStateCode);
		
	}
}
