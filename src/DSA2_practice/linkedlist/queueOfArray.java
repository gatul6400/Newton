package DSA2_practice.linkedlist;
class queue {
    static final int max = 1000;
    int rear = 0;
    int front = 0;
    int arr[] = new int[max];
}
class queueOfArray extends queue{
    int size;
    public queueOfArray(int size){
        this.size = size;
    }
    public void enqueue(int k){
        if(rear >= size){
            System.out.println("Queue Is Full");
        }
        else{
            arr[rear] = k;
            rear++;
        }
    }
    public void dequeue(){
        if(rear <= front){
            System.out.println("Queue if Empty");
        }
        else{
            front++;
        }
    }
    public void peek(){
        if(rear <= front){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(arr[front]);
        }
    }

    public static void main(String[] args) {
        queueOfArray que = new queueOfArray(5);
        que.enqueue(5);
//        que.enqueue(5);
//        que.enqueue(5);
//        que.enqueue(5);
//        que.enqueue(5);
//        que.enqueue(5);
        que.dequeue();
//        que.dequeue();
//        que.dequeue();
//        que.dequeue();
//        que.dequeue();
//        que.dequeue();
//        que.dequeue();
//        que.dequeue();
//        que.dequeue();
        que.enqueue(5);
        que.enqueue(5);
        que.enqueue(5);
        que.enqueue(5);
        que.enqueue(5);
        que.peek();
    }
}
