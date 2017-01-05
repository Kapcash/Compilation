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
			Tree.BinTree H;
			Tree.BinTree G;
			Tree.BinTree Y0;
			Y0 = Tree.evaluate("AND",H,G);
			while(Tree.isTrue(H))
			{
				Tree.BinTree Cond;
				Y0 = Cond;
				Tree.BinTree H;
				Tree.BinTree G;
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

