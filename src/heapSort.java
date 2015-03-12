
public class heapSort {
	
	public int[] a;

	public heapSort(int[] a){
		
		this.a = a;
		
		
	}
	
	public boolean hasLeftChildren(int index){
		
		return ((index*2 + 1) < a.length);
		
	}
	
	public boolean hasRightChildren(int index){
		
		return ((index*2 +2) < a.length);
		
	}
	
	public int getLeftIndex(int index){
		return 2*index + 1;
	}
	
	public int getRightIndex(int index){
		return 2*index + 2;
	}
	
	
	public void adjust(int index){
		
		while(hasLeftChildren(index)){
			//Probably need to put in an if statement....
			if(a[getLeftIndex(index)] > a[index]){
				//SWITCH THEM
				int leftIndexValue = a[getLeftIndex(index)];
				a[getLeftIndex(index)] = a[index];
				a[index] = leftIndexValue;
				index = getLeftIndex(index);
				adjust(index);
			}
			
			else if(a[getRightIndex(index)] > a[index]){
				//SWITCH THEM
				int rightIndexValue = a[getRightIndex(index)];
				a[getRightIndex(index)] = a[index];
				a[index] = rightIndexValue;
				index = getRightIndex(index);
				adjust(index);
			}
			
		}
	}
	
	public void printArray(){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
