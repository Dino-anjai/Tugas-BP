package tokosaya;
public class TokoSaya {
    public static void main(String[] args) {
        cGoods rice = new cGoods();
        cGoods egg = new cGoods (1,"telur",3000,50);
        System.out.println("Aplikasi Toko Saya");
        System.out.println("------------------");
        egg.setPrice(28000);
        egg.setStock(45);
        System.out.println("ID : "+egg.getId());
        System.out.println("Name : "+egg.getName());
        System.out.println("Price : "+egg.getPrice());
        System.out.println("Stock : "+egg.getStock());
        System.out.println("Goods:"+egg.ToString()); 
    }
    
}
