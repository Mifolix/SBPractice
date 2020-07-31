package Date_30_07_2020;

import java.util.Scanner;

public class List {
    public static void main(String[] args) throws EntryException {
        Scanner in = new Scanner(System.in);
        LList ll = new LList();
        int nu = 0;
        while (nu != 5) {
            System.out.println("Выберите действие: " +
                    "\n1 - Добавить элемент списка" +
                    "\n2 - Вывод элемента списка" +
                    "\n3 - Вывод всех элементов списка" +
                    "\n4 - Вывод количества позиций в списке" +
                    "\n5 - Выход");
            nu = in.nextInt();
            switch (nu) {
                case 1:
                    System.out.println("Введите элемент списка:");
                    String element = in.next();
                    ll.add(element);
                    break;
                case 2:
                    System.out.println("Выберите какой элемент списка вывести");
                    int Conclusion = in.nextInt();
                    if (Conclusion <= 0) {
                        throw new EntryException("Выход за границы списка");
                    }
                    System.out.println(ll.get(Conclusion));
                    break;
                case 3:
                    int Conclusions = ll.size();
                    for (int i = 1; i <= Conclusions; i++) {
                        System.out.println(ll.get(i));
                    }
                    break;
                case 4:
                    int cout = ll.size();
                    System.out.println("Всего элементов = " + cout);
                    break;
                case 5:
                    break;
            }

        }
    }
}

class Node {
    Object data;
    Node next;

    public Node(Object item){
        this.data=item;
    }
}

class LList {
    private Node root;

    public void add(Object obj) {
        if (obj == null)
            return;
        Node node = new Node(obj);
        Node last = findLast();

        if (last == null) {
            root = node;
        } else {
            last.next = node;
        }
    }

    public int size() {
        if (root == null)
            return 0;

        int count = 1;
        Node currentNode = root;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            count++;
        }
        return count;
    }

    public Object get(int id) {
        try {
            Node Value = root;
            for (int i = 0; i < id - 1; i++) {
                Value = Value.next;
            }
            return Value.data;
        } catch (NullPointerException e){
            return "Этого элемента не существует";
        }
    }

    private Node findLast() {
        if (root == null)
            return null;
        else {
            Node currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode;
        }
    }
}