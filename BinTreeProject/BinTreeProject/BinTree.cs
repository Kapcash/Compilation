using System;
using System.Collections.Generic;
using System.Linq;

namespace Tree
{
    class BinTree
    {
        string data;
        BinTree leftSon;
        BinTree rightSon;

        public BinTree(string da, BinTree le, BinTree ri)
        {
            data = da;
            if (!da.Equals("nil")) {
                leftSon = le;
                rightSon = ri;
            }
            else
            {
                leftSon = null;
                rightSon = null;
            }
            
        }

        public string getData()
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
            if(!tree.data.Equals("nil"))
                leftSon = tree;
        }

        public void setRightSon(BinTree tree)
        {
            if (!tree.data.Equals("nil"))
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
                    return new BinTree("cons", tree, cons(inParams));
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
                    return new BinTree("list", tree, new BinTree("nil", null, null));
                }
                else
                {
                    return new BinTree("list", tree, list(inParams));
                }

            }

            return null;

        }

        public static BinTree evaluate(string op, BinTree tree1, BinTree tree2)
        {
            if (op.Equals("AND"))
            {
                if (tree1.data.Equals("nil") || (tree2.data.Equals("nil")))
                    return new BinTree("nil", null, null);
                else
                    return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
            }
            else if (op.Equals("OR"))
            {
                if (tree1.data.Equals("nil") && (tree2.data.Equals("nil")))
                    return new BinTree("nil", null, null);
                else
                    return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
            }
            else if (op.Equals("EQ"))
            {
                if (evaluateEQ(tree1, tree2)==false)
                    return new BinTree("nil", null, null);
                else
                    return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
            }
            return null;

        }

        public static bool evaluateEQ(BinTree tree1, BinTree tree2)
        {
            if(tree1.data.Equals(tree2.data) && evaluateEQ(tree1.leftSon, tree2.leftSon) && evaluateEQ(tree1.rightSon, tree2.rightSon))
            {
                return true;
            }
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

        public static bool isTrue(BinTree tree)
        {
            if (!tree.data.Equals("nil"))
                return true;
            return false;
        }

    }
}
