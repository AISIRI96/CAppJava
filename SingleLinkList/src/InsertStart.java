

public class InsertStart {
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=next;
		}
		
	}
	public Node head=null;
	public Node tail=null;
	public  void  addStart(int data) 
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			
		}
		else
		{
			Node temp=head;
			head=newNode;
			head.next=temp;
			
		}
	}
	public void deleteFromList()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		else
		{
			if(head!=tail)
			{
				head=head.next;
			}
			else
			{
				head=tail=null;
			}
		}
	}
	public void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		System.out.println("Adding node to the start of the file");
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current=current.next;
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		InsertStart slist=new InsertStart();
		slist.addStart(1);
		slist.addStart(2);
		slist.display();
		slist.addStart(3);
		slist.display();
		slist.addStart(4);
		slist.display();
		slist.deleteFromList();
		slist.display();
	}
}
