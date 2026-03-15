package tokosaya;
public class cGoods {
    //data
    private int id;
    private String name;
    private double price;
    private int stock;
    //method
    cGoods(){
        System.out.println("This is default constructor");
    }
    cGoods(int i, String n, double p, int s){
        id=i; name=n; price=p; stock=s;
        System.out.println("parameterized constructor");
        System.out.println("Object "+name+" is created..");
    }
    public void setPrice(double p){ price=p; }
    public void setStock(int s){stock= s; }
    public int getId(){return id;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getStock (){return stock;}
    public String ToString(){
        return " ("+id+")" +" "+ name+ " "+price+" "+stock;
    }
}
