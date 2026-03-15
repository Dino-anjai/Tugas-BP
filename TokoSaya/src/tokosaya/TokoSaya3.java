package tokosaya;
import java.util.Scanner;
import java.util.ArrayList;
public class TokoSaya3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        cGoods good = new cGoods (111,"Rice",18000,100);
        ArrayList<cPembeli> daftarPembeli = new ArrayList<>();
        int counterID = 1;
        cPembeli pembeli1 = new cPembeli ();
        cSales sale = new cSales();
        int choice = 0;
        do{
            System.out.println("Store App");
            System.out.println("1.Goods\n2.Buyer\n3.sales\n4.exit");
            System.out.print("Choose = ");
            choice=sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("------ Goods Menu ---------");
                    System.out.println("  1. Add");
                    System.out.println("  2. Read");
                    System.out.println("  3. Update");
                    System.out.println("  4. Delete");
                    System.out.println("  5. Back");
                    System.out.println("---------------------------");
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
                case 2:
                    System.out.println(" ------ Buyer Menu --------");
                    System.out.println("  1. Add");
                    System.out.println("  2. Read");
                    System.out.println("  3. Update");
                    System.out.println("  4. Delete");
                    System.out.println("  5. Back");
                    System.out.println("---------------------------");
                    System.out.print(" Choose =");
                    int choice3=sc.nextInt();
                    switch(choice3){
                         case 1 :
                            // add pembeli
                            System.out.print("Masukkan Nama: ");
                            String n = sc.next();
                            System.out.print("Masukkan Alamat: ");
                            String a = sc.next();
                            int i = counterID++;
                            System.out.println("User berhasil ditambahkan");
                            System.out.println("Data anda : " + "\n ID:" + i + "\n Nama : " +n + "\n Alamat:" +a);
                            cPembeli pembelibaru = new cPembeli (i,n,a);
                            daftarPembeli.add(pembelibaru);
                            break;
                        case 2 :
                            // Read
                            if(daftarPembeli.isEmpty()){
                                    System.out.println("User tidak ditemukan!");
                            }
                            else
                                for(cPembeli p : daftarPembeli){
                                        System.out.println(p.ToString());
                                }
                            break;
                        case 3 :
                            // update
                            System.out.print("Masukkan ID Pembeli: ");
                            int idUpdate = sc.nextInt();
                            for(cPembeli p : daftarPembeli){
                            if(p.getsId()== idUpdate){
                             System.out.print("Alamat baru : ");
                             String nw = sc.next();
                             p.setAddres(nw);
                            System.out.println("Alamat berhasil diubah");
                                 }
                            }
                            break;
                        case 4 :
                           System.out.print("Masukkan ID Pembeli yang akan dihapus: ");
                           int idDelete = sc.nextInt();
                           for(cPembeli p : daftarPembeli){
                           if(p.getsId() == idDelete){
                           daftarPembeli.remove(p);
                           System.out.println("Pembeli berhasil dihapus");    
                                }
                           }
                           break;
                        case 5 :
                           System.out.println("Back to main");
                    }
                  break;
                case 3:
                System.out.println("------ Sales Menu ------");
                if(daftarPembeli.isEmpty()){
                    System.out.println("Belum ada pembeli, silakan tambah di menu Buyer");
                    break;
                }
                // pilih pembeli
                System.out.print("Masukkan ID Pembeli: ");
                int idBuyer = sc.nextInt();
                cPembeli pembeliDipilih = null;
                for(cPembeli p : daftarPembeli){
                if(p.getsId() == idBuyer){
                pembeliDipilih = p;
                    break;
                }
                }
                if(pembeliDipilih == null){
                System.out.println("Pembeli tidak ditemukan!");
                break;
                }

                // tampilkan barang
                System.out.println("Goods = " + good.getName());
                System.out.print("Masukkan nama barang: ");
                String g = sc.next();

                if(g.equalsIgnoreCase(good.getName())){
                System.out.print("Quantity: ");
                int q = sc.nextInt();

                sale.addSales(q, good, pembeliDipilih, q);
                sale.printSales();
                }
                else{
                System.out.println("Barang tidak ditemukan!");
                }
            break;
                
                case 4:
                    System.out.println("Thank You...");
                }
            }while (choice!=4);
    }
}

