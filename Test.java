import java.util.ArrayList;

public class Test{
  private ArrayList<Integer>numList;
  public Test(){
    for(int i = 0; i<10; i++){
      int i = (int)(Math.random()*10 + 1);
    }
  }
  public void printList(){
    for(int num: numList){
      System.out.print(num + " ");
    }
    System.out.println(); 
    System.out.println();
  }
  public int searchLargest(){
    int largest = numList.get(0);
    for(int num : numList){
      if(num > largest){
        largest = num;
      }
    }
  }

  public void searchAndReplace(int num){
    for(int i = 0; i < numList.size(); i++){
      if(numList.get(i) == num){
        numList.set(i, 1000);
      }
    }
  }
        
  public void searchAndRemove(int num){
    for(int i = numList.size() - 1; i >= 0, i--){
      if(numlist.get(i) == num){
        numList.remove(i);
      }
    }
  }
  public void sort(){
    for(int i = 0; i < numList.size() - 1; i++){
      for(int j = 0; j < numList.size() - 1 - i; j++){
        if(numList.get(j) > numList.get(j + 1)){
          int temp = numList.get(j);
          numList.get(j) = numList.get(j + 1);
          numList.get(j+1) = temp;
        }
      }
    }
  }
        
    
  
