package ch12;

public class Book {
	
	private int bookId;
	private String title;
	private String author;

//	alrt shift s 생ㅇ성자 자동생성

	public Book(int bookId, String title, String author) {
	
		this.bookId = bookId;
		this.title = title;
		this.author= author;
		
	} 
	
//	 toString 메서드 재정의 해보기
	public String toString() {
		
		return bookId +","+ title +","+ author;
	}

	// equals메서드 재정의
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Book ) {
			Book tempBook = (Book)obj; // 자식의 개념에 부모 전부다가 들어가는건 안되니까 다운캐스팅을 하여 자식의 타입으로 변경하여 대입
			// 논리적 설계
			if((this.title == tempBook.title)&& (this.author == tempBook.author)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
	}
	// 객체의 주소값을 STring타입으로 바꿔서 출력하고 싶을때 toString를 재정의하여 사용 재정의하지 않고 그냥 toString하면 변하는게 없다 
	// 많이 사용하는 String은 이미 tostring이 재정의돼있다
	public static void main(String[] args) {
		Book book1 = new Book(1,"데미안", "홍길동");
		System.out.println(book1);
	}
	
	
	
}
