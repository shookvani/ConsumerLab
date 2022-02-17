
class Main {
  public static void main(String[] args) {
    // Activity 1: Call the sentimentVal method in Review with a word like "terrible" and print out the result
    Review x = new Review();

    String y= x.strongFakeReview("simpleReview.txt");
    System.out.println("Stronger: "+y);
    
  }
}