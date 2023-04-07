package test;

public class Test1 {
	
public static void main(String[] args) {
		
		
		int score = 75;  
		String result = "";
		String branch_name = "BranchX";
		
		if((score>100) || (score<0)) {
			System.out.println(score + "은(는)잘못된 점수입니다.");
		}
		
		else {
		
			if (score>=90) {
				result = "A";
			}
			
			else if (score>=80) {
				result = "B";
			}
			
			else if (score>=70) {
				result = "C";
			}
			
			else if (score>=60) {
				result = "D";
			}
			
			else {
				result = "F.";
			}
	
			System.out.println("점수:"+score + "\t학점:"+result);
			System.out.println("branch_name : " + branch_name);
		}
		
	}


}
