using System;
using System.Collections.Generic;


namespace BinTreeProject
{
	class Program
	{

		private void symboles(Queue<Tree.BinTree> input, Queue<Tree.BinTree> output)
		{
			Queue<Tree.BinTree> inParams = new Queue<Tree.BinTree>();
			Queue<Tree.BinTree> outParams = new Queue<Tree.BinTree>();
			Tree.BinTree A = input.Dequeue();
			Tree.BinTree B = input.Dequeue();
			Tree.BinTree C = input.Dequeue();
			Tree.BinTree M;
			Tree.BinTree N;
			Tree.BinTree O;
			Tree.BinTree P;
			Tree.BinTree Y0;
			Y0 = Tree.evaluate("AND",O,P);
			Tree.BinTree Y1;
			Y1 = Tree.evaluate("AND",N,Y0);
			Tree.BinTree Y2;
			Y2 = Tree.evaluate("AND",M,Y1);
			Tree.BinTree X0;
			X0 = Y2;
			Tree.BinTree G;
			G = X0;
			Tree.BinTree K;
			Tree.BinTree L;
			Tree.BinTree Y0;
			Y0 = Tree.evaluate("AND",K,L);
			if(Tree.isTrue(K))
			{
				((Action)(() => { }))();
			}else{
				((Action)(() => { }))();
			}
			Tree.BinTree H;
			Tree.BinTree Y0;
			Y0 = Tree.evaluate("AND",H,G);
			while(Tree.isTrue(H))
			{
				((Action)(() => { }))();
				Tree.BinTree H;
				Tree.BinTree Y0;
				Y0 = Tree.evaluate("AND",H,G);
			}
			output.Enqueue(A);
			output.Enqueue(B);
		}
		static void Main()
		{
			Queue<Tree.BinTree> input = new Queue<Tree.BinTree>();
			Queue<Tree.BinTree> output = new Queue<Tree.BinTree>();
			Tree.BinTree A = new Tree.BinTree("A", null, null);
			input.Enqueue(A);
			Tree.BinTree B = new Tree.BinTree("B", null, null);
			input.Enqueue(B);
			Tree.BinTree C = new Tree.BinTree("C", null, null);
			input.Enqueue(C);
			symboles(input, output);
		}
	}
}

