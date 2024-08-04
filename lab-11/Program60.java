import java.util.*;
public class Program60 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("Enter your choice:");
            choice= scanner.nextInt();

            switch (choice) {
                case 1:
                System.out.println("Enter data to push:");
                data= scanner.nextInt();
                push(data);
                    break;

                
                case 2:
                data=pop();
                if (data !=-1) {
                    System.out.println("Popped element:"+data);
                    
                }
                break;

                case 3:
                data= peek();
                if (data!=-1) {
                    System.out.println("Top element:"+data);
                    
                }
                break;


            
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            
        }
    }
}
    class Node{
        int data;
        Node link;

        Node(int data){
            this.data= data;
            this.link= null;
        }
    }
    static Node top= null;

    public static boolean isEmpty(){
        return top== null;
    }

    public static void push(int data){
        Node newNode= new Node(data);
        newNode.link=top;
        top= newNode;
    }

    public static int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow !");
            return -1;
        }
        int data= top.data;
        top= top.link;
        return data;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
 

