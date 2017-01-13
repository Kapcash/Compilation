using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		

		private static void fib(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree F = new BinTree ("F", null, null);
			BinTree X = new BinTree ("X", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree Y1 = new BinTree ("Y1", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree Y2 = new BinTree ("Y2", null, null);
			BinTree Y3 = new BinTree ("Y3", null, null);
			BinTree Y4 = new BinTree ("Y4", null, null);
			BinTree Y5 = new BinTree ("Y5", null, null);
			
			X = input.Dequeue();
			inParams.Enqueue(X);
			isZero(inParams,outParams);
			Y0 = outParams.Dequeue();
			inParams.Enqueue(X);
			isOne(inParams,outParams);
			Y1 = outParams.Dequeue();
			Y2 = BinTree.evaluate("OR",Y0,Y1);
			if(BinTree.isTrue(Y2))
			{
				inParams.Enqueue(nil);
				inParams.Enqueue(nil);
				Y0 = (BinTree.cons(inParams));
				X0 = Y0;
				F = X0;
			}else{
				inParams.Enqueue(X);
				decr(inParams,outParams);
				Y0 = outParams.Dequeue();
				inParams.Enqueue(X);
				decr(inParams,outParams);
				Y1 = outParams.Dequeue();
				inParams.Enqueue(Y0);
				fib(inParams,outParams);
				Y2 = outParams.Dequeue();
				inParams.Enqueue(Y1);
				decr(inParams,outParams);
				Y3 = outParams.Dequeue();
				inParams.Enqueue(Y3);
				fib(inParams,outParams);
				Y4 = outParams.Dequeue();
				inParams.Enqueue(Y2);
				inParams.Enqueue(Y4);
				add(inParams,outParams);
				Y5 = outParams.Dequeue();
				X0 = Y5;
				F = X0;
			}
			output.Enqueue(F);
		}

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
			if(BinTree.isTrue(X))
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

		private static void isOne(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree B = new BinTree ("B", null, null);
			BinTree X = new BinTree ("X", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree Y1 = new BinTree ("Y1", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			X = input.Dequeue();
			inParams.Enqueue(nil);
			inParams.Enqueue(nil);
			Y0 = (BinTree.cons(inParams));
			Y1 = BinTree.evaluate("EQ",X,Y0);
			if(BinTree.isTrue(Y1))
			{
				inParams.Enqueue(nil);
				inParams.Enqueue(nil);
				Y0 = (BinTree.cons(inParams));
				X0 = Y0;
				B = X0;
			}else{
				X0 = nil;
				B = X0;
			}
			output.Enqueue(B);
		}

		private static void decr(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree X = new BinTree ("X", null, null);
			
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			
			X = input.Dequeue();
			Y0 = BinTree.tail(X);
			X0 = Y0;
			X = X0;
			output.Enqueue(X);
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
			fib(inParams, outParams);
			Console.WriteLine(outParams.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

