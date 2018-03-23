import java.io.*;
import java.util.Scanner;

class node
	{
		int data;
		node next;
		node prev;
		node(int a)
		{
			data=a;
			next=null;
		}
	}
class linked 
	{
		public node head, temp,cur,cur1;
		/* Insert node or create linked list */
		void insertatfront() 
		{
			int value;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the value:");
			value=in.nextInt();
			node newnode=new node(value);
			newnode.next = null;
			if(head == null) 
			{
				head = temp =newnode;
			
			}
			else 
			{
				newnode.next=head;
				head.prev=newnode;
				head=newnode;
			}
		}
		void insertafter()
		{
			int value,value1;
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE DATA AFTER WHICH THE NEW NODE HAS TO BE INSERTED");
			value=in.nextInt();
			System.out.println("Enter the value:");
			value1=in.nextInt();
			node newnode=new node(value1);
			temp=head;
			while(temp.data!=value)
			temp=temp.next;
			cur=temp;
			cur1=temp.next;
			cur.next=newnode;
			newnode.prev=cur;
			cur1.prev=newnode;
			newnode.next=cur1;
		}

	//INSERT AT THE END
		void insertatend()
		{
			int value;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the value:");
			value=in.nextInt();
				node newnode=new node(value);
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
			newnode.next=null;
		}

	//INSER BEFORE A NODE
		void insertbefore()
		{
			int value,value1;
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE DATA AFTER WHICH THE NEW NODE HAS TO BE INSERTED");
			value=in.nextInt();
			System.out.println("Enter the value:");
			value1=in.nextInt();
			node newnode=new node(value1);
			temp=head;
			while(temp.data!=value)
			{
				temp=temp.next;
			}
			cur=temp.prev;
			cur.next=newnode;
			newnode.next=temp;
			newnode.prev=cur;
			temp.prev=newnode;		
		}
	
				

	/* Delete node from linked list */
		void delete() 
		{
			int value;
			temp=head;
			System.out.println("Enter the data to be deleted");
			Scanner in=new Scanner(System.in);
			value=in.nextInt();
			if(temp.data==value)
			{
				head=head.next;
				temp=null;
			}
			else
			{
				while(temp.data!=value)
				temp=temp.next;
				cur=temp.prev;
				cur1=temp.next;
				cur.next=cur1;
				cur1.prev=cur;
				temp=null;
			}
		}



		void display() 
		{
			temp = head;
			System.out.println("List of node:");
			while(temp != null) 
			{
				System.out.print(temp.data+" ");
				temp= temp.next;
			}
			System.out.print("\n");
		}

	//REVERSE DISPLAY
		void reversedisplay()
		{
			temp=head;
			while(temp.next!=null)
			temp=temp.next;
			while(temp.prev!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.prev;
			}
			System.out.print(temp.data+"\n");
		}

	}

			

class dll {
	public static void main(String args[ ]) 
		{
		int op;
		linked list = new linked();
		Scanner input = new Scanner(System.in);
		
		while(true) 
		{
		System.out.println("Enter your choice:");
		System.out.println("1. Insertatfront\n2.Insertafter\n3.Insertatend\n4.Insertbefore\n5.Delete\n6.Display\n7.Reversedisplay\n8.Exit");
			
			op =input.nextInt();
			switch(op) 
			{
				case 1: list.insertatfront();
					break;
				case 2: list.insertafter();
					break;
				case 3: list.insertatend();
					break;
				case 4: list.insertbefore();
					break;
				case 5:list.delete();
					break;
				case 6:	list.display();
					break;
				case 7: list.reversedisplay();
					break;

				case 8:	System.exit(0);
					break;


			}
		}
	}
}

