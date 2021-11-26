package chapter9_3;

public class Player {
	PlayerLevel level;
	
	Player() {
		level = new BeginnerLevel(); // 초기값은 초보자 레벨
	}
	
	PlayerLevel getLevel() { 
		return level;
	}
	
	void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	void play(int num) {
		level.go(num);
	}
}
