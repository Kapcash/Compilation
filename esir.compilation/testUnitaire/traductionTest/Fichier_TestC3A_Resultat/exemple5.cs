using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

		private static void multiplecons(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree Ret = new BinTree ("Ret", null, null);
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			BinTree E = new BinTree ("E", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree Y1 = new BinTree ("Y1", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			A = input.Dequeue();
			B = input.Dequeue();
			C = input.Dequeue();
			D = input.Dequeue();
			E = input.Dequeue();
			inParams.Enqueue(B);
			inParams.Enqueue(C);
			Y0 = (BinTree.cons(inParams));
			inParams.Enqueue(A);
			inParams.Enqueue(Y0);
			Y1 = (BinTree.cons(inParams));
			X0 = Y1;
			Ret = X0;
			Y0 = BinTree.head(A);
			X0 = Y0;
			Ret = X0;
			X0 = A;
			Ret = X0;
			output.Enqueue(Ret);
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
			if(args.Length > 2){
				BinTree C = BinTree.convertStrToBinTree(args[2]);
				inParams.Enqueue(C);
			}
			else{
				BinTree C = new BinTree("C", null, null);
				inParams.Enqueue(C);
			}
			if(args.Length > 3){
				BinTree D = BinTree.convertStrToBinTree(args[3]);
				inParams.Enqueue(D);
			}
			else{
				BinTree D = new BinTree("D", null, null);
				inParams.Enqueue(D);
			}
			if(args.Length > 4){
				BinTree E = BinTree.convertStrToBinTree(args[4]);
				inParams.Enqueue(E);
			}
			else{
				BinTree E = new BinTree("E", null, null);
				inParams.Enqueue(E);
			}
			multiplecons(inParams, outParams);
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

