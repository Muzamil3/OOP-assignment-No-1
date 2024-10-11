import java.time.LocalDateTime;
class Message
{
private String Reciever;
private String content;
private LocalDateTime timestamp;
private boolean seen;
private String messageid;
static int counter=0;
{
this.messageid=String.format("%03d",++counter);
} 
Message(String Reciever,String content,boolean seen)
{
this.Reciever=Reciever;
this.content=content;
this.seen=seen;
timestamp=LocalDateTime.now();
}
public String getReciever()
{
return Reciever;
}
public String getcontent()
{
return content;
}

public boolean getseen()
{
return seen;
}
public boolean isSeen()
{
this.seen=true;
return seen;
}


public String getmessageid()
{
return messageid;
}
public LocalDateTime gettimestamp()
{
return timestamp;
}
@Override
public String toString()
{
return "ID:"+messageid+
       ",Receiver:"+Reciever+
    ",Message:"+content+
    ",status:"+seen+
     ",Time"+gettimestamp();
}
}