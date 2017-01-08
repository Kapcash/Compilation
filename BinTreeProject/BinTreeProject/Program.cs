using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{

		private static void fun1(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			BinTree Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(B);
			inParams.Enqueue(C);
			inParams.Enqueue(D);
			Y0 = (cons(inParams));
			while(isTrue(head(Y0)))
			{
				Y0 = head(A);
				((Action)(() => { }))();
				inParams.Enqueue(B);
				inParams.Enqueue(C);
				inParams.Enqueue(D);
				Y0 = (cons(inParams));
				BinTree Y1 = new BinTree ("Y1", null, null);
				Y1 = tail(Y0);
				Y0 = Y1;
			}
			BinTree T = new BinTree ("T", null, null);
			output.Enqueue(T);
			BinTree H = new BinTree ("H", null, null);
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
			fun1(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

