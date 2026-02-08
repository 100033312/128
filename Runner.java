public class Runner{
  public static void main(String[] args){
    ArrayTest array = new ArrayTest(5); //instantiate with size of 5
    array.printArray();
    array.scramble();
    array.printArray();
    int index = array.search(0);
    System.out.println(index);
    array.sort();
    array.printArray();
