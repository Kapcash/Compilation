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

		private static void newVarInAff(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree Ret = new BinTree ("Ret", null, null);
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			//Here the temp var used by the compiler
			BinTree Y71 = new BinTree ("Y71", null, null);
			BinTree Y70 = new BinTree ("Y70", null, null);
			BinTree Y73 = new BinTree ("Y73", null, null);
			BinTree Y72 = new BinTree ("Y72", null, null);
			BinTree Y75 = new BinTree ("Y75", null, null);
			BinTree Y74 = new BinTree ("Y74", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y76 = new BinTree ("Y76", null, null);
			BinTree Y68 = new BinTree ("Y68", null, null);
			BinTree Y67 = new BinTree ("Y67", null, null);
			BinTree Y69 = new BinTree ("Y69", null, null);
			A = input.Dequeue();
			inParams.Enqueue(B);
			inParams.Enqueue(root);
			inParams.Enqueue(Y67);
			inParams.Enqueue(Y68);
			inParams.Enqueue(Y69);
			inParams.Enqueue(Y70);
			inParams.Enqueue(Y71);
			inParams.Enqueue(Y72);
			inParams.Enqueue(Y73);
			inParams.Enqueue(Y74);
			inParams.Enqueue(Y75);
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
			newVarInAff(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

