using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		private static BinTree symbole = new BinTree ("symbole", null, null);

		private static void symbolesFunction(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree Cond = new BinTree ("Cond", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			BinTree E = new BinTree ("E", null, null);
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree X1 = new BinTree ("X1", null, null);
			A = input.Dequeue();
			B = input.Dequeue();
			Y0 = B;
			X0 = Y0;
			Y0 = nil;
			X1 = Y0;
			A = X0;
			C = X1;
			Y0 = B;
			X0 = Y0;
			C = X0;
			Y0 = Cond;
			if(isTrue(Y0))
			{
				Y0 = nil;
				while(isTrue(Y0))
				{
					Y0 = A;
					X0 = Y0;
					D = X0;
					Y0 = nil;
				}
			}
			output.Enqueue(A);
			output.Enqueue(B);
			output.Enqueue(C);
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
			symbolesFunction(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

