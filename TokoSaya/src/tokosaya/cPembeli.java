package tokosaya;
public class cPembeli {
   private int id ;
   private String name;
   private String addres;
   cPembeli (){
       System.out.println("Buyer object is created");
   }
   cPembeli (int i, String n, String a){
       id=i; name=n; addres=a;
       System.out.println("Pembeli "+name+"is created...");
   }
   public void setAddres(String a){
       addres=a;
   }
   public int getsId(){return id;}
   public String getName (){return name;}
   public String getAddres (){return addres;}
   public String ToString(){
       return "("+id+")"+name+" "+addres;
   }
}
