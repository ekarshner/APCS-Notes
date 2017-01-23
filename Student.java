public class Student extends Person{
    private static int lastIDAssigned = 20030;
    private String _gpa;
    private double _numberOfCredits;

    public Student (String first, String last){
	super(first, last);
	_studentID = "" + lastIDAssigned;
	
