public class Program82 {
       
     static class node{
        int data;
        Program82.node left;
        Program82.node right;

        public node(int data){
            this.data = data;
         }
     }
     static int preindex;

     static node ConstructTreeUntil(int pre[], int post[], int l, int h, int size) {
        if(preindex>=size || l>h)
        return null;

        node root=new node(pre[preindex]);
        preindex++;

        if(l==h || preindex>=size) 
        return root;

        int i;
        for(i=1;i<=h;i++){
        if(post[i]==pre[preindex])
        break;
        }

        if(i<=h){
            root.left=ConstructTreeUntil(pre, post, l, i, size);
            root.right=ConstructTreeUntil(pre, post, i+1, h-1, size);
        }
         return root; 
     }

     static node ConstructTree(int pre[], int post[], int size){
        preindex=0;
        return ConstructTreeUntil(pre, post, 0, size-1, size);
     }

     static void printInOrder(node root){
        if(root==null)
        return;

        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.right);
     }  
}
