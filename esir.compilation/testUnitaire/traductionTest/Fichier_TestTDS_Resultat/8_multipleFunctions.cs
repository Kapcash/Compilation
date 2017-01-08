using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code

		private static void main(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree Var = new BinTree ("Var", null, null);
			//Here the temp var used by the compiler
			Var = input.Dequeue();
			((Action)(() => { }))();
			output.Enqueue(Var);
		}
		static void Main(string[] args)
		{
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree Var = new BinTree(args[0], null, null);
				input.Enqueue(Var);
			}
			else{
				BinTree Var = new BinTree("Var", null, null);
				input.Enqueue(Var);
			}
			main(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

