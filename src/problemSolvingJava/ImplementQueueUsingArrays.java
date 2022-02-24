package problemSolvingJava;

public class ImplementQueueUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x){
		if(rear==100005)
			return;
		arr[rear++] = x;
	} 

    //Function to pop an element from queue and return that element.
	int pop(){
		if(front==rear)
			return -1;
		return arr[front++];
	} 
}