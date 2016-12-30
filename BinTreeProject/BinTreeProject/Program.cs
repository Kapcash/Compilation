using System;
using System.Collections.Generic;

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
            leftSon = le;
            rightSon = ri;
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
    }
=======
namespace BinTreeProject
{
	class Program
	{
		static void Main(String[] args)
		{
		}

		private void fun2(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree Y0;
			inParams.Enqueue(A);
			fun1(inParams,outParams);
			Y0 = outParams.Dequeue();
			BinTree Y1;
			Y1 = outParams.Dequeue();
			BinTree X0;
			X0 = Y1;
			BinTree Result;
			Result = X0;
			output.Enqueue(Result);
		}

		private void fun1(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree Y0;
			Y0 = tl(A);
			BinTree X0;
			X0 = Y0;
			BinTree T;
			T = X0;
			Y0 = hd(A);
			X0 = Y0;
			BinTree H;
			H = X0;
			output.Enqueue(T);
			output.Enqueue(H);
		}
	}
>>>>>>> 29074de7a1959c5508630dbda7734bb8dc8bb445
}

