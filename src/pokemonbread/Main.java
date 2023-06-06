package pokemonbread;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public Main() {
	}

	public void start() {
		display("                                  ,'\\\r\n"
				+ "    _.----.        ____         ,'  _\\   ___    ___     ____\r\n"
				+ "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\r\n"
				+ "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\r\n"
				+ " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\r\n"
				+ "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\r\n"
				+ "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\r\n"
				+ "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\r\n"
				+ "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\r\n"
				+ "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\r\n"
				+ "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\r\n"
				+ "                                `'                            '-._|"

		);
		while (true) {
			display("\n포켓몬빵을 드시겠습니까?\ny.네\tn.아니오\n");
			String input = input();
			if (input.equals("y")) {
				selectBread();
				break;
			} else if (input.equals("n")) {
				display("무조건 쳐드삼");
			}
		}
	}

	public void selectBread() {
		String[] breadType = { "피카츄빵", "꼬부기빵", "파이리빵", "푸린빵", "디그다빵", "고오스빵", "로켓단빵" };
		int[] breadIndex = { 0, 1, 2, 3, 4, 5, 6 };
		display("포켓몬빵을 고르십시오:\n" + breadIndex[0] + "." + breadType[0] + "\t" + breadIndex[1] + "." + breadType[1] + "\n"
				+ breadIndex[2] + "." + breadType[2] + "\t" + breadIndex[3] + "." + breadType[3] + "\n" + breadIndex[4]
				+ "." + breadType[4] + "\t" + breadIndex[5] + "." + breadType[5] + "\n" + breadIndex[6] + "."
				+ breadType[6] + "\t");
		String input = input();
		switch (input) {
		case "0":
			display("피카피카 촉촉 치즈케익");
			break;
		case "1":
			display("꼬부기의 달콤파삭 꼬부기빵");
			break;
		case "2":
			display("파이리의 화르륵 핫소스빵");
			break;
		case "3":
			display("푸린의 폭신폭신 딸기크림빵");
			break;
		case "4":
			display("디그다의 딸기 카스타드 빵");
			break;
		case "5":
			display("돌아온 고오스 초코케익");
			break;
		case "6":
			display("돌아온 로켓단 초코롤");
			break;
		}
		display("을 우걱우걱 쩝쩝");
		checkSticker();
	}

	public void checkSticker() {
		while (true) {
			display("\n포켓몬빵을 드셨습니다. 스티커를 확인하시겠습니까?\ny.네\tn.아니오");
			String input = input();
			if (input.equals("y")) {
				showSticker();
				break;
			} else if (input.equals("n")) {
				display("무조건 확인");
			}
		}
	}

	public void showSticker() {
		String[] stickers = { "피카츄", "라이츄", "파이리", "꼬부기", "이상해씨" };
		Random rRandom = new Random();
		int rNum = rRandom.nextInt(stickers.length);
		display("축하합니다! 스티커:" + stickers[rNum] + "를 획득했습니다!");

	}

	public void display(String text) {
		System.out.print(text);
	}

	public String input() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
}
