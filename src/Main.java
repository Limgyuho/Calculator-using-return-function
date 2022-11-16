class Main {
	public static void main(String[] args) {
		int 결과;

		결과 = 계산기.합(10, 20);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : 30

		결과 = 계산기.합(30, 20);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : 50

		결과 = 계산기.합(30, 70);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : 100

		결과 = 계산기.차(30, 70);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : -40

		결과 = 계산기.곱(3, 7);
		System.out.println("결과 : " + 결과);
		// 출력 => 결과 : 21
	}
}

class 계산기 {

	static int 합(int i, int j) {
		// int가 있는 이유는 결과라는 변수가 int 타입이기때문이다
		// static은 정적메서드이며 객체를 생성하지 않고도 사용하게 해준다
		return i + j;
		// 리턴값이 있는 이유는 계산기.합을 결과라는 변수에 담겠다고 정의했기때문이다
	}

	static int 곱(int i, int j) {
		// int가 있는 이유는 결과라는 변수가 int 타입이기때문이다
		// static은 정적메서드이며 객체를 생성하지 않고도 사용하게 해준다
		return i * j;
		// 리턴값이 있는 이유는 계산기.곱을 결과라는 변수에 담겠다고 정의했기때문이다
	}

	static int 차(int i, int j) {
		// int가 있는 이유는 결과라는 변수가 int 타입이기때문이다
		// static은 정적메서드이며 객체를 생성하지 않고도 사용하게 해준다
		return i - j;
		// 리턴값이 있는 이유는 계산기.차을 결과라는 변수에 담겠다고 정의했기때문이다
	}

}