package BankBet;

import java.util.Scanner;

public class Main {
	static Scanner gameScanner = new Scanner(System.in);
	static int moneyIntDog = 0;
	static int moneyIntCat = 0;
	static int moneyInt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player playerDog = new Player();
		Player playerCat = new Player();
		
		int storeMoney = 2000;
		int round = 1;
		for(int i = 1; i <= 10; i++) {
			storeMoneyIntoBank(playerDog, 1);
			storeMoneyIntoBank(playerCat, 2);
			
			getMoneyFromBank(playerDog, playerCat);
			
		}//for
		
		
		//Bet
		
		
		//Reward Point
		
	}//main

	public static void storeMoneyIntoBank(Player tempPlayer, int tempInt) {
		int moneyScanner = Integer.MAX_VALUE;
		Bank officialBank = new Bank();
		while(moneyScanner > tempPlayer.getMoney()) {
			System.out.println("You have " + tempPlayer.getMoney() + " amount of money.");
			System.out.println("How much money will you put into Bank?");
			moneyScanner = gameScanner.nextInt();
			if(moneyScanner > tempPlayer.getMoney()) {
				System.out.println("You are putting too much money!");
			}//if
		}//while
		tempPlayer.setBetMoney(moneyScanner);
		if(tempInt == 1) {
			moneyIntDog = tempPlayer.getBetMoney();
		}else {
			moneyIntCat = tempPlayer.getBetMoney();
		}
		tempPlayer.setMoney(tempPlayer.getMoney() - moneyScanner);
		System.out.println("You have " + tempPlayer.getMoney() + " left.");
		System.out.println("you WILL recieve " + moneyScanner * 1.2 + " at the end of this round.");
		//TODO : Betting system
		
		//TODO : Reward Point
		System.out.println("-----------------------------------------"); //erase later
	}//method
	
	
	public static void getMoneyFromBank(Player tempPlayer, Player tempPlayer2) {
		tempPlayer.setMoney(tempPlayer.getMoney() + tempPlayer.returnBetMoney());
		System.out.println("You have " + tempPlayer.getMoney());
		tempPlayer.setMoney(tempPlayer.getMoney() + tempPlayer.returnBetMoney());
		System.out.println("You have " + tempPlayer2.getMoney());
		System.out.println("------------------------------------");
	}
	
	
}//class
