import java.util.Scanner;
public class Test3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
MessageApp mp=new MessageApp();
Storedmsg sm=new Storedmsg();
sm.storemsg(mp);

while(true)
{
System.out.println("Enter 0 for exit program\nEnter 1 for send message\nEnter 2 for display contact list\n Enter 3 for add contact\nEnter 4 for delete contact\nEnter 5 for All display\nEnter 6 Specific display\nEnter 7 for check message status");
System.out.println("Enter your choice:");
int ch=s.nextInt();
switch(ch)
{
case 0:
s.close();
return;
case 1:
System.out.println("Enter receiver name:");
String name= s.next();
System.out.print("Enter your content:");
String content=s.next();
mp.Sendmessage(name,content,false);
break;
case 2:
mp.displayContact();
break;
case 3:
mp.addcontact();
break;
case 4:
mp.deletecontact();
break;
case 5:
mp.Alldisplay();
break;
case 6:
System.out.println("Enter name to display message:");
String name1=s.next();
mp.Specificdisplay(name1);
break;
case 7:
System.out.println("Enter id to check  status:");
String id=s.next();
mp.checkStatus(id);
break;
}
}
}
}