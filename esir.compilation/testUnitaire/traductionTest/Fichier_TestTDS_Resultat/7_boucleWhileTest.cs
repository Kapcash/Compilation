using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code

		private static void boucleWhileTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			A = input.Dequeue();
			B = input.Dequeue();
			C = input.Dequeue();
			D = input.Dequeue();
			Y0 = nil;
			while(isTrue(Y0))
			{
				Y0 = B;
				X0 = Y0;
				A = X0;
				Y0 = nil;
			}
			Y0 = C;
			while(isTrue(Y0))
			{
				Y0 = D;
				X0 = Y0;
				C = X0;
				Y0 = C;
			}
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
			boucleWhileTest(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

