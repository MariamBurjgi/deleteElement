package com.hmcoding.eraseelement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class LinkedList {
        private Node head;

        private class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value=value;
                this.next=null;
            }
        }
        public LinkedList() {
            this.head = null;
        }
        public void add(int value) {
            Node newNode=new Node(value);
            newNode.next=this.head;
            this.head=newNode;
        }
        public void delete(Node nodeToDelete) {
            if (nodeToDelete==null) {
                return;
            }

            nodeToDelete.value=nodeToDelete.next.value;
            nodeToDelete.next=nodeToDelete.next.next;
        }
    }
}