public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack(){
    //PRE:
    //POS:
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element){
    //PRE:
    //POS:
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }

  public char pop (){
    //PRE:
    //POS:
    //TAS: remove and return the item on the top of the stack
    char popped = s[top];
    top--;
    return popped;
  }
  
  public char peek(){
    return s[top];
  }
  
  public String toString(){
    String str = "";
    for(int i = top+1; i > -1; i--){
      char x = s[i];
      str += Character.toString(x);
    }
    return str;
  }

  public boolean isEmpty(){
    //PRE:
    //POS:
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
    if(top == -1)
      return true;
    else
      return false;
  }

  public boolean isFull(){
    //PRE:
    //POS:
    //TAS: return whether or not the stack is full
    return top == MAX_CAP-1;
  }
}
