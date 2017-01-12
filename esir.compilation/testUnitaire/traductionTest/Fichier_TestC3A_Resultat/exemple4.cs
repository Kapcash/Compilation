using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

		private static void consFun(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree Y = new BinTree ("Y", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree Y1 = new BinTree ("Y1", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y2 = new BinTree ("Y2", null, null);
			
			A = input.Dequeue();
			B = input.Dequeue();
			Y0 = BinTree.head(A);
			inParams.Enqueue(B);
			inParams.Enqueue(C);
			Y1 = (BinTree.cons(inParams));
			inParams.Enqueue(Y0);
			inParams.Enqueue(Y1);
			Y2 = (BinTree.cons(inParams));
			X0 = Y2;
			Y = X0;
			inParams.Enqueue(B);
			inParams.Enqueue(C);
			inParams.Enqueue(A);
			Y0 = (BinTree.cons(inParams));
			inParams.Enqueue(Y0);
			Y1 = (BinTree.cons(inParams));
			X0 = Y1;
			Y = X0;
			output.Enqueue(Y);
		}
		static void Main(string[] args)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree A = BinTree.convertStrToBinTree(args[0]);
				inParams.Enqueue(A);
			}
			else{
				BinTree A = new BinTree("A", null, null);
				inParams.Enqueue(A);
			}
			if(args.Length > 1){
				BinTree B = BinTree.convertStrToBinTree(args[1]);
				inParams.Enqueue(B);
			}
			else{
				BinTree B = new BinTree("B", null, null);
				inParams.Enqueue(B);
			}
			consFun(inParams, outParams);
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

