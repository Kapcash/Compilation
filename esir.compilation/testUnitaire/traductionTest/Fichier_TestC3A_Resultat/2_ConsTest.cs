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

		private static void consTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			//Here the temp var used by the compiler
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y1209 = new BinTree ("Y1209", null, null);
			A = input.Dequeue();
			B = input.Dequeue();
			C = input.Dequeue();
			inParams.Enqueue(B);
			inParams.Enqueue(C);
			Y1209 = (cons(inParams));
			X0 = Y1209;
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
			if(args.Length > 2){
				BinTree C = new BinTree(args[2], null, null);
				input.Enqueue(C);
			}
			else{
				BinTree C = new BinTree("C", null, null);
				input.Enqueue(C);
			}
			consTest(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}
