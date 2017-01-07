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
			BinTree Q = new BinTree ("Q", null, null);
			Q = X0;
			BinTree R = new BinTree ("R", null, null);
			R = X1;
			BinTree Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(R);
			inParams.Enqueue(Y);
			subs(inParams,outParams);
			Y0 = new BinTree ("Y0", null, null);
			 = outParams.Dequeue();
			X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			BinTree NextR = new BinTree ("NextR", null, null);
			NextR = X0;
			Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(NextR);
			isNotZero(inParams,outParams);
			Y0 = new BinTree ("Y0", null, null);
			 = outParams.Dequeue();
			while(isTrue(Y0))
			{
				Y0 = new BinTree ("Y0", null, null);
				inParams.Enqueue(Q);
				incr(inParams,outParams);
				Y0 = new BinTree ("Y0", null, null);
				 = outParams.Dequeue();
				X0 = new BinTree ("X0", null, null);
				X0 = Y0;
				Y0 = NextR;
				X1 = new BinTree ("X1", null, null);
				X1 = Y0;
				Q = X0;
				R = X1;
				Y0 = new BinTree ("Y0", null, null);
				inParams.Enqueue(NextR);
				isNotZero(inParams,outParams);
				Y0 = new BinTree ("Y0", null, null);
				 = outParams.Dequeue();
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
			X0 = new BinTree ("X0", null, null);
			X0 = Y0;
			BinTree D = new BinTree ("D", null, null);
			D = X0;
			for(expr)
			{
				Y0 = Y;
			}
			Y0 = Y;
			output.Enqueue(D);
		}

		private static void isNotZero(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree X = input.Dequeue();
			Y0 = X;
			if(isTrue(Y0))
			{
				nil = new BinTree ("nil", null, null);
				Y0 = nil;
				X0 = new BinTree ("X0", null, null);
				X0 = Y0;
				BinTree B = new BinTree ("B", null, null);
				B = X0;
			}else{
				nil = new BinTree ("nil", null, null);
				nil = new BinTree ("nil", null, null);
				Y0 = new BinTree ("Y0", null, null);
				inParams.Enqueue(nil);
				inParams.Enqueue(nil);
				Y0 = (cons(inParams));
				X0 = new BinTree ("X0", null, null);
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
			nil = new BinTree ("nil", null, null);
			Y0 = new BinTree ("Y0", null, null);
			inParams.Enqueue(nil);
			inParams.Enqueue(X);
			Y0 = (cons(inParams));
			X0 = new BinTree ("X0", null, null);
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
				nil = new BinTree ("nil", null, null);
				Y0 = nil;
				X0 = new BinTree ("X0", null, null);
				X0 = Y0;
				B = new BinTree ("B", null, null);
				B = X0;
			}else{
				nil = new BinTree ("nil", null, null);
				nil = new BinTree ("nil", null, null);
				Y0 = new BinTree ("Y0", null, null);
				inParams.Enqueue(nil);
				inParams.Enqueue(nil);
				Y0 = (cons(inParams));
				X0 = new BinTree ("X0", null, null);
				X0 = Y0;
				B = X0;
			}
			output.Enqueue(B);
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
			}
			div(input, output);
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 2){
				BinTree X = new BinTree(args[2], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 3){
				BinTree Y = new BinTree(args[3], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			if(args.Length > 4){
				BinTree X = new BinTree(args[4], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 5){
				BinTree Y = new BinTree(args[5], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			}
			subs(input, output);
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 6){
				BinTree X = new BinTree(args[6], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 7){
				BinTree Y = new BinTree(args[7], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			if(args.Length > 8){
				BinTree X = new BinTree(args[8], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 9){
				BinTree Y = new BinTree(args[9], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			if(args.Length > 10){
				BinTree X = new BinTree(args[10], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			}
			isNotZero(input, output);
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 11){
				BinTree X = new BinTree(args[11], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 12){
				BinTree Y = new BinTree(args[12], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			if(args.Length > 13){
				BinTree X = new BinTree(args[13], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 14){
				BinTree Y = new BinTree(args[14], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			if(args.Length > 15){
				BinTree X = new BinTree(args[15], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 16){
				BinTree X = new BinTree(args[16], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			}
			incr(input, output);
			Queue<BinTree> input = new Queue<BinTree>();
			Queue<BinTree> output = new Queue<BinTree>();
			if(args.Length > 17){
				BinTree X = new BinTree(args[17], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 18){
				BinTree Y = new BinTree(args[18], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			if(args.Length > 19){
				BinTree X = new BinTree(args[19], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 20){
				BinTree Y = new BinTree(args[20], null, null);
				input.Enqueue(Y);
			}
			else{
				BinTree Y = new BinTree("Y", null, null);
				input.Enqueue(Y);
			}
			if(args.Length > 21){
				BinTree X = new BinTree(args[21], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 22){
				BinTree X = new BinTree(args[22], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			if(args.Length > 23){
				BinTree X = new BinTree(args[23], null, null);
				input.Enqueue(X);
			}
			else{
				BinTree X = new BinTree("X", null, null);
				input.Enqueue(X);
			}
			isNotZero(input, output);
			Console.WriteLine(output.Dequeue().DisplayTree());
			Console.ReadLine();
		}
	}
}

