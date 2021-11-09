package ch06;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	static final int LOTTO_NUM_SIZE = 6;
	
	// �ζ� ��ȣ�� �����ϴ� ��� 6�ڸ� 
	
	public int[] getLottoNumber() {         								// ���ϰ��� int[]�� �޼���  
		// ��ȣ�� ���� ���� �����
		int[] numbers = new int[LOTTO_NUM_SIZE];
		
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = random.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (numbers[i]== numbers[j]) {
					i = i - 1;
					System.out.println("���� �� �߻�");
					break;													// break�� ���� ����� for���� �۵�����
				}
			}
		}
		// �迭 ����
		Arrays.sort(numbers);					// Arrays.sort(); ������ ����� �迭�� �־��ָ� ������ �ȴ� ���ڴ� ���� ũ������� ����
		
		return numbers;
	}
	// �����׽�Ʈ 
	public static void main(String[] args) {
		LottoNumber lottoNumber = new LottoNumber();
		int[]nums = lottoNumber.getLottoNumber(); 							// ������Ÿ���� �迭�� ����
		for (int i : nums) {
			System.out.print(i+ "\t");
		}
		
	}
	
	
	
	
	
}
