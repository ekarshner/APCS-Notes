public class PersonApp{
    
    public static String randomName(String [] names){
	int len = names.length();
	int pos = (int)(Math.random() * len);
	return names[pos];
    }
    
    public static void main(String [] args){
	String [] fnames = {"Abe", "Becky", "Cal", "Charles", "Doris"};
	String [] lnames = {"Ali", "Bourbon", "Cullen", "Cocoros", "Dwyer"};
	
	Person p;
	for(int i = 0; i<10;i++){
	    String first = randomName(fnames);
	    String last = randomName(lnames);
	    int r = (int)(Math.random() * 3);
	    if (r==0)
		p = new Person(first,last);
	    else if (r ==1) {
		p = new Student(first,last);
		((Student)p).addCourse(3,4,0);
	    }
	    else{
		p = new Staff(first,last):
	    }
	    System.out.println(p);
	}
    }
}
