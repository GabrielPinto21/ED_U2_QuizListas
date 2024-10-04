/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.unidad2.quiz;

/**
 *
 * @author Boris Perez
 */
public class MyDoubleLinkedList<E> {

    private Node<E> head;
    private Node<E> prev;
    private int size;

    public void add(E val) {
        Node<E> n = new Node<>();
        n.setData(val);
        if (head == null) {
            head = n;
        } else {
            Node<E> p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(n);
            n.setPrev(p);
            size++;
        }
    }

    public void print() {
        Node<E> p = head;
        while (p != null) {
            System.out.println(p.getData());
            p = p.getNext();
        }
    }

    public void delete(E val) {
        Node<E> p = head;
        while (p != null) {
            if (p.getData().equals(val)) {
                if (p == head) {
                    head = p.getNext();
                    head.setPrev(null);
                    size--;
                } else if (p.getNext() == null) {
                    Node<E> a = p.getPrev();
                    a.setNext(null);
                    size--;
                } else {

                    Node<E> siguiente = p.getNext();
                    Node<E> anterior = p.getPrev();
                    anterior.setNext(siguiente);
                    siguiente.setPrev(anterior);
                    size--;
                }
            }
            p = p.getNext();
        }
    }

    public void reversePrint() {
        Node<E> p = head;
        while (p.getNext() != null) {
            p = p.getNext();
        }

        while (p != null) {
            System.out.println(p.getData());
            p = p.getPrev();
        }

    }

}
