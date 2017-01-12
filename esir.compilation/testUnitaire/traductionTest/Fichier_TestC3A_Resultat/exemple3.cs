using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		private static BinTree symbole = new BinTree ("symbole", null, null);
		

		private static void symbolesFunction(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree Cond = new BinTree ("Cond", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			BinTree E = new BinTree ("E", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree X1 = new BinTree ("X1", null, null);
			
			A = input.Dequeue();
			B = input.Dequeue();
			inParams.Enqueue(B);
			X0 = Y0;
			inParams.Enqueue(nil);
			X1 = Y0;
			A = X0;
			C = X1;
			inParams.Enqueue(B);
			X0 = Y0;
			C = X0;
			inParams.Enqueue(Cond);
			if(BinTree.isTrue(Cond))
			{
				inParams.Enqueue(nil);
				while(BinTree.isTrue())
				{
					inParams.Enqueue(A);
					X0 = Y0;
					D = X0;
					inParams.Enqueue(nil);
				}
			}else{
				inParams.Enqueue(nil);
				while(BinTree.isTrue(nil))
				{
					inParams.Enqueue(D);
					testAffect(inParams,outParams);
					Y0 = outParams.Dequeue();
					X0 = Y0;
					E = X0;
					Y0 = BinTree.tail(nil);
					nil = Y0;
				}
			}
			output.Enqueue(A);
			output.Enqueue(B);
			output.Enqueue(C);
		}

		private static void testAffect(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			BinTree X = new BinTree ("X", null, null);
			BinTree Y = new BinTree ("Y", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			A = input.Dequeue();
			inParams.Enqueue(symbole);
			X0 = Y0;
			X = X0;
			inParams.Enqueue(A);
			X0 = Y0;
			Y = X0;
			inParams.Enqueue(X);
			inParams.Enqueue(Y);
			Y0 = (BinTree.cons(inParams));
			while(BinTree.isTrue(Y0))
			{
				inParams.Enqueue(C);
				inParams.Enqueue(D);
				consFun(inParams,outParams);
				Y0 = outParams.Dequeue();
				X0 = Y0;
				Y = X0;
				inParams.Enqueue(X);
				inParams.Enqueue(Y);
				Y0 = (BinTree.cons(inParams));
			}
			output.Enqueue(X);
		}

		private static void consFun(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree Ret = new BinTree ("Ret", null, null);
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			A = input.Dequeue();
			B = input.Dequeue();
			inParams.Enqueue(A);
			inParams.Enqueue(B);
			Y0 = (BinTree.cons(inParams));
			X0 = Y0;
			Ret = X0;
			output.Enqueue(Ret);
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
			if(args.Length > 1){
				BinTree B = BinTree.convertStrToBinTree(args[1]);
				inParams.Enqueue(B);
			}
			else{
				BinTree B = new BinTree("B", null, null);
				inParams.Enqueue(B);
			}
			symbolesFunction(inParams, outParams);
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

