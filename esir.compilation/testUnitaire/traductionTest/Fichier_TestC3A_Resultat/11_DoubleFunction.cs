using System;
using System.Collections.Generic;


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
			BinTree B = new BinTree ("B", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			
			A = input.Dequeue();
			inParams.Enqueue(nil);
			if(BinTree.isTrue(nil))
			{
				((Action)(() => { }))();
			}else{
				((Action)(() => { }))();
			}
			output.Enqueue(A);
			output.Enqueue(B);
		}
		static void Main(string[] args)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree A = BinTree.convertStrToBinTree(args[0]);
				inParams.Enqueue(A);
			}
			else{
				BinTree A = new BinTree("A", null, null);
				inParams.Enqueue(A);
			}
			ifTest(inParams, outParams);
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

