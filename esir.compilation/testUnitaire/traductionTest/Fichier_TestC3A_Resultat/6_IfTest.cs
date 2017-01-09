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
			BinTree Y123 = new BinTree ("Y123", null, null);
			BinTree Y122 = new BinTree ("Y122", null, null);
			BinTree Y125 = new BinTree ("Y125", null, null);
			BinTree Y124 = new BinTree ("Y124", null, null);
			BinTree Y127 = new BinTree ("Y127", null, null);
			BinTree Y126 = new BinTree ("Y126", null, null);
			BinTree Y128 = new BinTree ("Y128", null, null);
			BinTree Y119 = new BinTree ("Y119", null, null);
			BinTree Y121 = new BinTree ("Y121", null, null);
			BinTree Y120 = new BinTree ("Y120", null, null);
			A = input.Dequeue();
			inParams.Enqueue(nil);
			inParams.Enqueue(root);
			inParams.Enqueue(Y119);
			inParams.Enqueue(Y120);
			inParams.Enqueue(Y121);
			inParams.Enqueue(Y122);
			inParams.Enqueue(Y123);
			inParams.Enqueue(Y124);
			inParams.Enqueue(Y125);
			inParams.Enqueue(Y126);
			inParams.Enqueue(Y127);
			if(isTrue())
			{
				((Action)(() => { }))();
			}else{
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

