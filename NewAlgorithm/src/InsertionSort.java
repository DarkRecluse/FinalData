
public class InsertionSort {
	private int [] element;
	private int eSize;
	
	public InsertionSort(int size) {
		if(size > 0)
			this.element = new int[size];
		else
			// default element.length == 10
			this.element = new int[10];
		
		eSize = 0;
	}
	
	public void insert(int e) {
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void sort() {
		int out, in, temp;
		
		for(out = 1; out < eSize; out++) {
			temp = this.element[out];
			for(in = out; in > 0 && this.element[in-1] >= temp; in--) {
				this.element[in] = this.element[in - 1];
			}
			this.element[in] = temp;
		}
	}
	
	/*private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}*/
}