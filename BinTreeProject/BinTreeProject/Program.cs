using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{

		private static void multiplecons(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree B = input.Dequeue();
			BinTree C = input.Dequeue();
			BinTree D = input.Dequeue();
			BinTree E = input.Dequeue();
			BinTree Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(B);
			inParams.Enqueue(C);
			outParams.Enqueue(cons(inParams));
			BinTree Y1 = new BinTree ("Y1", null, null);
			inParams.Enqueue(A);
			inParams.Enqueue(Y0);
			outParams.Enqueue(cons(inParams));
			BinTree X0 = new BinTree ("X0", null, null);
			X0 = Y1;
			BinTree Ret = new BinTree ("Ret", null, null);
			Ret = X0;
			Y0 = new BinTree ("Y0", null, null);
			Y0 = head(A);
			X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			Ret = X0;
			Y0 = A;
			X0 = new BinTree ("X0", null, null);
			X0 = Y0;
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
			if(args.Length > 1){
				BinTree B = new BinTree(args[1], null, null);
				input.Enqueue(B);
			}
			else{
				BinTree B = new BinTree("B", null, null);
				input.Enqueue(B);
			}
			if(args.Length > 2){
				BinTree C = new BinTree(args[2], null, null);
				input.Enqueue(C);
			}
			else{
				BinTree C = new BinTree("C", null, null);
				input.Enqueue(C);
			}
			if(args.Length > 3){
				BinTree D = new BinTree(args[3], null, null);
				input.Enqueue(D);
			}
			else{
				BinTree D = new BinTree("D", null, null);
				input.Enqueue(D);
			}
			if(args.Length > 4){
				BinTree E = new BinTree(args[4], null, null);
				input.Enqueue(E);
			}
			else{
				BinTree E = new BinTree("E", null, null);
				input.Enqueue(E);
			}
			multiplecons(input, output);
		}
	}
}

