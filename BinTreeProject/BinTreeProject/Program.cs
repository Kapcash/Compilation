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

		private static void multiplecons(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree Ret = new BinTree ("Ret", null, null);
			BinTree A = new BinTree ("A", null, null);
			BinTree B = new BinTree ("B", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			
			A = input.Dequeue();
			B = input.Dequeue();
            inParams.Enqueue(A);
            inParams.Enqueue(B);
			Y0 = (cons(inParams));
			Ret = Y0;
			output.Enqueue(Ret);
		}
		static void Main(string[] args)
		{
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 0){
                BinTree A = convertStrToBinTree(args[0]);
				input.Enqueue(A);
			}
			else{
				BinTree A = new BinTree("A", null, null);
				input.Enqueue(A);
			}
			if(args.Length > 1){
				BinTree B = convertStrToBinTree(args[1]);
                input.Enqueue(B);
			}
			else{
				BinTree B = new BinTree("B", null, null);
				input.Enqueue(B);
			}
			multiplecons(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

