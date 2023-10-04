package teamProject;

import java.util.Scanner;

public class teamProject_Kiosk {
	
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//
		int total_price = 0;
		int i = 0;
		String[] mList = new String[100];
		int[] pList = new int[100];
		// 크앙분식
		String[] kuan_menu = {"크앙쫄볶이", "크앙라떡", "치킨마요덮밥", "짜계치", "라면에 계란추가", "삼겹살쫄면", "직화삼겹미니덮밥", "사이다", "콜라"};
		String[] kuan_pirce = {"8000", "5000", "5900", "6500", "4000", "9000", "6900", "1000", "1000"};
		String[][] kuan_list = {kuan_menu, kuan_pirce};
		// 샐러드스토어(가상)
		String[] salsto_menu = {"오리지널 샐러드", "로스트치킨 샐러드", "리코타치즈 샐러드", "에그베이컨 샐러드", "연어 샐러드"};
		String[] salsto_pirce = {"5000", "6000", "6500", "7000", "7500"};
		String[][] salsto_list = {salsto_menu, salsto_pirce};
		//뼈해장국
		String[] byuhae_menu = {"뼈해장국", "뼈해장국 특대", "순대국밥", "육개장", "설렁탕", "콜라", "사이다", "공기밥 추가"};
		String[] byuhae_pirce = {"6900", "7900", "7000", "5900", "7000", "1500", "1500", "1000"};
		String[][] byuhae_list = {byuhae_menu, byuhae_pirce};
		//list
		String[][][] kiosk = {kuan_list, salsto_list, byuhae_list};
		
		while (true) {
			System.out.print( "===============================\n" + "교내 식당에 오신 것을 환영합니다!\n" + "-------------------------------\n" + 
									"\t1. 크앙분식\n" + "\t2. 샐러드스토어\n" + "\t3. 뼈해장국\n" + "\t4. 계산하기\n" + "-------------------------------\n" + "식당을 선택하세요 : ");
		
			int rest = input.nextInt();
			switch (rest) {
			case	1 :
				System.out.printf("===============================\n" +"\t[크앙 분식]\n" + "-------------------------------\n" + 
						"\t1. %s\n" + "\t2. %s\n" + "\t3. %s\n" + "\t4. %s\n" + "\t5. %s\n" + "\t6. %s\n" + "\t7. %s\n" + "\t8. %s\n" +"\t9. %s\n"
						+ "-------------------------------\n" + "메뉴를 선택하세요 : ",
						kiosk[0][0][0],  kiosk[0][0][1],  kiosk[0][0][2],  kiosk[0][0][3], kiosk[0][0][4],  kiosk[0][0][5],  kiosk[0][0][6],  kiosk[0][0][7], kiosk[0][0][8]);
				
				int menu_1 = input.nextInt();
				switch (menu_1) {
					case 1 : 
						System.out.print("===============================\n" +"\t[추가 메뉴]\n" + "-------------------------------\n" + 
											"\t1. 삶은 계란 추가\n" + "\t2. 치즈 추가\n" + "\t3. 선택 안함\n"
											+ "-------------------------------\n" + "추가 메뉴를 선택하세요 : ");
						int menu_1_1 = input.nextInt();
						switch (menu_1_1) {
							case	1 :
								mList[i] = kiosk[0][0][0] + " - 삶은 계란 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][0]) + 1000;
								break;
							case 2 :
								mList[i] = kiosk[0][0][0] + " - 치즈 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][0]) + 1000;
								break;
							case 3 : 
								mList[i] = kiosk[0][0][0];
								pList[i] = Integer.parseInt(kiosk[0][1][0]);
								break;
						}
						i += 1;
						break;
					case 2 : 
						System.out.print("===============================\n" +"\t[추가 메뉴]\n" + "-------------------------------\n" + 
								"\t1. 삶은 계란 추가\n" + "\t2. 치즈 추가\n" + "\t3. 선택 안함\n"
								+ "-------------------------------\n" + "추가 메뉴를 선택하세요 : ");
						int menu_1_2 = input.nextInt();
						switch (menu_1_2) {
							case	1 :
								mList[i] = kiosk[0][0][1] + " - 삶은 계란 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][1]) + 1000;
								break;
							case 2 :
								mList[i] = kiosk[0][0][1] + " - 치즈 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][1]) + 1000;
								break;
							case 3 : 
								mList[i] = kiosk[0][0][1];
								pList[i] = Integer.parseInt(kiosk[0][1][1]);
								break;
						}
						i += 1;
						break;
					case 3 : 
						System.out.print("===============================\n" +"\t[추가 메뉴]\n" + "-------------------------------\n" + 
								"\t1. 치킨 토핑 추가\n" + "\t2. 마요네즈 추가\n" + "\t3. 선택 안함\n"
								+ "-------------------------------\n" + "추가 메뉴를 선택하세요 : ");
						int menu_1_3 = input.nextInt();
						switch (menu_1_3) {
							case	1 :
								mList[i] = kiosk[0][0][2] + " - 치킨 토핑 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][2]) + 1000;
								break;
							case 2 :
								mList[i] = kiosk[0][0][2] + " - 마요네즈 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][2]) + 1000;
								break;
							case 3 : 
								mList[i] = kiosk[0][0][2];
								pList[i] = Integer.parseInt(kiosk[0][1][2]);
								break;
						}
						i += 1;
						break;
					case 4 : 
						System.out.print("===============================\n" +"\t[추가 메뉴]\n" + "-------------------------------\n" + 
								"\t1. 치즈 추가\n" + "\t2. 계란후라이 추가\n" + "\t3. 선택 안함\n"
								+ "-------------------------------\n" + "추가 메뉴를 선택하세요 : ");
						int menu_1_4 = input.nextInt();
						switch (menu_1_4) {
							case	1 :
								mList[i] = kiosk[0][0][3] + " - 치즈 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][3]) + 1000;
								break;
							case 2 :
								mList[i] = kiosk[0][0][3] + " - 계란후라이 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][3]) + 1000;
								break;
							case 3 : 
								mList[i] = kiosk[0][0][3];
								pList[i] = Integer.parseInt(kiosk[0][1][3]);
								break;
						}
						i += 1;
						break;
					case 5 : 
						System.out.print("===============================\n" +"\t[추가 메뉴]\n" + "-------------------------------\n" + 
								"\t1. 떡 추가\n" + "\t2. 공기밥 추가\n" + "\t3. 선택 안함\n"
								+ "-------------------------------\n" + "추가 메뉴를 선택하세요 : ");
						int menu_1_5 = input.nextInt();
						switch (menu_1_5) {
							case	1 :
								mList[i] = kiosk[0][0][4] + " - 떡 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][4]) + 1000;
								break;
							case 2 :
								mList[i] = kiosk[0][0][4] + " - 공기밥 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][4]) + 1000;
								break;
							case 3 : 
								mList[i] = kiosk[0][0][4];
								pList[i] = Integer.parseInt(kiosk[0][1][4]);
								break;
						}
						i += 1;
						break;
					case 6 : 
						System.out.print("===============================\n" +"\t[추가 메뉴]\n" + "-------------------------------\n" + 
								"\t1. 삼겹살 추가\n" + "\t2. 쫄면 추가\n" + "\t3. 선택 안함\n"
								+ "-------------------------------\n" + "추가 메뉴를 선택하세요 : ");
						int menu_1_6 = input.nextInt();
						switch (menu_1_6) {
							case	1 :
								mList[i] = kiosk[0][0][5] + " - 삼겹살 추가";
								pList[i] =  Integer.parseInt(kiosk[0][1][5]) + 1000;
								break;
							case 2 :
								mList[i] = kiosk[0][0][5] + " - 쫄면 추가";
								pList[i] =  Integer.parseInt(kiosk[0][1][5]) + 1000;
								break;
							case 3 : 
								mList[i] = kiosk[0][0][5];
								pList[i] =  Integer.parseInt(kiosk[0][1][5]);
								break;
						}
						i += 1;
						break;
					case 7 : 
						System.out.print("===============================\n" +"\t[추가 메뉴]\n" + "-------------------------------\n" + 
								"\t1. 고기 추가\n" + "\t2. 밥 추가\n" + "\t3. 선택 안함\n"
								+ "-------------------------------\n" + "추가 메뉴를 선택하세요 : ");
						int menu_1_7 = input.nextInt();
						switch (menu_1_7) {
							case	1 :
								mList[i] = kiosk[0][0][6] + " - 고기 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][6]) + 1000;
								break;
							case 2 :
								mList[i] = kiosk[0][0][6] + " -  밥 추가";
								pList[i] = Integer.parseInt(kiosk[0][1][6]) + 1000;
								break;
							case 3 : 
								mList[i] = kiosk[0][0][6];
								pList[i] = Integer.parseInt(kiosk[0][1][6]);
								break;
						}
						i += 1;
						break;
					case 8 : 
						mList[i] = kiosk[0][0][7];
						pList[i] = Integer.parseInt(kiosk[0][1][7]);
						i += 1;
						break;
					case 9 : 
						mList[i] = kiosk[0][0][8];
						pList[i] = Integer.parseInt(kiosk[0][1][8]); 
						i += 1;
						break;
				}
				break;
				
			case	2 :
				System.out.printf("===============================\n" +"\t[샐러드 스토어]\n" + "-------------------------------\n" +
						"\t1. %s\n" + "\t2. %s\n" + "\t3. %s\n" + "\t4. %s\n" + "\t5. %s\n"
						+ "-------------------------------\n" + "메뉴를 선택하세요 : ",
						kiosk[1][0][0],  kiosk[1][0][1],  kiosk[1][0][2],  kiosk[1][0][3], kiosk[1][0][4]);
				
				int menu_2 = input.nextInt();
				switch (menu_2) {
					case 1 : 
						pList[i] = Integer.parseInt(kiosk[1][1][0]); 
						mList[i] = kiosk[1][0][0];
						i += 1;
						break;
					case 2 : 
						pList[i] = Integer.parseInt(kiosk[1][1][1]); 
						mList[i] = kiosk[1][0][1];
						i += 1;
						break;
					case 3 : 
						pList[i] = Integer.parseInt(kiosk[1][1][2]); 
						mList[i] = kiosk[1][0][2];
						i += 1;
						break;
					case 4 : 
						pList[i] = Integer.parseInt(kiosk[1][1][3]); 
						mList[i] = kiosk[1][0][3];
						i += 1;
						break;
					case 5 : 
						pList[i] = Integer.parseInt(kiosk[1][1][4]); 
						mList[i] = kiosk[1][0][4];
						i += 1;
						break;
				}
				break;
				
			case	3 :
				System.out.printf("===============================\n" +"\t[뼈해장국]\n" + "-------------------------------\n" + 
						"\t1. %s\n" + "\t2. %s\n" + "\t3. %s\n" + "\t4. %s\n" + "\t5. %s\n" + "\t6. %s\n" + "\t7. %s\n" + "\t8. %s\n"
						+ "-------------------------------\n" + "메뉴를 선택하세요 : ",
						kiosk[2][0][0],  kiosk[2][0][1],  kiosk[2][0][2],  kiosk[2][0][3], kiosk[2][0][4],  kiosk[2][0][5],  kiosk[2][0][6],  kiosk[2][0][7]);
				
				int menu_3 = input.nextInt();
				switch (menu_3) {
					case 1 : 
						pList[i] = Integer.parseInt(kiosk[2][1][0]); 
						mList[i] = kiosk[2][0][0];
						i += 1;
						break;
					case 2 : 
						pList[i] = Integer.parseInt(kiosk[2][1][1]); 
						mList[i] = kiosk[2][0][1];
						i += 1;
						break;
					case 3 : 
						pList[i] = Integer.parseInt(kiosk[2][1][2]); 
						mList[i] = kiosk[2][0][2];
						i += 1;
						break;
					case 4 : 
						pList[i] = Integer.parseInt(kiosk[2][1][3]); 
						mList[i] = kiosk[2][0][3];
						i += 1;
						break;
					case 5 : 
						pList[i] = Integer.parseInt(kiosk[2][1][4]); 
						mList[i] = kiosk[2][0][4];
						i += 1;
						break;
					case 6 : 
						pList[i] = Integer.parseInt(kiosk[2][1][5]); 
						mList[i] = kiosk[2][0][5];
						i += 1;
						break;
					case 7 : 
						pList[i] = Integer.parseInt(kiosk[2][1][6]); 
						mList[i] = kiosk[2][0][6];
						i += 1;
						break;
					case 8 : 
						pList[i] = Integer.parseInt(kiosk[2][1][7]); 
						mList[i] = kiosk[2][0][7];
						i += 1;
						break;
				}
				break;
			}
		//키오스크 종료
		if (rest == 4) {
			System.out.print("===============================\n" + "\t주문 내역\n" + "-------------------------------\n");
			for (int j = 0; j < i; j++) {
				int k = j + 1;
				total_price += pList[j];
				System.out.printf("%d. %s(%d원)\n", k, mList[j], pList[j]);
				}
			System.out.printf("-------------------------------\n" + "총 금액은 %d원 입니다!\n" + "즐거운 식사 되세요!", total_price);
			break;
			}
		}
	}
}
