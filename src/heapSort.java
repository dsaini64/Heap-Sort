
public class heapSort {
    
    public int[] a;

    public heapSort(int[] a){
        
        this.a = a;
        
        
    }
    
    public boolean hasLeftChildren(int index, int length){
        
        return ((index*2 + 1) < length);
        
    }
    
    public boolean hasRightChildren(int index, int length){
        
        return ((index*2 +2) < length);
        
    }
    
    public int getLeftIndex(int index){
        return 2*index + 1;
    }
    
    public int getRightIndex(int index){
        return 2*index + 2;
    }
    
    
    public void adjust(int index, int length){
    
    
        while(hasRightChildren(index, length)){
            //Probably need to put in an if statement....
            
            if(a[getLeftIndex(index)] > a[index]){
                if(a[getRightIndex(index)] > a[getLeftIndex(index)]) {
                    //SWITCH THEM
                    int rightIndexValue = a[getRightIndex(index)];
                    a[getRightIndex(index)] = a[index];
                    a[index] = rightIndexValue;
                    index = getRightIndex(index);
                    
                } else {
                    //SWITCH THEM
                    int leftIndexValue = a[getLeftIndex(index)];
                    a[getLeftIndex(index)] = a[index];
                    a[index] = leftIndexValue;
                    index = getLeftIndex(index);
                }
            }
            
            else if(a[getRightIndex(index)] > a[index]){
                //SWITCH THEM
                int rightIndexValue = a[getRightIndex(index)];
                a[getRightIndex(index)] = a[index];
                a[index] = rightIndexValue;
                index = getRightIndex(index);
            }
            
            else{
                return;
            }
            
        }
        
        if(hasLeftChildren(index, length)){
        
              if(a[getLeftIndex(index)] > a[index]){
                    
                    //SWITCH THEM
                    int leftIndexValue = a[getLeftIndex(index)];
                    a[getLeftIndex(index)] = a[index];
                    a[index] = leftIndexValue;
                    index = getLeftIndex(index);
                } 
        }
    }
    
    
    public void buildHeap(){
    
        for(int i = a.length; i > -1; i--){
            adjust(i, a.length);
        }
            
    }
    
    public void sortHeap(){
    	
    	//move the very first element into the very last element(swap)
    	
    	for(int i = 1; i < a.length; i++){
    		
    		int firstIndexValue = a[0];
        	a[0]  = a[a.length - i];
        	a[a.length - i] = firstIndexValue;
        	
        	//trickle the very first element
        	adjust(0, a.length - i);
        	
        	//repeat!
    		
    	}
    	
    	
    	
    }
    
    public void printArray(){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
    
