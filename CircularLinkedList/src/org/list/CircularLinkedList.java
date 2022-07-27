package org.list;

public class CircularLinkedList {
	static class Node 
	{ 
		int data; 
    		Node next; 
            	Node(int d) 
    		{ 
        			data = d; 
        			next = null; 
    		} 
}
Node head; 
CircularLinkedList()   
{ 
head = null; 
} 
	void sortedInsert(Node new_node) 
	{ 
    		Node current = head; 
if (current == null) 
    		{ 
        			new_node.next = new_node; 
        			head = new_node; 
		} 
else if (current.data >= new_node.data) 
    		{ 
while (current.next != head) 
            			current = current.next; 
		 	current.next = new_node; 
        			new_node.next = head; 
        			head = new_node; 
    		} 
    		else
    		{
while (current.next != head && current.next.data < new_node.data) 
            			current = current.next; 
			new_node.next = current.next; 
        			current.next = new_node; 
    		} 
}
void printList() 
	{ 
    		if (head != null) 
   		{ 
        			Node temp = head; 
        			do
       			{ 
            			System.out.print(temp.data + " "); 
            			temp = temp.next; 
        			}  while (temp != head); 
    		} 
	}
public static void main(String[] args) 
	{ 
    		CircularLinkedList li = new CircularLinkedList(); 
    		int arr[] = new int[] {19,72, 56, 12, 11, 5, 90}; 
    		Node temp = null; 
    		for (int i = 0; i < 7; i++) 
    		{ 
       			temp = new Node(arr[i]); 
        			li.sortedInsert(temp); 
        			
    		} 
li.printList(); 
	}		 

}
