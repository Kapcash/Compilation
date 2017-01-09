using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);

		private static void affect1Test(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			//Here the temp var used by the compiler
			BinTree Y91 = new BinTree ("Y91", null, null);
			BinTree Y90 = new BinTree ("Y90", null, null);
			BinTree Y93 = new BinTree ("Y93", null, null);
			BinTree Y92 = new BinTree ("Y92", null, null);
			BinTree Y95 = new BinTree ("Y95", null, null);
			BinTree Y94 = new BinTree ("Y94", null, null);
			BinTree Y97 = new BinTree ("Y97", null, null);
			BinTree Y96 = new BinTree ("Y96", null, null);
			BinTree Y88 = new BinTree ("Y88", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y89 = new BinTree ("Y89", null, null);
			A = input.Dequeue();
			B = input.Dequeue();
			inParams.Enqueue(B);
			inParams.Enqueue(root);
			inParams.Enqueue(Y88);
			inParams.Enqueue(Y89);
			inParams.Enqueue(Y90);
			inParams.Enqueue(Y91);
			inParams.Enqueue(Y92);
			inParams.Enqueue(Y93);
			inParams.Enqueue(Y94);
			inParams.Enqueue(Y95);
			inParams.Enqueue(Y96);
			A = X0;
			output.Enqueue(A);
		}
		static void Main(string[] args)
		{
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree A = new BinTree(args[0], null, null);
				input.Enqueue(A);
			}
			else{
				BinTree A = new BinTree("A", null, null);
				input.Enqueue(A);
			}
			if(args.Length > 1){
				BinTree B = new BinTree(args[1], null, null);
				input.Enqueue(B);
			}
			else{
				BinTree B = new BinTree("B", null, null);
				input.Enqueue(B);
			}
			affect1Test(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

