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
		

		private static void isZero(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree B = new BinTree ("B", null, null);
			BinTree X = new BinTree ("X", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			X = input.Dequeue();
			inParams.Enqueue(nil);
			inParams.Enqueue(nil);
			Y0 = (cons(inParams));
			X0 = Y0;
			B = X0;
			output.Enqueue(B);
		}
		static void Main(string[] args)
		{
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree X = new BinTree(args[0], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			isZero(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

