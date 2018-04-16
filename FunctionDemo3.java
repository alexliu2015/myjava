import java.util.*;

class FunctionDemo3{
	public static void main(String[] args){
		char studentLevel = getLevel(55);
		System.out.println("student level is "+studentLevel);
	}

	public static char getLevel(int score){
		char level = 'U';
		if(score >=90 && score <= 100){
			level = 'A';
		}else if(score >=80 && score <=89){
			level = 'B';
		}else if(score >= 70 && score <= 79){
			level = 'C';
		}else if(score >= 60 && score <= 69){
			level = 'D';
		}else{
			level = 'F';
		}

		return level;
	}
}
