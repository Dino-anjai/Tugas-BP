package tokosaya;
public class cSales {
  private int code;
  private cGoods goods;
  private cPembeli pembeli;
  private int qty;
  private double total;
  cSales (){} //empty
  public void addSales(int c, cGoods g, cPembeli p, int q){
      code = c; goods=g; pembeli = p; qty=q;
      total= qty*goods.getPrice();
  } 
  public void printSales (){
      System.out.println("Sale");
      System.out.println("Code   :"+code);
      System.out.println("Buyer  :"+pembeli.getName());
      System.out.println("Goods  :"+goods.getName());
      System.out.println("Quantity :"+qty);
      System.out.println("Price    :"+goods.getPrice());
      System.out.println("Total    :"+total);
  }
}
