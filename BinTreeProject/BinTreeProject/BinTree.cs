using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tree
{
    class BinTree
    {
        String data;
        BinTree leftSon;
        BinTree rightSon;

        public BinTree(String da, BinTree le, BinTree ri)
        {
            data = da;
            leftSon = le;
            rightSon = ri;
        }

        public String getData()
        {
            return data;
        }

        public BinTree getLeftSon()
        {
            return leftSon;
        }

        public BinTree getRightSon()
        {
            return rightSon;
        }

        public void setLeftSon(BinTree tree)
        {
            leftSon = tree;
        }

        public void setRightSon(BinTree tree)
        {
            rightSon = tree;
        }

        public static BinTree head(BinTree tree)
        {
            if (tree.leftSon != null)
                return tree.leftSon;
            return null;
        }

        public static BinTree tail(BinTree tree)
        {
            if (tree.rightSon != null)
                return tree.rightSon;
            return null;
        }

        public static BinTree cons(Queue<BinTree> inParams)
        {
            if (inParams != null)
            {
                BinTree tree = inParams.Dequeue();
                if (inParams.Count() == 0)
                {
                    return tree;
                }
                else
                {
                    return new BinTree("noeud", tree, cons(inParams));
                }

            }

            return null;
        }

        public static BinTree list(Queue<BinTree> inParams)
        {
            if (inParams != null)
            {
                BinTree tree = inParams.Dequeue();
                if (inParams.Count() == 0)
                {
                    return new BinTree("noeud", tree, new BinTree("nil", null, null));
                }
                else
                {
                    return new BinTree("noeud", tree, list(inParams));
                }

            }

            return null;

        }

        public static BinTree evaluate(String op, BinTree tree1, BinTree tree2)
        {
            return new BinTree(null, null, null);
        }

        public static Boolean operator !=(BinTree tree1, BinTree tree2)
        {
            if (tree1.getData().Equals(tree2.getData()))
                return false;
            return true;
        }

        public static Boolean operator ==(BinTree tree1, BinTree tree2)
        {
            if (tree1.getData().Equals(tree2.getData()))
                return true;
            return false;
        }

        public String DisplayTree()
        {
            if (this.leftSon == null && this.rightSon == null)
            {
                return this.data;
            }
            else
            {
                return "(" + this.data + " , " + this.leftSon.DisplayTree() + " , " + this.rightSon.DisplayTree() + ")";
            }
        }

    }
}
