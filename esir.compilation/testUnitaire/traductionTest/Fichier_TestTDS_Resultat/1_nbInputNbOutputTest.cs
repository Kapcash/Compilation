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

		private static void nbInputOutputTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			//Here the temp var used by the compiler
			BinTree Y101 = new BinTree ("Y101", null, null);
			BinTree Y100 = new BinTree ("Y100", null, null);
			BinTree Y103 = new BinTree ("Y103", null, null);
			BinTree Y102 = new BinTree ("Y102", null, null);
			BinTree Y105 = new BinTree ("Y105", null, null);
			BinTree Y104 = new BinTree ("Y104", null, null);
			BinTree Y97 = new BinTree ("Y97", null, null);
			BinTree Y106 = new BinTree ("Y106", null, null);
			BinTree Y99 = new BinTree ("Y99", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y98 = new BinTree ("Y98", null, null);
			A = input.Dequeue();
			B = input.Dequeue();
			C = input.Dequeue();
			D = input.Dequeue();
			inParams.Enqueue(B);
			inParams.Enqueue(root);
			inParams.Enqueue(Y97);
			inParams.Enqueue(Y98);
			inParams.Enqueue(Y99);
			inParams.Enqueue(Y100);
			inParams.Enqueue(Y101);
			inParams.Enqueue(Y102);
			inParams.Enqueue(Y103);
			inParams.Enqueue(Y104);
			inParams.Enqueue(Y105);
			A = X0;
			output.Enqueue(A);
			output.Enqueue(B);
			output.Enqueue(D);
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
			nbInputOutputTest(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

