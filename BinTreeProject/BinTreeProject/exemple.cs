using System;
using System.Collections.Generic;
using static Tree.BinTree;

namespace BinTreeProject
{
    class exemple
    {
        static void Main()
        {
            Tree.BinTree A = new Tree.BinTree("A", null, null);
            Tree.BinTree B = new Tree.BinTree("B", null, null);
            Tree.BinTree C = new Tree.BinTree("C", null, null);
            Tree.BinTree D = new Tree.BinTree("D", null, null);
            Queue<Tree.BinTree> input = new Queue<Tree.BinTree>();
            Queue<Tree.BinTree> output = new Queue<Tree.BinTree>();

            input.Enqueue(A);
            input.Enqueue(B);
            input.Enqueue(C);
            input.Enqueue(D);

             multiplecons(input, output);
           
            Console.WriteLine(output.Dequeue().DisplayTree());
            Console.ReadLine();
        }

        private static void multiplecons(Queue<Tree.BinTree> input, Queue<Tree.BinTree> output)
        {
            Queue<Tree.BinTree> inParams = new Queue<Tree.BinTree>();
            Queue<Tree.BinTree> outParams = new Queue<Tree.BinTree>();
            Tree.BinTree A = input.Dequeue();
            Tree.BinTree B = input.Dequeue();
            Tree.BinTree C = input.Dequeue();
            Tree.BinTree D = input.Dequeue();
            inParams.Enqueue(A);
            inParams.Enqueue(B);
            inParams.Enqueue(C);
            inParams.Enqueue(D);
            Tree.BinTree test = list(inParams);
            output.Enqueue(test);
            
        }
    }

}
