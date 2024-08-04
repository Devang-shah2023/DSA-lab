import java.util.Scanner;

class Queue{
    public int front, rear, size, capacity;
    public int[] queueArray;

    public Queue(int capacity){
        this.capacity= capacity;
        front=size=0;
        rear= capacity-1;
        queueArray= new int[capacity];
    }

    boolean isFull(){
        return(size == capacity);
    }
    boolean isEmpty(){
        return(size==0);
    }

    void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full. Cannot enqueue");
            return;
        }
        rear= (rear+1)%capacity;
        queueArray[rear]=item;
        size++;
        System.out.println(item+"enqueue to the queue");
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot dequeue.");
            return Integer.MIN_VALUE;
        }
        int item= queueArray[front];
        front=(front+1)%capacity;
        size--;
        System.out.println(item+"dequeue from the queue");
        return item;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue elements.");
        for(int i=0; i<size; i++){
            System.out.println(queueArray[(front+i)%capacity]+ " ");
        }
        System.out.println();
    }
}

public class program50 {
   

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter capacity of queue:");
        int capacity= scanner.nextInt();
        Queue queue= new Queue(capacity);

        int choice,item;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY");
            System.out.println("Enter your choice:");
            choice= scanner.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter item to enqueue:");
                item= scanner.nextInt();
                queue.enqueue(item);
                break;

                case 2:
                 queue.dequeue();
                 break;

                case 3:
                queue.display();
                break;

                default:
                System.out.println("Invalid choice ! please try again");
            }

        } while(choice !=3);
            scanner.close();
        

    }
   
}