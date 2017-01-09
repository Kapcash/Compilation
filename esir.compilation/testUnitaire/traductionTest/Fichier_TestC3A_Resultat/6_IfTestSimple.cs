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

		private static void ifTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			//Here the temp var used by the compiler
			BinTree Y29 = new BinTree ("Y29", null, null);
			BinTree Y31 = new BinTree ("Y31", null, null);
			BinTree Y30 = new BinTree ("Y30", null, null);
			BinTree Y22 = new BinTree ("Y22", null, null);
			BinTree Y24 = new BinTree ("Y24", null, null);
			BinTree Y23 = new BinTree ("Y23", null, null);
			BinTree Y26 = new BinTree ("Y26", null, null);
			BinTree Y25 = new BinTree ("Y25", null, null);
			BinTree Y28 = new BinTree ("Y28", null, null);
			BinTree Y27 = new BinTree ("Y27", null, null);
			A = input.Dequeue();
			inParams.Enqueue(nil);
			inParams.Enqueue(root);
			inParams.Enqueue(Y22);
			inParams.Enqueue(Y23);
			inParams.Enqueue(Y24);
			inParams.Enqueue(Y25);
			inParams.Enqueue(Y26);
			inParams.Enqueue(Y27);
			inParams.Enqueue(Y28);
			inParams.Enqueue(Y29);
			inParams.Enqueue(Y30);
			if(isTrue())
			{
				((Action)(() => { }))();
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
			ifTest(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

