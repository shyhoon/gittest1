package ch12;

public class Book {
	
	private int bookId;
	private String title;
	private String author;

//	alrt shift s �������� �ڵ�����

	public Book(int bookId, String title, String author) {
	
		this.bookId = bookId;
		this.title = title;
		this.author= author;
		
	} 
	
//	 toString �޼��� ������ �غ���
	public String toString() {
		
		return bookId +","+ title +","+ author;
	}

	// equals�޼��� ������
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Book ) {
			Book tempBook = (Book)obj; // �ڽ��� ���信 �θ� ���δٰ� ���°� �ȵǴϱ� �ٿ�ĳ������ �Ͽ� �ڽ��� Ÿ������ �����Ͽ� ����
			// ���� ����
			if((this.title == tempBook.title)&& (this.author == tempBook.author)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
	}
	// ��ü�� �ּҰ��� STringŸ������ �ٲ㼭 ����ϰ� ������ toString�� �������Ͽ� ��� ���������� �ʰ� �׳� toString�ϸ� ���ϴ°� ���� 
	// ���� ����ϴ� String�� �̹� tostring�� �����ǵ��ִ�
	public static void main(String[] args) {
		Book book1 = new Book(1,"���̾�", "ȫ�浿");
		System.out.println(book1);
	}
	
	
	
}
