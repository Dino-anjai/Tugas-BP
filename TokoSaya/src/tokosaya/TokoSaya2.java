package tokosaya;
import java.util.Scanner;
public class TokoSaya2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        cGoods good = new cGoods ();
        cPembeli pembeli = new cPembeli();
        int choice = 0;
        do{
            System.out.println("Store App");
            System.out.println("1.Goods\n2.Buyer\n3.exit");
            System.out.print("Choose = ");
            choice=sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println(" Goods Menu ");
                    System.out.println("  1. Add");
                    System.out.println("  2. Read");
                    System.out.println("  3. Update");
                    System.out.println("  4. Delete");
                    System.out.println("  5. Back");
                    System.out.print(" Choose =");
                    int choice2=sc.nextInt();
                    switch(choice2){
                        case 1:
                            good=new cGoods(101,"Rice",18000,100);
                            break;
                        case 2:
                            if((good!=null) && (good.getName()!=null))
                                System.out.println(good.ToString());
                            else
                                System.out.println("Empty good!");
                            break;
                        case 3:
                            System.out.println("New price =");
                            double nprice=sc.nextDouble();
                            good.setPrice(nprice);
                            break;
                        case 4:
                            System.out.println("Delete"+good.getName());
                            System.out.print("1. Yes\n2. No = ");
                            int confirm=sc.nextInt();
                            if(confirm==1){
                                good=null; 
                            System.out.println("Good is Deleted");
                            }
                            else
                                System.out.println("Canceled!");
                            break;
                        case 5:
                            System.out.println("Back to main");
                    }
                    break;
                case 2 :
                    System.out.println(" Buyer Menu ");
                    break;
                case 3:
                    System.out.println("Thank You...");
            }
        }while (choice!=3);
    }
}
