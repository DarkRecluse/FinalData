

public class TestSort {

	public static void main(String[] args) {
		long endTime = 0;
		long startTime = 0;
		long sumBubble = 0;
		long sumSelection = 0;
		long sumInsertion = 0;
		int numberRun = 4000;		
		int  ranDomNub [] = new int [numberRun];	
		
		BubbleSort bubble = new BubbleSort(numberRun);
		InsertionSort insertion = new InsertionSort(numberRun);
		SelectionSort selection = new SelectionSort(numberRun);
		
		
		for (int i = 0; i < ranDomNub.length; i++) {
			ranDomNub[i] = (int) (Math.random() * 10000);
			bubble.insert(ranDomNub[i]);
			insertion.insert(ranDomNub[i]);
			selection.insert(ranDomNub[i]);
		}

		
		for(int i = 0;i<100;i++) {
		startTime = System.nanoTime();
		bubble.sort();
		endTime = System.nanoTime();
		sumBubble = sumBubble + (endTime - startTime);
			
		startTime = System.nanoTime();
		insertion.sort();
		endTime = System.nanoTime();
		sumInsertion = sumInsertion + (endTime - startTime);
		
		
			
		startTime = System.nanoTime();
		selection.sort();// sorting array elements using bubble sort
		endTime = System.nanoTime();		
		sumSelection = sumSelection + (endTime - startTime);
		
		
		
		
		}
		System.out.println("Time After Bubble Sort : " + (sumBubble / 100) + " ns");
		System.out.println("Time After Insertion Sort : " + (sumInsertion / 100) + " ns");
		System.out.println("Time Selection Sort : " + (sumSelection / 100) + " ns");
		
		
	}
}