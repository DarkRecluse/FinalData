

public class TestSort {

	public static void main(String[] args) {
		CodeTime Time = new CodeTime();
		int numberRun = 10000;		
		int  ranDomNub [] = new int [numberRun];	
		
		BubbleSort bubble = new BubbleSort(numberRun);
		InsertionSort insertion = new InsertionSort(numberRun);
		SelectionSort selection = new SelectionSort(numberRun);
		
				
		//Random number
		for (int i = 0;i>ranDomNub.length;i++) {
			ranDomNub [i] = (int)(Math.random()*10000);
		}
		
		//Start all sort 
		
		for (int i = 0;i>numberRun;i++) {
			bubble.insert(ranDomNub[i]);
			insertion.insert(ranDomNub[i]);
			selection.insert(ranDomNub[i]);
		}
				
		Time.startTime();
		bubble.sort();
		Time.stopTime();
		System.out.println("Time for BubbleSort : " + Time.getActionTime());
		Time.resetTime();
		
		Time.startTime();
		insertion.sort();
		Time.stopTime();
		System.out.println("Time for InsertionSort : " + Time.getActionTime());
		Time.resetTime();
		
		Time.startTime();
		selection.sort();
		Time.stopTime();
		System.out.println("Time for SelectionSort : " + Time.getActionTime());
		Time.resetTime();
	
	}

}