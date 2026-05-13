package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        double cp = sc.nextInt();
        System.out.print("Enter selling price : ");
        double sp = sc.nextInt();
        double profit = sp-cp;
        double loss = cp-sp;

        if(sp>cp){
            System.out.println("Profit of : "+(profit/cp)*100+"%");
        }
        else if(sp<cp){
            System.out.println("Loss is : "+(loss/cp)*100+"%");
        }
        else{
            System.out.println("No profit & Loss");
        }
    }
}
