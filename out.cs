using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

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
			inParams.Enqueue(X);
			X0 = Y0;
			S = X0;
			inParams.Enqueue(Y);
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
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree X = BinTree.convertStrToBinTree(args[0]);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 1){
				BinTree Y = BinTree.convertStrToBinTree(args[1]);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			add(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

