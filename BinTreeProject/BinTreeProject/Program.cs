using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{

		private static void fun2(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(A);
			fun1(inParams,outParams);
			Y0 = new BinTree ("Y0", null, null);
			Y0 = outParams.Dequeue();
			BinTree Y1 = new BinTree ("Y1", null, null);
			Y1 = outParams.Dequeue();
			X0 = new BinTree ("X0", null, null);
			X0 = Y1;
			BinTree Result = new BinTree ("Result", null, null);
			Result = X0;
			output.Enqueue(Result);
		}

		private static void fun1(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			Y0 = new BinTree ("Y0", null, null);
			Y0 = tail(A);
			BinTree X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			BinTree T = new BinTree ("T", null, null);
			T = X0;
			Y0 = new BinTree ("Y0", null, null);
			Y0 = head(A);
			X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			BinTree H = new BinTree ("H", null, null);
			H = X0;
			output.Enqueue(T);
			output.Enqueue(H);
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
			}
			fun2(input, output);
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 1){
				BinTree A = new BinTree(args[1], null, null);
				input.Enqueue(A);
			}
			else{
				BinTree A = new BinTree("A", null, null);
				input.Enqueue(A);
			}
			if(args.Length > 2){
				BinTree A = new BinTree(args[2], null, null);
				input.Enqueue(A);
			}
			else{
				BinTree A = new BinTree("A", null, null);
				input.Enqueue(A);
			}
			fun1(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

