public class ArrayTest{
  private int[] numArray;

  public ArrayTest(int size){
    numArray = new int[size];
    for(int i = 0; i<numArray.length; i++){
      numArray[i] = (int)(Math.random()*5);
    }
  }
  public void printArray(){
    for(int num: numArray){
      System.out.print(num + " ");
    }
    System.out.println();
    System.out.println();
  }
  public int search(int searchNum){
    for(int i = 0; i < numArray.length; i++){
      if(numArray[i] == searchNum){
        return i;
      }
    }
    return -1;
  }
  public void scramble(){
    for(int i = numArray.length -1; i> 0, i--){
      int j = (int)(Math.random()* (i+1));

      int temp = numArray[i];
      numArray[i] = numArray[j];
      numArray[j] = temp;
    }
  }
  public void sort(){
    for(int i = 0; i<numArray.length()-1; i++){ //if an array has n elemenents it needs at least n-1 passes, this outer loop controls passes
      for(int j = 0; j<numArray.length()-1-i; j++){
        if(numArray[j] > numArray[j+1]){
          int temp = numArray[j];
          numArray[j] = numArray[j+1];
          numArray[j+1] = temp;
        }
      }
    }
  }




