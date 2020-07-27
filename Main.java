class Main {
  public static void main(String[] args) {
    
    //This is a comment


    int count = 0;


    for(int x = 1; x < 10; x++){

      if(x % 3 == 0 || x % 5 ==0){
        
        count = count + x;
      }
    }

    System.out.println("The sum of all integers below 1000 is " + count);



  }
}