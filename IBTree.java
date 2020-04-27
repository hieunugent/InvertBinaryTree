class IBTree{
  public static void invertBST(BinaryTree tree){
    if(tree== null){
      return;
    }
    swap(tree);
    invertBST(tree.left);
    invertBST(tree.right);

  }
  public static void swap(BinaryTree tree){
    BinaryTree tempNode = tree.right;
    tree.right =  tree.left;
    tree.left  = tempNode;
  }
  static class BinaryTree{
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value){
      this.value = value;
    }
  }
}
