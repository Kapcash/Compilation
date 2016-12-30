using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

<<<<<<< HEAD
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
=======
namespace BinTreeProject
{
    class BinTree
    {
        BinTree parent;
        BinTree leftSon;
        BinTree rightSon;

        public BinTree(BinTree pa, BinTree le, BinTree ri)
        {
            parent = pa;
>>>>>>> 29074de7a1959c5508630dbda7734bb8dc8bb445
            leftSon = le;
            rightSon = ri;
        }

<<<<<<< HEAD
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

=======
>>>>>>> 29074de7a1959c5508630dbda7734bb8dc8bb445
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

<<<<<<< HEAD
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
                    Console.WriteLine("okay");
                    return new BinTree("noeud", tree, new BinTree("nil", null, null));
                }
                else
                {
                    return new BinTree("noeud", tree, list(inParams));
                }

            }

            return null;

        }

        public String DisplayTree()
        { 
            if(this.leftSon == null && this.rightSon == null)
            {
                return this.data;
            }
            else
            {
               return "("+this.data+" , "+this.leftSon.DisplayTree()+" , "+this.rightSon.DisplayTree()+")";
            }
        }
=======
        public static BinTree cons(BinTree tree1, BinTree tree2)
        {
            if (tree1 != null && tree2 != null)
                return new BinTree(null, tree1, tree2);
            return null;
        }
>>>>>>> 29074de7a1959c5508630dbda7734bb8dc8bb445
    }
}
