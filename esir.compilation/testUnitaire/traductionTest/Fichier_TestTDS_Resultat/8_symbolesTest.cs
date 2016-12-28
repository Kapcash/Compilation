using System;
using System.Collections.Generic;

namespace BinTreeProject
{
	class Program
	{
		static void Main(String[] args)
		{
		}

		private void symboleLocalTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree B = input.Dequeue();
			BinTree C = input.Dequeue();
			BinTree Y0;
			inParams.Enqueue(B);
			symboleGlobalTest(inParams,outParams);
			Y0 = outParams.Dequeue();
			BinTree X0;
			X0 = Y0;
			A = X0;
			output.Enqueue(A);
			output.Enqueue(B);
		}

		private void symboleGlobalTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			Y0 = global;
			BinTree X0;
			X0 = Y0;
			A = X0;
			output.Enqueue(A);
		}
	}
}

