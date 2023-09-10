package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<>();

    kitchenDrawer.push("Pan");
    kitchenDrawer.push("Dish");
    kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);

        System.out.println("Taking top element:");
        System.out.println(kitchenDrawer.pop());
        System.out.println("What has left:");

        System.out.println(kitchenDrawer);

        kitchenDrawer.add(1,"Glove");//this is not a stack operation. This is a list operation.
        System.out.println(kitchenDrawer);



    }
}
