public class TestRunner{
  public static void main(String[] args){
    Test test = new Test();
    test.printList();
    int largest = test.searchIndex();
    System.out.println(largest);
    test.searchAndReplace(5);
    test.printList();
    test.searchAndRemove(2);
    test.printList();
    test.sort();
    test.printList();
    
