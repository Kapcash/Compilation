using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code

		private static void callFunction(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			A = input.Dequeue();
			inParams.Enqueue(A);
			inParams.Enqueue(A);
			f1(inParams,outParams);
			Y0 = outParams.Dequeue();
			X0 = Y0;
			Ret = X0;
			output.Enqueue(Ret);
		}

		private static void f1(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			A = input.Dequeue();
			B = input.Dequeue();
			inParams.Enqueue(A);
			inParams.Enqueue(B);
			Y0 = (cons(inParams));
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
			callFunction(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

