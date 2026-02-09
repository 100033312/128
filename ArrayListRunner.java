import  java.util.ArrayList;


public class ArrayListRunner{
	public static void main(String args[]){
		//What do you have to import to use ArrayList? the ArrayList interface
		
		//What do you think the ? in ArrayList< ? > represents? it tells ArrayList what kind of objects it will hold
		ArrayList<Song> songList1 = new ArrayList<Song>();
		
		//What do you think the method add() does? it adds a song to the list
		songList1.add(new Song("John", "Happy"));
		songList1.add(new Song("Jose", "Hello"));
		
		//What do you think the method get() does? it returns the information stored at the index
		//What method gets called by default when you don't use getName() ? it returns the tostring 
		System.out.println();
		System.out.println( songList1.get(0).getName() );
		System.out.println( songList1.get(1).getName() );
		System.out.println( songList1.get(0) );
		System.out.println( songList1.get(1) );
		
		//What do you think the method set() does? replaces the song at index 1 with the information 
		System.out.println();
		songList1.set(1, new Song("Jen", "Happy Days") );
		System.out.println( songList1.get(1) );

    ArrayList<Song> songList2 = new ArrayList<Song>();
    songList2.add(new Song("Mary", "Sad"));
    songList2.add(new Song("Will", "Happy"));
    songList2.add(new Song("Lucas", "Bored"));

    System.out.println();
    System.out.println( songList2.get(0) );
    System.out.println( songList2.get(2) );


	}
}
