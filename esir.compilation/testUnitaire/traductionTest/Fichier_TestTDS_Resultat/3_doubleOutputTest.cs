using System;
using System.Collections.Generic;

namespace BinTreeProject
{
	class Program
	{
		static void Main(String[] args)
		{
		}

		private void doubleOutputTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree B = input.Dequeue();
			Y0 = B;
			BinTree X0;
			X0 = Y0;
			A = X0;
			output.Enqueue(A);
			output.Enqueue(B);
			output.Enqueue(B);
		}
	}
}

