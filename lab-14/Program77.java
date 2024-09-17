import java.util.Scanner;

public class Program77 {
    
    public static class Node {
        int data;
        Node lptr, rptr;

        public Node(int data) {
            this.data = data;
            lptr = rptr = null;
        }
    }

    public static class BinarySearchTree {
        Node root;

        BinarySearchTree() {
            root = null;
        }

        public void insert(int data) {
            root = insertRec(root, data);
        }

        private Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data) {
                root.lptr = insertRec(root.lptr, data);
            } else if (data > root.data) {
                root.rptr = insertRec(root.rptr, data);
            }
            return root;
        }

        public boolean search(int data) {
            return searchRec(root, data);
        }

        private boolean searchRec(Node root, int data) {
            if (root == null) {
                return false;
            }
            if (root.data == data) {
                return true;
            }
            if (data < root.data) {
                return searchRec(root.lptr, data);
            }
            return searchRec(root.rptr, data);
        }

        public void delete(int data) {
            root = deleteRec(root, data);
        }

        private Node deleteRec(Node root, int data) {
            if (root == null) {
                return root;
            }

            if (data < root.data) {
                root.lptr = deleteRec(root.lptr, data);
            } else if (data > root.data) {
                root.rptr = deleteRec(root.rptr, data);
            } else {
                if (root.lptr == null) {
                    return root.rptr;
                } else if (root.rptr == null) {
                    return root.lptr;
                }

                root.data = minValue(root.rptr);

                root.rptr = deleteRec(root.rptr, root.data);
            }

            return root;
        }

        private int minValue(Node root) {
            int minValue = root.data;
            while (root.lptr != null) {
                minValue = root.lptr.data;
                root = root.lptr;
            }
            return minValue;
        }

        public void inorder() {
            inorderRec(root);
        }

        private void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.lptr);
                System.out.print(root.data + " ");
                inorderRec(root.rptr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int choice, value;

        do {
            System.out.println("\n\nMenu:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Search a node");
            System.out.println("4. Display the tree ");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    value = sc.nextInt();
                    bst.insert(value);
                    break;
                case 2:
                    System.out.print("Enter the value to delete: ");
                    value = sc.nextInt();
                    bst.delete(value);
                    break;
                case 3:
                    System.out.print("Enter the value to search: ");
                    value = sc.nextInt();
                    if (bst.search(value)) {
                        System.out.println("Node found.");
                    } else {
                        System.out.println("Node not found.");
                    }
                    break;
                case 4:
                    System.out.println("Traversal of the tree:");
                    bst.inorder();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
