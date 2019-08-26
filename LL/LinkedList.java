package LL;

public class LinkedList {
	Node head;
	public void insert(int data) 
	{
		Node node =new Node();
		node.data = data;
		node.next = null;
		if(head == null)
			head = node;
		else
		{
			Node n =head;
			while(n.next!=null)
				n=n.next;
			n.next = node;
		}
	}
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	public void insertAt(int index,int data)
	{
		if(index == 0)
		{
			System.out.println("Index starts from 1");
		}
		else if(index==1)
		{
			insertAtStart(data);
		}
		else 
		{
			Node node = new Node();
			node.data = data;
			node.next = null;
			Node n = head;
			for(int i = 1;i<=index-2;i++)
				n=n.next;
			node.next = n.next;
			n.next=node;
		}
	}
	public void deleteAt(int index)
	{
		if(index==0)
			head = head.next;
		else
		{
			Node n =head;
			Node n1 = null;
			for(int i = 1;i<index;i++)
				n = n.next;
			n1 = n.next;
			n.next = n1.next;
			System.out.println(n1.data+"element deleted");
		}
	}
	public void show()
	{
		Node node = new Node();
		node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
