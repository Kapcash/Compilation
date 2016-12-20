namespace ProjectCOMP
{
    class BinTree
    {
        BinTree parent;
        BinTree leftSon;
        BinTree rightSon;

        public BinTree(BinTree pa, BinTree le, BinTree ri)
        {
            parent = pa;
            leftSon = le;
            rightSon = ri;
        }

        public static BinTree head(BinTree tree)
        {
            if (tree.leftSon != null)
                return tree.leftSon;
            return null;
        }

        public static BinTree tail(BinTree tree)
        {
            if(tree.rightSon != null)
                return tree.rightSon;
            return null;
        }

        public static BinTree cons(BinTree tree1, BinTree tree2)
        {
            if(tree1 != null && tree2 != null)
                return new BinTree(null, tree1, tree2);
            return null;
        }
    }
}
