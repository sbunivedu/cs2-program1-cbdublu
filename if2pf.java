import java.util.Scanner; //To read the expression in

public class if2pf
{
        public static void main (String [] args)
        {
                //Read in the expression
                CharStack s = new CharStack();
                Scanner scan = new Scanner(System.in);

                System.out.print("Enter expression: ");
                String inFix = scan.nextLine();
                String postFix = "";
                char current = ' ';

                //Does the thing
                for (int i = 0; i < inFix.length(); i++) {
                        current = inFix.charAt(i);
                        if (isParen(current))
                        {
                                if (current == '(')
                                        s.push(current);
                                if(current == ')')
                                        while (!s.isEmpty()&&s.peek()!='(') {
                                                char  x = s.pop();
                                                if (x == '(')
                                                        break;
                                                else
                                                        postFix += x;
                                        }

                        }
                        if (isOperator(current))
                        {
                                if (current == '*'||current =='/')
                                        s.push(current);
                                if (current == '+'||current == '-')
                                                s.push(current);


                        }//isOperator

                        if (isOperand(current))
                                postFix=postFix+current;
                }//for loop


                while (!s.isEmpty()) {
                        char  x = s.pop();
                        if (x != '(')
                                postFix += x + " ";
                }

                //Print the postfix expression
                System.out.println("Converted to postfix: "+postFix);

        }//main

        private static boolean isParen(char c)
        {
                if ((c == '(') || (c == ')'));
                                return true;
        }//isParen

        private static boolean isOperator(char c)
        {
        return (c=='+')||(c=='-')||(c=='*')||(c=='/');
        }//isOperator

        private static boolean isOperand(char c)
        {
        return (c >= 'a')&&(c <='z')||(c >= 'A')&&(c <='Z')||(c>='0')&&(c<='9'); //isOperand
        }

        private static boolean higherPrec(char a, char b)
        {
        return ((a=='*')||(a=='/'))&&((b=='+')||(b=='-'));
        }//higherPrec
}