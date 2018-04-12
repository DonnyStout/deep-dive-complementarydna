package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    System.out.print(complement("ATATGCGC"));
  }


  public static String complement(String input) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'A') {
        stringBuilder.append('T');
      }
      if (input.charAt(i) == 'T') {
        stringBuilder.append('A');
      }
      if (input.charAt(i) == 'G') {
        stringBuilder.append('C');
      }
      if (input.charAt(i) == 'C') {
        stringBuilder.append('G');
      }
    }
    String output = stringBuilder.toString();
    return output;
  }

}
