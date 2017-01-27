using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

		private static void f(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree X = new BinTree ("X", null, null);
			BinTree Z = new BinTree ("Z", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			X = input.Dequeue();
			inParams.Enqueue(X);
			inParams.Enqueue(X);
			add(inParams,outParams);
			Y0 = outParams.Dequeue();
			X0 = Y0;
			Z = X0;
			output.Enqueue(Z);
		}

		private static void add(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree S = new BinTree ("S", null, null);
			BinTree X = new BinTree ("X", null, null);
			BinTree Y = new BinTree ("Y", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			X = input.Dequeue();
			Y = input.Dequeue();
			X0 = X;
			S = X0;
			while(BinTree.isTrue(Y))
			{
				inParams.Enqueue(S);
				incr(inParams,outParams);
				Y0 = outParams.Dequeue();
				X0 = Y0;
				S = X0;
				Y0 = BinTree.tail(Y);
				Y = Y0;
			}
			output.Enqueue(S);
		}

		private static void incr(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree X = new BinTree ("X", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			X = input.Dequeue();
			inParams.Enqueue(nil);
			inParams.Enqueue(X);
			Y0 = (BinTree.cons(inParams));
			X0 = Y0;
			X = X0;
			output.Enqueue(X);
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
			f(inParams, outParams);
			BinTree resTree = outParams.Dequeue();
			Console.WriteLine(resTree.DisplayTree());
			Console.WriteLine("Equivalent en nombre : "+BinTree.convertBinTreeToInt(resTree));
		}
	}
}

