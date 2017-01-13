using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

		private static void mixedTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y1 = new BinTree ("Y1", null, null);
			BinTree Y2 = new BinTree ("Y2", null, null);
			
			A = input.Dequeue();
			if(BinTree.isTrue(A))
			{
				while(BinTree.isTrue(nil))
				{
					X0 = A;
					B = X0;
					((Action)(() => { }))();
				}
			}else{
				while(BinTree.isTrue(nil))
				{
					X0 = A;
					B = X0;
					((Action)(() => { }))();
					Y0 = BinTree.tail(nil);
					nil = Y0;
				}
			}
			Y0 = BinTree.tail(B);
			Y1 = BinTree.head(C);
			inParams.Enqueue(Y0);
			inParams.Enqueue(Y1);
			inParams.Enqueue(D);
			Y2 = (BinTree.list(inParams));
			X0 = Y2;
			A = X0;
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
			mixedTest(inParams, outParams);
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

