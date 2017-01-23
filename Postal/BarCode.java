public class BarCode implements Comparable<BarCode>{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
   public BarCode(String zip) {
       if((zip.length() = 5) && (text.matches("[0-9]+"))) return true;
       else return false;
   }

// postcondition: Creates a copy of a bar code.
   public BarCode(BarCode x){}


//post: computes and returns the check sum for _zip
   private int checkSum(){
       int total = 0;
       for(int i = 0; i < 5; i++){
	   total += _zip.substring(i, i+1);
       }
       return total;
   }

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
   public String toString(){}



   public boolean equals(Object other){}

// postcondition: compares the zip + checkdigit 
//  ex 084518 < 193418 true
//     084528 > 000000 true
   public int compareTo(BarCode other){}




}
