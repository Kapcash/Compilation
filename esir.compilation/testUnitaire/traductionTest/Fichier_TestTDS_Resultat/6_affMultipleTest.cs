using System;
using System.Collections.Generic;

namespace BinTreeProject
{
	class Program
	{
		static void Main(String[] args)
		{
		}

		private void affMultiple(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree B = input.Dequeue();
			BinTree C = input.Dequeue();
			BinTree D = input.Dequeue();
			Y0 = C;
			BinTree X0;
			X0 = Y0;
			Y0 = D;
			BinTree X1;
			X1 = Y0;
			A = X0;
			B = X1;
			output.Enqueue(A);
		}
	}
}

