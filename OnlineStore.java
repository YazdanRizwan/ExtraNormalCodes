package Yazdan;

import java.util.*;

public class OnlineStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int totalPrice=0;
		
		//pricing each item:
		int pen = 20;
		int pencil = 8;
		int eraser = 5;
		int scale = 10;
		
		//buying Item;
		boolean buyingItem=true;
		
		while(buyingItem) {
			
			//choosing a product
			System.out.println();
			System.out.println("Choose out a product: ");
			System.out.println("1. Pen");
			System.out.println("2. Pencil");
			System.out.println("3. Eraser");
			System.out.println("4. Scale");
			System.out.println("5. Calculate my total price");
			int item=sc.nextInt();
			
			//Entering quantity and calculating total sum
			if(item>0 && item<5) {
				System.out.println("Enter the quantity");
				int qua = sc.nextInt();
				//Calculating Total Price
				if(item == 1) {
					totalPrice+= pen*qua;
				}
				else if(item == 2) {
					totalPrice+= pencil*qua;
				}
				else if(item == 3) {
					totalPrice+= eraser*qua;
				}
				else if(item == 4) {
					totalPrice+= scale*qua;
				}
				
			}
			
			else if(item == 5) {
				buyingItem = false;
			} 
			
			else if(item!=5){
				System.out.println("Invalid input");
			}
		}
		
		//Printing total price
		System.out.println("Total price you have to pay is: "+totalPrice);
	}

}
