package week4;

public class train0920_5 {
		public static void main(String[] args) {
			howOld(20);
			howOld(18);

		}
		
		public static void howOld(int old) {
			if (old >= 19) {
				System.out.printf("%d세, 캔맥주 구매 가능", old);
			}
			
			else {
				System.out.printf("\n%d세, 캔맥주 구매 불가", old);
			}
		}

}
