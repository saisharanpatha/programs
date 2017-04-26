public class Encode
{
  public static void main(String[] s)
  {
    String a="code";
    String b="kata";
    int i=0;
int sp;
for(i=0;i<a.length();i++)
    {
		
		 sp=(int)a.charAt(i);
		sp=sp+10;
		char c=(char)sp;
		
		System.out.print(c);
		
		
	}
	 System.out.print(" k");
	for(i=1;i<b.length()-1;i++)
    {
		char c;
		 sp=(int)b.charAt(i);
		sp=sp+10;
		if(sp<=122){
		 c=(char)sp;
		}
		else{
			sp=(sp-122)+96;
			 c=(char)sp;
		}
		
		System.out.print(c);
		
		
	}
	System.out.print("a");
   
  }
}