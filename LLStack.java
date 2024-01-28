
public class LLStack implements stack {
    private Node top;
    private int size;

    public boolean isEmpty(){
        return(size==0);
    }
    public Object peek(){
        if(size==0) throw new IllegalStateException("stack is empty");
        return top.data;
    }
    public Object pop(){
        if(size==0) throw new IllegalStateException("stack is empty");
        Object oldtop=top.data;
        top=top.next;
        --size;
        return oldtop;
    }
    public void push(Object obj){
        top=new Node(obj,top);
        size++;
    }
    public int size(){
        return size;
    }
    // public int Size(LLStack top){
    //     int count=0;
    //     for(Node p=top; p!=null; p=p.next){
    //         count++;
    //     }
    //     return count;
    // }
    public String toString() {
        StringBuilder ll = new StringBuilder();
        int counter=0;
        for (Node p=top; p!=null; p=p.next) {
            ll.append(p.data);
            counter++;
            if (counter < size ) {
                ll.append(", "); 
            }
        }
        return ll.toString();
    }
    public void display() {
        LLStack temp = new LLStack();
    
        while (!isEmpty()) {
            Object element = pop();
            System.out.println(element);
            temp.push(element);
        }System.out.println();

        while (!temp.isEmpty()) {
            push(temp.pop());
        }
    }
    public boolean equals(LLStack l1, LLStack l2){
        if(l1.size==l2.size){                       
            Node temp=l1.top;
            Node temp2=l2.top;
            
        while(temp!=null){
            if(!(temp.data.equals(temp2.data))){
              return false;
            }
            temp=temp.next;
             temp2=temp2.next;
        }
    
    return true;
    }
        return false;
    }

     public void removeBottomElement(){
        Node p=top;
        if(p==null){
            return;
        }
         while (p.next!=null) {

            p=p.next;
         }
         p.data=null;
         size--;
    }

   public ArrayStack toArrayStack(){
     ArrayStack arrayStack=new ArrayStack(size);
     Node p=this.top;
     Object arr[]=new Object[size];
     int i=0; 
     while(p!=null){
        arr[i]=p.data;
        i++;
        p=p.next;
     }
     for(int j=arr.length-1; j>=0; j--){
        arrayStack.push(arr[j]);
     }
     return arrayStack;
    }

    public boolean search(Object obj){
        boolean found =false;
        Node p=top;
        while(p!=null){
            if(p.data==obj){
                found=true;
                return found;
            }
            p=p.next;
        }
        return found;
    }
   private class Node{
    Object data;
    Node next;
    Node(Object data, Node next){
        this.data=data;
        this.next=next;
    }
}//end of node class
    public static void main(String[] args) {
        LLStack mystack=new LLStack();
        mystack.push(22);
        mystack.push(24);
        mystack.push(26);
        mystack.push(28);
        System.out.println(mystack.toString());
        LLStack mystack2=new LLStack();
        mystack2.push(22);
        mystack2.push(24);
        mystack2.push(26);
        mystack2.push(28);
        System.out.println(mystack.equals(mystack, mystack2));
        mystack.display();
        mystack.removeBottomElement();
        mystack.display();
        System.out.println("to array stack");
        System.out.println(mystack2.toArrayStack());
        System.out.println(mystack.search(28));
    }
}

