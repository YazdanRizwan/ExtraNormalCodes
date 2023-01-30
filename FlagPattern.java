package Yazdan;

public class FlagPattern {

	public static void main(String[] args) {
		
		//printing flag;
		for(int i=0;i<15;i++) {
			
			//printing star and equal sign
			if(i<=8) {
				//printing even star
				if(i%2==0) {
					for(int j=0;j<6;j++) {
						System.out.print("* ");
					}
					for(int j=0;j<34;j++) {
						System.out.print("=");
					}
				}
				//printing odd star
				else {
					for(int j=0;j<5;j++) {
						System.out.print(" *");
					}
					System.out.print("  ");
					for(int j=0;j<34;j++) {
						System.out.print("=");
					}
				}
			}
      //printing equal sign
			else {
				for(int j=0;j<46;j++) {
					System.out.print("=");
				}
			}
			
			System.out.println();
		}

	}

}
