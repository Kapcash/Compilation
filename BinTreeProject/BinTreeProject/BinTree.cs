using System;
using System.Collections.Generic;
using System.Linq;

namespace Tree
{
    class BinTree
    {
        string data;
        BinTree leftSon;
        BinTree rightSon;

        public BinTree(string da, BinTree le, BinTree ri)
        {
            data = da;
            leftSon = le;
            rightSon = ri;
        }

        public string getData()
        {
            return data;
        }

        public BinTree getLeftSon()
        {
            return leftSon;
        }

        public BinTree getRightSon()
        {
            return rightSon;
        }

        public void setLeftSon(BinTree tree)
        {
            leftSon = tree;
        }

        public void setRightSon(BinTree tree)
        {
            rightSon = tree;
        }

        public static BinTree head(BinTree tree)
        {
            if (tree.leftSon != null)
                return tree.leftSon;
            return null;
        }

        public static BinTree tail(BinTree tree)
        {
            if (tree.rightSon != null)
                return tree.rightSon;
            return null;
        }

        public static BinTree cons(Queue<BinTree> inParams)
        {
            if (inParams != null)
            {
                BinTree tree = inParams.Dequeue();
                if (inParams.Count() == 0)
                {
                    return tree;
                }
                else
                {
                    return new BinTree("noeud", tree, cons(inParams));
                }

            }

            return null;
        }

        public static BinTree list(Queue<BinTree> inParams)
        {
            if (inParams != null)
            {
                BinTree tree = inParams.Dequeue();
                if (inParams.Count() == 0)
                {
                    return new BinTree("noeud", tree, new BinTree("nil", null, null));
                }
                else
                {
                    return new BinTree("noeud", tree, list(inParams));
                }

            }

            return null;

        }

        public static BinTree evaluate(string op, BinTree tree1, BinTree tree2)
        {
            return new BinTree(null, null, null);
        }

        /* public static Boolean operator !=(BinTree tree1, BinTree tree2)
         {
             try {
                 if (tree1.getData().Equals(tree2.getData()))
                 {
                     return false;
                 }

             }
             catch(Exception e)
             {
                 Console.WriteLine();
                 Console.ReadLine();
             }
             return true;
         }

         public static Boolean operator ==(BinTree tree1, BinTree tree2)
         {
             if (tree1 != null && tree2 != null)
             {
                 if (tree1.getData().Equals(tree2.getData()))
                 {
                     return true;
                 }
             }

             return false;
         }*/

        public String DisplayTree()
        {
            if (this.leftSon == null && this.rightSon == null)
            {
                return this.data;
            }
            else
            {
                return "(" + this.data + " , " + this.leftSon.DisplayTree() + " , " + this.rightSon.DisplayTree() + ")";
            }
        }

        public static bool isTrue(BinTree tree)
        {
            return true;
        }

        /**
         * Convert a string into a BinTree.
         * The string must be writen a particular way : 
         * It can contains "(cons X Y)", "(list X Y)" or "(nil)" 
         * where X and Y are arguments in the same form.
         * /!\ This converter doesn't work for more than 3 parameters commands (cons nil nil nil) for example /!\ 
         */
        public static BinTree convertStrToBinTree(string str)
        {
            BinTree ret = new BinTree("nil",null,null);
            int i = 0;
            if(str[i] == '(') //CONS OR LIST
            {
                if (str.Substring(i + 1, 3).Equals("nil"))
                {
                    return ret; //Return BinTree("nil",null,null)
                } else if(str.Substring(i + 1, 4).Equals("cons") || str.Substring(i + 1, 4).Equals("list"))
                {
                    string cmd = str.Substring(i + 1, 4);

                    i += getNextOpeningParenthesis(str, i+5); //i+5 = char juste après "cons", recup place prochaine '('
                    int closing = getIndexClosingParenthesis(str, i); //recup ')' associee
                    BinTree arg1 = convertStrToBinTree(str.Substring((i), closing - i)); //string contenant tout le premier param du cons
                    int nextOpening = getNextOpeningParenthesis(str,closing); //recup '(' suivant la ')' du premier param -> ouverture second param
                    BinTree arg2 = convertStrToBinTree(str.Substring(nextOpening, getIndexClosingParenthesis(str, nextOpening) - (nextOpening))); //string contenant tout le second param
                    Queue<BinTree> queue = new Queue<BinTree>();
                    queue.Enqueue(arg1); queue.Enqueue(arg2);

                    if (cmd.Equals("cons")) //CONS
                    {
                        ret = cons(queue); //creation du BinTree avec les deux param (cons)
                    } else if (cmd.Equals("list")) //LIST
                    {
                        ret = list(queue); // creation du BinTree avec les deux param (list)
                    } else
                    {
                        throw new Exception("Parsing de la chaine impossible !");
                    }
                } else
                {
                    throw new Exception("Parsing de la chaine impossible !");
                }
            }
            return ret;
        }

        private static int getNextOpeningParenthesis(string str, int indexPos)
        {
            while(str[indexPos] != '(')
            {
                indexPos++;
            }
            return indexPos;
        }

        private static int getIndexClosingParenthesis(string str, int indexOpenP)
        {
            if (str[indexOpenP] != '(') return -1;
            int nbOpen = 0;
            Boolean found = false;
            while (!found)
            {
                indexOpenP++;
                if(str[indexOpenP] == ')')
                {
                    if(nbOpen == 0)
                    {
                        found = true;
                    } else
                    {
                        nbOpen--;
                    }
                } else if(str[indexOpenP] == '(')
                {
                    nbOpen++;
                }
            }
            return indexOpenP;
        }

    }
}
