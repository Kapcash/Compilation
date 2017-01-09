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
		private static BinTree global = new BinTree ("global", null, null);

		private static void symbolNull(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree Ret = new BinTree ("Ret", null, null);
			BinTree A = new BinTree ("A", null, null);
			//Here the temp var used by the compiler
			BinTree Y9 = new BinTree ("Y9", null, null);
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree Y1 = new BinTree ("Y1", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y2 = new BinTree ("Y2", null, null);
			BinTree Y3 = new BinTree ("Y3", null, null);
			BinTree Y4 = new BinTree ("Y4", null, null);
			BinTree Y5 = new BinTree ("Y5", null, null);
			BinTree Y6 = new BinTree ("Y6", null, null);
			BinTree Y7 = new BinTree ("Y7", null, null);
			BinTree Y8 = new BinTree ("Y8", null, null);
			A = input.Dequeue();
			inParams.Enqueue(global);
			inParams.Enqueue(root);
			inParams.Enqueue(Y0);
			inParams.Enqueue(Y1);
			inParams.Enqueue(Y2);
			inParams.Enqueue(Y3);
			inParams.Enqueue(Y4);
			inParams.Enqueue(Y5);
			inParams.Enqueue(Y6);
			inParams.Enqueue(Y7);
			inParams.Enqueue(Y8);
			Ret = X0;
			output.Enqueue(Ret);
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
			symbolNull(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

