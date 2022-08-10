package Quiz;

public class quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    char Alphabet = 'a';
    
    if( Alphabet == 'a' || Alphabet == 'e' || Alphabet == 'i' || Alphabet == 'o'|| Alphabet == 'u' ||
   	Alphabet == 'A' || Alphabet == 'E' || Alphabet == 'I' || Alphabet == 'O' || Alphabet == 'U') {
    System.out.println( Alphabet+ " is a Vowel");
    } else if ( Alphabet >= 'a' && Alphabet <= 'z'|| Alphabet >= 'A' && Alphabet <= 'Z') {
    System.out.println( Alphabet+ " is a Consonant");
	} else {
	System.out.println("Error");
	}
	}
}
