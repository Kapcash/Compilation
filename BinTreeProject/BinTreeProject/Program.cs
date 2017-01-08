using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{

		private static void div(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree X = input.Dequeue();
			BinTree Y = input.Dequeue();
			BinTree nil = new BinTree ("nil", null, null);
			Y0 = nil;
			BinTree X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			Y0 = X;
			BinTree X1 = new BinTree ("X1", null, null);
			X1 = Y0;
			Q = X0;
			R = X1;
			BinTree Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(R);
			inParams.Enqueue(Y);
			subs(inParams,outParams);
			Y0 = outParams.Dequeue();
			X0 = Y0;
			NextR = X0;
			inParams.Enqueue(NextR);
			isNotZero(inParams,outParams);
			Y0 = outParams.Dequeue();
			while(isTrue(Y0))
			{
				inParams.Enqueue(Q);
				incr(inParams,outParams);
				Y0 = outParams.Dequeue();
				X0 = Y0;
				Y0 = NextR;
				X1 = Y0;
				Q = X0;
				R = X1;
				inParams.Enqueue(NextR);
				isNotZero(inParams,outParams);
				Y0 = outParams.Dequeue();
			}
			output.Enqueue(Q);
			output.Enqueue(R);
		}

		private static void subs(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree X = input.Dequeue();
			BinTree Y = input.Dequeue();
			Y0 = X;
			BinTree X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			D = X0;
			Y0 = Y;
			while(isTrue(head(Y0)))
			{
				BinTree Y0 = new BinTree ("Y0", null, null);
				inParams.Enqueue(D);
				decr(inParams,outParams);
				Y0 = outParams.Dequeue();
				X0 = Y0;
				D = X0;
				Y0 = tail(Y);
				Y = Y0;
			}
			output.Enqueue(D);
		}

		private static void decr(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree X = input.Dequeue();
			BinTree Y0 = new BinTree ("Y0", null, null);
			Y0 = tail(X);
			BinTree X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			X = X0;
			output.Enqueue(X);
		}

		private static void isNotZero(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree X = input.Dequeue();
			Y0 = X;
			if(isTrue(Y0))
			{
				BinTree nil = new BinTree ("nil", null, null);
				Y0 = nil;
				BinTree X0 = new BinTree ("X0", null, null);
				X0 = Y0;
				B = X0;
			}else{
				BinTree Y0 = new BinTree ("Y0", null, null);
				inParams.Enqueue(nil);
				inParams.Enqueue(nil);
				Y0 = (cons(inParams));
				X0 = Y0;
				B = X0;
			}
			output.Enqueue(B);
		}

		private static void incr(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree X = input.Dequeue();
			BinTree nil = new BinTree ("nil", null, null);
			BinTree Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(nil);
			inParams.Enqueue(X);
			Y0 = (cons(inParams));
			BinTree X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			X = X0;
			output.Enqueue(X);
		}
		static void Main(string[] args)
		{
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree X = new BinTree(args[0], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 1){
				BinTree Y = new BinTree(args[1], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			div(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

