class Storedmsg
{

public void storemsg(MessageApp str)
{
for(int i=0;i<str.Contactlist.length;i++)
for(int j=0;j<10;j++)
{
str.message[i][j]=new Message(str.Contactlist[i],"Hi",false);
}
}
}