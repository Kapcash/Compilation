using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

		private static void isZero(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree B = new BinTree ("B", null, null);
			BinTree X = new BinTree ("X", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			X = input.Dequeue();
			X0 = X;
			if(BinTree.isTrue(X0))
			{
				X0 = nil;
				B = X0;
			}else{
				inParams.Enqueue(nil);
				inParams.Enqueue(nil);
				Y0 = (BinTree.cons(inParams));
				X0 = Y0;
				B = X0;
			}
			output.Enqueue(B);
		}
		static void Main(string[] args)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree X = BinTree.convertStrToBinTree(args[0]);
				inParams.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				inParams.Enqueue(X);
			}
			isZero(inParams, outParams);
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

