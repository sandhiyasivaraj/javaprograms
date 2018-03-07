class stack
{
int stack[];
int top;
int size;
stack()
{
size=10;
stack=new int[size];
top=-1;
}
}
public void push()
{
int no;
Scanner s=new Scanner(System.in);
no=s.nextInt();
if(top==size-1)
{
System.out.println("Overflow");
}
else
{
top++;
stack[top]=no;
}
}
public void pop()
{
if(top==-1)
{
System.out.println("Underflow");
}
else
{
System.out.println("element popped is %d",+stack[top]);
top--;
}
}
public void totalnum()
{
int count=0,i;
for(i=top;i>=0;i--)
{
count++;
}
System.out.println("total number is %d",+count);
}
public void topnum()
{
System.out.println("top number is %d",+stack[top]);
}
public void display()
{
int i;
for(i=top;i>=0;i--)
{
System.out.println("%d",+stack[i]);
}
}
public static void main(string d[])
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
