using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code

		private static void fun1(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
<<<<<<< HEAD
			BinTree A = input.Dequeue();
			BinTree B = new BinTree ("B", null, null);
			BinTree C = new BinTree ("C", null, null);
			BinTree D = new BinTree ("D", null, null);
			BinTree Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(B);
			inParams.Enqueue(C);
			inParams.Enqueue(D);
			Y0 = (cons(inParams));
			while(isTrue(head(Y0)))
			{
				Y0 = head(A);
				((Action)(() => { }))();
				inParams.Enqueue(B);
				inParams.Enqueue(C);
				inParams.Enqueue(D);
=======
			//Here the var used in the while code
			BinTree Q = new BinTree ("Q", null, null);
			BinTree R = new BinTree ("R", null, null);
			BinTree NextR = new BinTree ("NextR", null, null);
			BinTree X = new BinTree ("X", null, null);
			BinTree Y = new BinTree ("Y", null, null);
			//Here the temp var used by the compiler
			BinTree nil = new BinTree ("nil", null, null);
			BinTree Q = new BinTree ("Q", null, null);
			BinTree R = new BinTree ("R", null, null);
			BinTree NextR = new BinTree ("NextR", null, null);
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree X1 = new BinTree ("X1", null, null);
			BinTree X = input.Dequeue();
			BinTree Y = input.Dequeue();
			Y0 = nil;
			X0 = Y0;
			Y0 = X;
			X1 = Y0;
			Q = X0;
			R = X1;
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
			//Here the var used in the while code
			BinTree D = new BinTree ("D", null, null);
			BinTree X = new BinTree ("X", null, null);
			BinTree Y = new BinTree ("Y", null, null);
			//Here the temp var used by the compiler
			BinTree D = new BinTree ("D", null, null);
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree X = input.Dequeue();
			BinTree Y = input.Dequeue();
			Y0 = X;
			X0 = Y0;
			D = X0;
			Y0 = Y;
			while(isTrue(head(Y0)))
			{
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
			//Here the var used in the while code
			BinTree X = new BinTree ("X", null, null);
			//Here the temp var used by the compiler
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree X = input.Dequeue();
			Y0 = tail(X);
			X0 = Y0;
			X = X0;
			output.Enqueue(X);
		}

		private static void isNotZero(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree B = new BinTree ("B", null, null);
			BinTree X = new BinTree ("X", null, null);
			//Here the temp var used by the compiler
			BinTree nil = new BinTree ("nil", null, null);
			BinTree B = new BinTree ("B", null, null);
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree X = input.Dequeue();
			Y0 = X;
			if(isTrue(Y0))
			{
				Y0 = nil;
				X0 = Y0;
				B = X0;
			}else{
				inParams.Enqueue(nil);
				inParams.Enqueue(nil);
>>>>>>> afd988abb236081ca17b5cad531cf66ed9cdd6c3
				Y0 = (cons(inParams));
				BinTree Y1 = new BinTree ("Y1", null, null);
				Y1 = tail(Y0);
				Y0 = Y1;
			}
<<<<<<< HEAD
			BinTree T = new BinTree ("T", null, null);
			output.Enqueue(T);
			BinTree H = new BinTree ("H", null, null);
			output.Enqueue(H);
=======
			output.Enqueue(B);
		}

		private static void incr(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			//Here the var used in the while code
			BinTree X = new BinTree ("X", null, null);
			//Here the temp var used by the compiler
			BinTree nil = new BinTree ("nil", null, null);
			BinTree Y0 = new BinTree ("Y0", null, null);
			BinTree X0 = new BinTree ("X0", null, null);
			BinTree X = input.Dequeue();
			inParams.Enqueue(nil);
			inParams.Enqueue(X);
			Y0 = (cons(inParams));
			X0 = Y0;
			X = X0;
			output.Enqueue(X);
>>>>>>> afd988abb236081ca17b5cad531cf66ed9cdd6c3
		}
		static void Main(string[] args)
		{
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 0){
				BinTree A = new BinTree(args[0], null, null);
				input.Enqueue(A);
			}
			else{
				BinTree A = new BinTree("A", null, null);
				input.Enqueue(A);
			}
			fun1(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

