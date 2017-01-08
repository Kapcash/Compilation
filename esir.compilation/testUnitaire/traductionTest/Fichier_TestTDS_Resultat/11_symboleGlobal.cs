using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		private static BinTree global = new BinTree ("global", null, null);

		private static void symbolNull(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree Ret = new BinTree ("Ret", null, null);
			BinTree A = new BinTree ("A", null, null);
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			A = input.Dequeue();
			Y0 = global;
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
			symbolNull(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

