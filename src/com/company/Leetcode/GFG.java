package com.company.Leetcode;

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/

/*Input:
        2
        3
        1 3 4
        3
        4
        1 5 2 9
        2

        Output:
        1 3
        1 2 9
        */
class Node
{
	int data;
	Node next;

	Node(int d)
	{
		data = d;
		next = null;
	}
}
/*You are required to complete below method*/
public class GFG
{
    Node deleteNode(Node head, int x)
    {

        // Your code here
        return head;
    }
}
