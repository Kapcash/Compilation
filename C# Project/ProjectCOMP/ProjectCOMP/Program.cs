using System;
using System.Collections.Generic;

namespace ProjectCOMP
{
	class Program
	{
		static void Main(String[] args)
		{
		}

		private void multiplecons(Queue<BinTree> input, Queue<BinTree> output)
		{
			Queue<BinTree> inParams = new Queue<BinTree>();
			Queue<BinTree> outParams = new Queue<BinTree>();
			BinTree A = input.Dequeue();
			BinTree B = input.Dequeue();
			BinTree C = input.Dequeue();
			BinTree D = input.Dequeue();
			BinTree E = input.Dequeue();
			BinTree Y0;
			inParams.Enqueue(B);
			cons(inParams,outParams);
			Y0 = outParams.Dequeue();
			BinTree Y1;
			inParams.Enqueue(A);
			inParams.Enqueue(Y0);
			inParams.Enqueue(C);
			cons(inParams,outParams);
			Y1 = outParams.Dequeue();
			BinTree X0;
			X0 = Y1;
			BinTree Ret;
			Ret = X0;
			output.Enqueue(Ret);
		}
	}
}

