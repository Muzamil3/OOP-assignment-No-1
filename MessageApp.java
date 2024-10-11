import java.util.Scanner;
class MessageApp
{
String[] Contactlist={"Ali","Mudasir"};
static int[] count={0,0};
Scanner sc=new Scanner(System.in);
Message message[][];
{
message=new Message[2][100];
}
public int getcontactindex(String contact)
{
for(int i=0;i<Contactlist.length;i++)
if(Contactlist[i].equalsIgnoreCase(contact))
{
return i;
}
return -1;
}
public void Sendmessage(String Contact, String content, boolean status)
{
int index=getcontactindex(Contact);
if(index!=-1)
{
message[index][count[index]]= new Message(Contact,content,status);
count[index]++;
System.out.println("Message sent");
}
else
{
System.out.println("Incorrect");
}
}
public void displayContact()
{
for(String temp:Contactlist)
System.out.println(temp);
}

public void addcontact()
{
System.out.println("Enter new contact name:");
String name=sc.next();
String[] newContactlist=new String[Contactlist.length+1];
int[] newcount=new int[count.length+1];
Message newmessage[][]=new Message[Contactlist.length+1][100];
for(int i=0;i<Contactlist.length;i++)
{
newContactlist[i]=Contactlist[i];
newcount[i]=count[i];
newmessage[i]=message[i];
}
newContactlist[newContactlist.length-1]=name;
newcount[count.length-1]=0;
Contactlist=newContactlist;
count=newcount;
message=newmessage;

System.out.println("Added succesfully");
}
public void deletecontact()
{
System.out.println("Enter contact name for delete:");
String name=sc.next();
int index=getcontactindex(name);
int j=0;
if(index!=-1)
{
String[] newContactlist=new String[Contactlist.length-1];
int[] newcount=new int[count.length-1];
Message newmessage[][]=new Message[Contactlist.length-1][100];
for(int i=0;i<Contactlist.length;i++)
{


if(i!=index)
{

newContactlist[j]=Contactlist[i];
newcount[j]=count[i];
newmessage[j]=message[i];
j++;
}
}
Contactlist=newContactlist;
count=newcount;
message=newmessage;
System.out.println("Delete successfully");
}
else 
{
System.out.println("Incorrect Contact");
}
}
public void Alldisplay()
{
for(int i=0;i<message.length;i++)
{
System.out.println("Message for:"+Contactlist[i]);

for(int j=0;j<10;j++)
{
if(message[i][j]!=null)
{
System.out.print("ID:"+message[i][j].getmessageid());
System.out.print("Content:"+message[i][j].getcontent());
System.out.print("Name:"+message[i][j].getReciever());
System.out.print("Time"+message[i][j].gettimestamp());
System.out.println("\n");
}
}
}
}
public void Specificdisplay(String name)
{

           
for(int i=0;i<message.length;i++)
{
if(Contactlist[i].equalsIgnoreCase(name))
{
System.out.println("Message for:"+Contactlist[i]);
for(int j=0;j<10;j++)
{
if(message[i][j]!=null)
{
 
System.out.print("ID:"+message[i][j].getmessageid());
System.out.print("Content:"+message[i][j].getcontent());
System.out.print("Name:"+message[i][j].getReciever());
System.out.print("Time"+message[i][j].gettimestamp());
System.out.print("Status"+message[i][j].isSeen());
System.out.println("\n");
}
}
}
}
}
public void checkStatus(String id)
{
for(int i=0;i<message.length;i++)
{
for(int j=0;j<10;j++)
{
if(message[i][j]!=null)
{
if(message[i][j].getmessageid().equals(id))
{
System.out.print("ID:"+message[i][j].getmessageid());
System.out.print("Content:"+message[i][j].getcontent());
System.out.print("Name:"+message[i][j].getReciever());
System.out.print("Time"+message[i][j].gettimestamp());
System.out.print("Status"+message[i][j].getseen());
System.out.println("\n");
}
}
}
}
}


}

