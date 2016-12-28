using System;
using System.Collections.Generic;

namespace BinTreeProject
{
	class Program
	{
		static void Main(String[] args)
		{
		}

		private void boucleWhileTest(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree B = input.Dequeue();
			BinTree C = input.Dequeue();
			BinTree D = input.Dequeue();
			Y0 = nil;
			while(true)
			{
				Y0 = B;
				BinTree X0;
				X0 = Y0;
				A = X0;
			}
			Y0 = C;
			while(true)
			{
				Y0 = D;
				X0 = Y0;
				C = X0;
			}
			output.Enqueue(A);
		}
	}
}

