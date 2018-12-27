package practice01;

public class Prob5 {

	public static void main(String[] args) {
		String str;
		boolean b1 = false, b2 = false;
		for(int i = 0; i <= 99; i++) {
			str = Integer.toString(i);
			
			if(str.charAt(0) == '3' || str.charAt(0) == '6' || str.charAt(0) == '9') {
				b1 = true;
			}
			if(str.length() == 2) {
				if(str.charAt(1) == '3' || str.charAt(1) == '6' || str.charAt(1) == '9') {
					b2 = true;
				}	
			}
			if(b1 == true && b2 == true) {
				System.out.println(str + "짝짝");
			}
			else if(b1 == true || b2 == true) {
				System.out.println(str + "짝");
			}
			b1 = false; 
			b2 = false;
		}
	}
}
