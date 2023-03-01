package com.allendowney.thinkdast;

/**
 * @author downey
 */
public class ListNode<T> {
	public T data;
	public ListNode next;

    public ListNode() {
        this.data = null;
        this.next = null;
    }

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(T data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return "ListNode(" + data.toString() + ")";
    }

	public static void main(String[] args) {
		ListNode<Integer> primero = new ListNode<>(10);
		ListNode<Integer> segundo = new ListNode<>(20);
		ListNode<Integer> tercero = new ListNode<>(30);
		primero.next = segundo;
		segundo.next = tercero;

		System.out.println(primero.next.next);

        System.out.println("Recorrido de una lista");
        ListNode<Integer> aux = primero;
        while (aux != null) {
            System.out.println(aux);
            aux = aux.next;
        }

	}
}
