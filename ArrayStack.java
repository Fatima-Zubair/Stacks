//Stack follows LIFO(Last In First Out) principle
//Operations: 
//>peek--> return top element if exists
//>pop--> delete and return top element if exists
//>push-->insert new element on top
//>size-->return number of elements


public class ArrayStack implements stack{
    private Object[]a;
    private int size;

    public ArrayStack (int capacity){
        a=new Object[capacity];
    }
    public boolean isEmpty(){
        return size==0;
    }

   public Object peek(){
     if (size==0) throw new IllegalStateException("Stack is empty");
     return a[size-1];
   }
   public Object pop(){
    if (size==0) throw new IllegalStateException("Stack is empty");
    Object temp=a[--size];
    a[size]=null;
    return temp;
   }
   public void resize(){
       Object aa[]=a;
       a=new Object[2*aa.length];
       System.arraycopy(a, 0, aa, 0, size);
   }
    public void push(Object obj){
        if(size==a.length){
          resize();
        }
        a[size++]=obj;
    }
    public int size(){
        return size;
    }
    public void display(ArrayStack a1) {
        ArrayStack tempStack = new ArrayStack(a1.size()); 
        while (!a1.isEmpty()) {
            Object element = a1.pop(); // Get the top element from a1 stack
            System.out.println(element); // Print the element
           tempStack.push(element); // Push the element into tempStack
        }
    
        //Restore the elements back to the original stack (a1) from tempStack
        while (!tempStack.isEmpty()) {
            a1.push(tempStack.pop());
        }
    }
    public void MergeTo(ArrayStack a1, ArrayStack a2) {
        while (!a2.isEmpty()) {
            Object element = a2.pop();
            a1.push(element);
        }
    }
    public String toString() {
        StringBuilder array = new StringBuilder();
        for (int i = 0; i < size; i++) {
            array.append(a[i]);
            if (i < size - 1) {
                array.append(", "); 
            }
        }
        return array.toString();
    }
    public boolean equalsTo(ArrayStack a1, ArrayStack a2){
     
       if(a1.size()==a2.size()){
        for(int i=0; i<a1.size(); i++){
            if(!(a1.a[i].equals(a2.a[i]))){
            return false;
            }
        }
       return true;

       }
       return false;
    }
    public LLStack toLinkedStack(){
        LLStack llStack=new LLStack();
        for(int i=0; i<size; i++){
            llStack.push(a[i]);
        }
        return llStack;
    }
    public void removeBottomElement(){
        if (size == 0) {
            return;
        }
    
        for (int i = 0; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        a[size - 1] = null;

        size--;
    }
    public boolean search(Object obj){
        boolean found=false;
         for(int i=0; i<size; i++){
            if(a[i]==obj){
                found=true;
            }
         }
         return found;
    }
    
    public static void main(String[] args) {
        ArrayStack fruitcrate=new ArrayStack(10);
        fruitcrate.push("F1 orange");
         fruitcrate.push("F2 kiwi");
          fruitcrate.push("F3 chiku");
          fruitcrate.push("F4 papaya");
          System.out.println("FRUIT CRATE STACK");
         fruitcrate.display(fruitcrate);
           ArrayStack coldDrink=new ArrayStack(10);
           coldDrink.push("C1 pepsi");
           coldDrink.push("C2 sprite");
             coldDrink.push("C3 7up");
               coldDrink.push("C4 fanta");
                System.out.println("COLD DRINK STACK");
                coldDrink.display(coldDrink);

         fruitcrate.MergeTo(fruitcrate, coldDrink);
         System.out.println("Merged Stack");
           fruitcrate.display(fruitcrate);

           ArrayStack newStack=new ArrayStack(4);
           newStack.push("F1 orange");
         newStack.push("F2 kiwi");
          newStack.push("F3 chiku");
          newStack.push("F4 papaya");
  
          System.out.println(fruitcrate.toString());
        
           System.out.println(newStack.equalsTo(newStack,fruitcrate));
           
           System.out.println("To Linked Stack");
           fruitcrate.removeBottomElement();
           System.out.println(fruitcrate.toLinkedStack());
           System.out.println(fruitcrate.search("F2 kiwi"));
    }
}





 