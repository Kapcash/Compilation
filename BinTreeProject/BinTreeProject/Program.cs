using System;
using System.Collections.Generic;
using Tree;
using static Tree.BinTree;


namespace BinTreeProject
{
	class Program
	{
		//Here the symbs used in the while code

		static void Main(string[] args)
		{
            Console.WriteLine("TEST");
            Console.WriteLine(convertStrToBinTree("(cons     (nil)    (cons   (list   (nil)    (nil)) (nil)  ))").DisplayTree());
            Console.ReadLine();
        }
	}
}

