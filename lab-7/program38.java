public class program38 {
    public int maxsize;
    public int [] stackArray;
    public int top;

    public void operations(int size){
        maxsize= size;
        stackArray= new int[maxsize];
        top=-1;
    }
    public void push(int value){
        if(top==maxsize-1){
            System.out.println("Stack overflow. Cannot push");
        }
    }
    
}
