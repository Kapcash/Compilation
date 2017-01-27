using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

		
		static void Main(string[] args)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
            //String consStr = "(cons(nil)(nil))";
            //String consStr = "(cons(nil)(cons(nil)(nil)))";
            //String consStr = "(cons(nil)(cons(nil)(cons(nil)(nil))))";
            String consStr = "(cons(cons(nil)(nil))(cons(nil)(cons(nil)(nil))))";
            BinTree treeBin = BinTree.convertStrToBinTree(consStr);
            int treeStr = BinTree.convertBinTreeToInt(treeBin);

            Console.WriteLine(treeStr);
			Console.ReadLine();
		}
	}
}

