package ch06;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	static final int LOTTO_NUM_SIZE = 6;
	
	// 로또 번호를 생성하는 기능 6자리 
	
	public int[] getLottoNumber() {         								// 리턴값이 int[]인 메서드  
		// 번호를 담을 공간 만들기
		int[] numbers = new int[LOTTO_NUM_SIZE];
		
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = random.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (numbers[i]== numbers[j]) {
					i = i - 1;
					System.out.println("같은 값 발생");
					break;													// break는 가장 가까운 for문을 작동중지
				}
			}
		}
		// 배열 정렬
		Arrays.sort(numbers);					// Arrays.sort(); 정렬할 대상의 배열을 넣어주면 정렬이 된다 숫자는 숫자 크기순으로 정렬
		
		return numbers;
	}
	// 메인테스트 
	public static void main(String[] args) {
		LottoNumber lottoNumber = new LottoNumber();
		int[]nums = lottoNumber.getLottoNumber(); 							// 데이터타입을 배열로 선언
		for (int i : nums) {
			System.out.print(i+ "\t");
		}
		
	}
	
	
	
	
	
}
