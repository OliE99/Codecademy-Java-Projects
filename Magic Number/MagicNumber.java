public class Magic {
	public static void main(String[] args) {
    
        // Original number
        int myNumber = 9;
		
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        
        // Will print 3 to the console
        System.out.println(magicNumber);
	}
}