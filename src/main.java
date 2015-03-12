
public class main {
	
	public static void main(String[] args){
		
		int[] a = {6, 8, 2, 4, 1, 5, 0, 7, 9, 3};
		heapSort heapSort = new heapSort(a);
		
		
		
		
		for(int i = 0; i < a.length - 3; i++){
			System.out.println(heapSort.hasLeftChildren(i));
			heapSort.trickle(i);
		}
		
		heapSort.printArray();
		
	}

}
