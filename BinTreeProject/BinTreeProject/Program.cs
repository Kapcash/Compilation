using System;
using System.Collections.Generic;

namespace BinTreeProject
{
	class Program
	{
		static void Main(String[] args)
		{
		}

		private void fun2(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree Y0;
			inParams.Enqueue(A);
			fun1(inParams,outParams);
			Y0 = outParams.Dequeue();
			BinTree Y1;
			Y1 = outParams.Dequeue();
			BinTree X0;
			X0 = Y1;
			BinTree Result;
			Result = X0;
			output.Enqueue(Result);
		}

		private void fun1(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree Y0;
			Y0 = tl(A);
			BinTree X0;
			X0 = Y0;
			BinTree T;
			T = X0;
			Y0 = hd(A);
			X0 = Y0;
			BinTree H;
			H = X0;
			output.Enqueue(T);
			output.Enqueue(H);
		}
	}
}

