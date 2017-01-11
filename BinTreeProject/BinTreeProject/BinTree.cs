using System;
using System.Collections.Generic;
using System.Linq;

namespace BinTreeProject
{
    class BinTree
    {
        string data;
        BinTree leftSon;
        BinTree rightSon;

        public BinTree(string da, BinTree le, BinTree ri)
        {
            data = da;
            if (!da.Equals("nil")) {
                leftSon = le;
                rightSon = ri;
            }
            else
            {
                leftSon = null;
                rightSon = null;
            }
            
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
            if(!tree.data.Equals("nil"))
                leftSon = tree;
        }

        public void setRightSon(BinTree tree)
        {
            if (!tree.data.Equals("nil"))
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
                    return new BinTree("cons", tree, cons(inParams));
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
                    return new BinTree("list", tree, new BinTree("nil", null, null));
                }
                else
                {
                    return new BinTree("list", tree, list(inParams));
                }

            }

            return null;

        }

        public static BinTree evaluate(string op, BinTree tree1, BinTree tree2)
        {
            if (op.Equals("AND"))
            {
                if (tree1.data.Equals("nil") || (tree2.data.Equals("nil")))
                    return new BinTree("nil", null, null);
                else
                    return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
            }
            else if (op.Equals("OR"))
            {
                if (tree1.data.Equals("nil") && (tree2.data.Equals("nil")))
                    return new BinTree("nil", null, null);
                else
                    return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
            }
            else if (op.Equals("EQ"))
            {
                if (evaluateEQ(tree1, tree2)==false)
                    return new BinTree("nil", null, null);
                else
                    return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
            }
            return null;

        }

        public static bool evaluateEQ(BinTree tree1, BinTree tree2)
        {
            if (tree1.leftSon != null && tree2.leftSon == null)
            {
                return false;
            }
            if (tree1.leftSon == null && tree2.leftSon != null)
            {
                return false;
            }
            if (tree1.rightSon != null && tree2.rightSon == null)
            {
                return false;
            }
            if (tree1.rightSon == null && tree2.rightSon != null)
            {
                return false;
            }
            if (tree1.rightSon == null && tree2.rightSon == null && tree1.leftSon != null)
            {
                return tree1.data.Equals(tree2.data) && evaluateEQ(tree1.leftSon, tree2.leftSon);
            }
            if (tree1.leftSon == null && tree2.leftSon == null && tree1.rightSon != null)
            {
                return tree1.data.Equals(tree2.data) && evaluateEQ(tree1.rightSon, tree2.rightSon);
            }
            if (tree1.leftSon == null && tree1.rightSon == null)
            {
                return tree1.data.Equals(tree2.data);
            }
            if (tree1.data.Equals(tree2.data) && evaluateEQ(tree1.leftSon, tree2.leftSon) && evaluateEQ(tree1.rightSon, tree2.rightSon))
            {
                return true;
            }
            return false;
        }

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
            if (!tree.data.Equals("nil"))
                return true;
            return false;
        }

        /**
         * Convert a string into a BinTree.
         * The string must be writen a particular way : 
         * It can contains "(cons X Y)", "(list X Y)" or "(nil)" 
         * where X and Y are arguments in the same form.
         * or with an integer, precising the size of the tree.
         * /!\ This converter doesn't work for more than 3 parameters commands (cons nil nil nil) for example /!\ 
         */
        public static BinTree convertStrToBinTree(string str)
        {
            BinTree ret = new BinTree("nil",null,null);

            int nb;
            //If param is a integer
            if (Int32.TryParse(str, out nb))
            {
                ret = convertIntToBinTree(nb);
            } //Else, parsing manually the string
            else
            {
                int i = 0;
                if (str[i] == '(') //CONS OR LIST
                {
                    if (str.Substring(i + 1, 3).Equals("nil"))
                    {
                        return ret; //Return BinTree("nil",null,null)
                    }
                    else if (str.Substring(i + 1, 4).Equals("cons") || str.Substring(i + 1, 4).Equals("list"))
                    {
                        string cmd = str.Substring(i + 1, 4);

                        i += getNextOpeningParenthesis(str, i + 5); //i+5 = char juste après "cons", recup place prochaine '('
                        int closing = getIndexClosingParenthesis(str, i); //recup ')' associee
                        BinTree arg1 = convertStrToBinTree(str.Substring((i), closing - i)); //string contenant tout le premier param du cons
                        int nextOpening = getNextOpeningParenthesis(str, closing); //recup '(' suivant la ')' du premier param -> ouverture second param
                        BinTree arg2 = convertStrToBinTree(str.Substring(nextOpening, getIndexClosingParenthesis(str, nextOpening) - (nextOpening))); //string contenant tout le second param
                        Queue<BinTree> queue = new Queue<BinTree>();
                        queue.Enqueue(arg1); queue.Enqueue(arg2);

                        if (cmd.Equals("cons")) //CONS
                        {
                            ret = cons(queue); //creation du BinTree avec les deux param (cons)
                        }
                        else if (cmd.Equals("list")) //LIST
                        {
                            ret = list(queue); // creation du BinTree avec les deux param (list)
                        }
                        else
                        {
                            throw new Exception("Parsing de la chaine impossible !");
                        }
                    }
                    else
                    {
                        throw new Exception("Parsing de la chaine impossible !");
                    }
                }
            }
            return ret;
        }

        private static BinTree convertIntToBinTree(int nb)
        {
            Queue<BinTree> paramList = new Queue<BinTree>();
            for(int i=0;i< nb; i++)
            {
                paramList.Enqueue(new BinTree("nil",null, null));
            }
            return list(paramList);
        }

        /**
         * Used in convertStrToBinTree method.
         * Seek the next opening parenthesis '(' from an indexPos into the string str
         */
        private static int getNextOpeningParenthesis(string str, int indexPos)
        {
            while(str[indexPos] != '(')
            {
                indexPos++;
            }
            return indexPos;
        }


        /**
         * Used in convertStrToBinTree method.
         * Seek the next closing parenthesis '(' forming a pair with an opening parenthesis at indexOpenP place into the string str
         */
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
