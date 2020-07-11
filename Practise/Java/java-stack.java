import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character> s=new Stack<>();
            for(int i=0;i<input.length();i++){
                char c=input.charAt(i);
                if(c=='{' || c=='(' || c=='[')
                    s.push(c);
                else if(c=='}')
                    if(!s.isEmpty() && s.peek()=='{')
                        s.pop();
                    else
                        s.push(c);
                else if(c==')')
                    if(!s.isEmpty() && s.peek()=='(')
                        s.pop();
                    else
                        s.push(c);
                else if(c==']')
                    if(!s.isEmpty() && s.peek()=='[')
                        s.pop();
                    else
                        s.push(c);

            }
            System.out.println((s.isEmpty()) ? "true": "false" );
		}
		
	}
}



