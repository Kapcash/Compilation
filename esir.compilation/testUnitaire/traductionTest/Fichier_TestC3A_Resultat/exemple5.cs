using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code

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
			Y0 = (cons(inParams));
			inParams.Enqueue(A);
			inParams.Enqueue(Y0);
			Y1 = (cons(inParams));
			X0 = Y1;
			Ret = X0;
			Y0 = head(A);
			X0 = Y0;
			Ret = X0;
			Y0 = A;
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
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

