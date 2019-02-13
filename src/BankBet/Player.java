package BankBet;

public class Player {
	private int money = 0;
	private int point = 0;
	private int betMoney = 0;
	//Constructor
	Player(){
		money = 1000;
	}
	//money
	int getMoney() {
		return money;
	}
	void setMoney(int tempNum) {
		money = tempNum;
	}
	//betMoney
	int getBetMoney() {
		return (int) (betMoney * 1.2);
	}
	void setBetMoney(int tempInt) {
		betMoney = tempInt;
	}
	int returnBetMoney() {
		return betMoney;
	}
		
	//point
	int getPoint() {
		return point;
	}
	void setPoint(int tempNum) {
		point = tempNum;
	}
}
