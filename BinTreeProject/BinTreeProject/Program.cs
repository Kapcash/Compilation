using System;
using System.Collections.Generic;
using static Tree.BinTree;


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
			Tree.BinTree M = new Tree.BinTree ("M", null, null);
			Tree.BinTree N = new Tree.BinTree ("N", null, null);
			Tree.BinTree O = new Tree.BinTree ("O", null, null);
			Tree.BinTree P = new Tree.BinTree ("P", null, null);
			Tree.BinTree Y0 = new Tree.BinTree ("Y0", null, null);
			Y0 = evaluate("AND",O,P);
			Tree.BinTree Y1 = new Tree.BinTree ("Y1", null, null);
			Y1 = evaluate("AND",N,Y0);
			Tree.BinTree Y2 = new Tree.BinTree ("Y2", null, null);
			Y2 = evaluate("AND",M,Y1);
			Tree.BinTree X0 = new Tree.BinTree ("X0", null, null);
			X0 = Y2;
			Tree.BinTree G = new Tree.BinTree ("G", null, null);
			G = X0;
			Tree.BinTree K = new Tree.BinTree ("K", null, null);
			Tree.BinTree L = new Tree.BinTree ("L", null, null);
			Tree.BinTree Y0 = new Tree.BinTree ("Y0", null, null);
			Y0 = evaluate("AND",K,L);
			if(Tree.isTrue(K))
			{
				((Action)(() => { }))();
			}else{
				((Action)(() => { }))();
			}
			Tree.BinTree H = new Tree.BinTree ("H", null, null);
			Tree.BinTree Y0 = new Tree.BinTree ("Y0", null, null);
			Y0 = evaluate("AND",H,G);
			while(Tree.isTrue(H))
			{
				Tree.BinTree Cond = new Tree.BinTree ("Cond", null, null);
				Y0 = Cond;
				Tree.BinTree H = new Tree.BinTree ("H", null, null);
				Tree.BinTree Y0 = new Tree.BinTree ("Y0", null, null);
				Y0 = evaluate("AND",H,G);
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

