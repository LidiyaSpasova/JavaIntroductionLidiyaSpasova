package encapsulation;

import java.util.LinkedList;

public class Person {

    private String name;

    private int money;

    private LinkedList <Product> bagOfProducts = new LinkedList<Product>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Error: Invalid entry for person name");
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money >= 0){
        this.money = money;
    }else {
            System.out.println("Error: Invalid entry for person money");
        }
    }

    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }
    public void buyProduct(Product product){
        if(this.money >= product.getCost()){
            bagOfProducts.add(product);
            this.setMoney(this.money - product.getCost());
            System.out.printf("%s bought %s.\n", this.name, product.getName());
        }else {
            System.out.printf("%s can't afford %s.\n", this.name, product.getName());
        }
    }

    public void printItemsInTheBag(){
        if(bagOfProducts.size() == 0){
            System.out.printf("%s - Nothing bought\n", this.name);
            return;
        }
    }
}
