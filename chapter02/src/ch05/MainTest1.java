package ch05;

public class MainTest1 {
public static void main(String[] args) {
	
	// ���� �����
	Bus bus100 = new Bus(100);
	Bus bus200 = new Bus(200);
	Bus bus300 = new Bus(300);
	Student student1 = new Student("ȫ�浿", 10_000/*�ڹٿ��� õ������ ����� �����ִ�*/);
	Student student2 = new Student("�߽���", 50_000/*�ڹٿ��� õ������ ����� �����ִ�*/);
	Student student3 = new Student("Ƽ��", 20_000);
	
	// Subwa
	Subway subway1 = new Subway(1);
	Subway subway2 = new Subway(2);
	Subway subway3 = new Subway(3);
	
	
	student1.takeBus(bus100);
	student2.takeBus(bus200);
	student3.takeBus(bus300);
	
	student1.showInfo();
	student2.showInfo();
	student3.showInfo();
	
	student1.takeSubway(subway1);
	student2.takeSubway(subway2);
	student3.takeSubway(subway3);
	
	student1.showInfo();
	student2.showInfo();
	student3.showInfo();
	
	/*
	// �л��� ������ ź��.
	
	student1.takeBus(bus100);
	
	// ����â Ȯ��
	student1.showInfo();
	
	System.out.println("-------------");
	bus100.showInfo();
	
	System.out.println("-------------");
	student2.takeBus(bus100);
	student2.showInfo();
	
	System.out.println("-------------");
	bus100.showInfo();
	
	// �л����� ��ġ�� ���ư��ϴ�.
	// s1 ����ö�� ž�ϴ�.
	student1.takeSubway(subway1);
	System.out.println("====================");
	student1.showInfo();
	
	subway1.showInfo();
	System.out.println("====================");
	*/
	
	
	
	
}
}
