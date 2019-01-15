

public class DataItem {
	public String	subjectName; 	// data item: subject name as String
	public double 	grade; 			// data item: grade as double
	public DataItem next; 			// next DataItem in list

	// Constructor
	public DataItem(String subjectName, double grade)
	{
		this.subjectName = subjectName; // initialize data
		this.grade = grade;
		
		// 'next' is automatically
		// set to null
	} 

	// Override: toString method
	public String toString() {
		return ("{" + this.subjectName + ", " + this.grade + "} ");
	}
}
