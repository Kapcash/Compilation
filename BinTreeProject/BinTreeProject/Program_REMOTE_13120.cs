using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code
		static BinTree nil = new BinTree("nil", null, null);
		
		private static void isZero(Queue<BinTree> input, Queue<BinTree> output)
			BinTree B = new BinTree ("B", null, null);
			
			
			inParams.Enqueue(nil);
			inParams.Enqueue(nil);
			Y0 = (cons(inParams));
			X0 = Y0;
			B = X0;
		static void Main(string[] args)
		{
            Console.WriteLine("TEST");
            Console.WriteLine(convertStrToBinTree("(cons     (nil)    (cons   (list   (nil)    (nil)) (nil)  ))").DisplayTree());
            Console.ReadLine();
        }
	}
}

