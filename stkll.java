class Node
{
int data;
node next;
node(int x)
{
data=x;
next=NULL;
}
}
class Stack{
node top,temp;
public void push()
{
int no;
Scanner s=new Scanner(System.in);
no=s.nextInt();
node newnode=new node(no);
newnode.next=top;
top=newnode;
count++;
}
public void pop()
{
if(top==NULL)
{
System.out.println("STACK UNDERFLOW");
}
else
{
temp=top;
top=temp.next;
System.out.println("POPPED ELEMENT IS %d",temp.data);
free(temp);
count--;
}
}
public void topnum()
{
System.out.println("The top most element is %d",top.data);
}
public void totalnodes()
{
temp=top;
int count=0;
while(temp!=NULL)
{
count++;
temp=temp-.next;
}
System.out.println("No of node/s are/is %d",+count);
}
public void display()
{
temp=top;
while(temp!=NULL)
{
System.out.println(temp.data);
temp=temp.next;
}
}
public static void main(string arg[])
{
int ch;
Scanner in=new scanner(System.in);
stack x=new stack;
while(1)
{
System.out.println("\n1.Push\t2.Pop\t3.Topnum\t4.Totalnum\t5.Display\t6.Exit\n");
ch=in.nextInt();
switch(ch)
{
case 1:x.push();break;
case 2:x.pop();break;
case 3:x.topnum();break;
case 4:x.totalnum();break;
case 5:x.display();break;
case 6:System.exit();
}
}
}
}
