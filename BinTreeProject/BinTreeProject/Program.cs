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

		private static void add(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree S = new BinTree ("S", null, null);
			BinTree D = new BinTree ("D", null, null);
			BinTree G = new BinTree ("G", null, null);
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree Y1 = new BinTree ("Y1", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y2 = new BinTree ("Y2", null, null);
			A = input.Dequeue();
			B = input.Dequeue();
			inParams.Enqueue(nil);
			inParams.Enqueue(nil);
			Y0 = (cons(inParams));
			inParams.Enqueue(nil);
			inParams.Enqueue(Y0);
			Y1 = (cons(inParams));
			inParams.Enqueue(nil);
			inParams.Enqueue(Y1);
			Y2 = (cons(inParams));
			X0 = Y2;
			C = X0;
			inParams.Enqueue(nil);
			inParams.Enqueue(nil);
			Y0 = (cons(inParams));
			inParams.Enqueue(nil);
			inParams.Enqueue(Y0);
			Y1 = (cons(inParams));
			inParams.Enqueue(nil);
			inParams.Enqueue(Y1);
			Y2 = (cons(inParams));
			X0 = Y2;
			D = X0;
			Y0 = C;
			X0 = Y0;
			S = X0;
			Y0 = evaluate("EQ",C,D);
			X0 = Y0;
			G = X0;
			Y0 = D;
			while(isTrue(Y0))
			{
				inParams.Enqueue(nil);
				inParams.Enqueue(S);
				Y0 = (cons(inParams));
				X0 = Y0;
				S = X0;
				Y0 = tail(D);
				D = Y0;
			}
			output.Enqueue(G);
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
			add(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

