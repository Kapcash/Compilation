using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

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
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree Var = BinTree.convertStrToBinTree(args[0]);
				inParams.Enqueue(Var);
			}
			else{
				BinTree Var = new BinTree("Var", null, null);
				inParams.Enqueue(Var);
			}
			main(inParams, outParams);
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

