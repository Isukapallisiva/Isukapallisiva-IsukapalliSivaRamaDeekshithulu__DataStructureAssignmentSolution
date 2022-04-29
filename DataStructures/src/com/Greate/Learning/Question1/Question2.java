package com.Greate.Learning.Question1;

public class Question2 {
    Node root;
    static Node newroot,curr;
    public static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
    public void bsttoSkew( Node root){
        if(root==null){
            return ;
        }
        bsttoSkew(root.left);
        if(curr==null){
            curr =root;
            newroot = root;
        }
        else{
            curr.right=root;
            curr.left=null;
            curr=curr.right;
        }
        bsttoSkew(root.right);
    }
    public static void main(String[] args) {
        Question2 tree = new Question2();
        tree.root =new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.right.left = new Node(55);
        curr=null;
        tree.bsttoSkew(tree.root);
        tree.root = newroot;
        System.out.println("Skewed Tree:");
        while(newroot!=null){
            System.out.print(newroot.data+" ");
            newroot=newroot.right;
        }
    }
}