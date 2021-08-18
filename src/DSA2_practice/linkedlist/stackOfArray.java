package DSA2_practice.linkedlist;
class stack{
    static final int max = 100;
    int top = 0;
    int arr[] = new int[max];
}
class stackOfArray extends stack{
    int size;
    public stackOfArray(int size){
        this.size = size;
    }
    public void push(int k){
        if(top >= size - 1){
            System.out.println("Stack OverFlow");
        }
        else{
            top++;
            arr[top] = k;
        }
    }
    public void pop(){
        if(top < 0){
            System.out.println("Stack UnderFlow");
        }
        else{
            top--;
        }
    }
    public void peek(){
        if(top < 0){
            System.out.println("Stack is underFlow");
        }
        else{
            System.out.println(arr[top]);
        }
    }

    public static void main(String[] args) {
        stackOfArray stack = new stackOfArray(5);
        stack.push(5);
        stack.push(50);
        stack.push(500);
        stack.pop();
        stack.push(5000);
        stack.push(50000);
        stack.peek();
    }
}
