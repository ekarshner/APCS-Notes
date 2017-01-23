public class TextFormatter{
    private String line;
    public TextFormatter (String lineToFormat){
	line = lineToFormat;
    }
    
    private int findString (String str, int start){
	for(i = start; i < line.length(); i++){
	    if(line[i] = str && line[i+1] != str){
		return i;
	    }
	}
	return -1;
    }

    private int CountStrings (String str){
	//okay nothing
    }
    
    public String convertItalics () {
    }

}
