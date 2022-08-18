import java.util.Scanner;
public class Ocu1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String s=sc.next();
String pi="";
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(pi.indexOf(c)!=-1)
continue;
int k=getCount(s,c);
if(k>1)
System.out.println(c+"="+k);
pi+=c;
}
}
static int getCount(String s, char c)
{
String d=s.replace(c+"","");
return s.length()-d.length();
}
}

