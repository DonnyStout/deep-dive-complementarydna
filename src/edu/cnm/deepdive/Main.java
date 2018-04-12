package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    System.out.print(complement("satfg"));
  }


  public static String complement(String input) {
    String changer = input.toUpperCase();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      if (changer.charAt(i) == 'A') {
        stringBuilder.append('T');
      }
      if (changer.charAt(i) == 'B') {
        stringBuilder.append('B');
      }
      if (changer.charAt(i) == 'C') {
        stringBuilder.append('G');
      }
      if (changer.charAt(i) == 'D') {
        stringBuilder.append('D');
      }
      if (changer.charAt(i) == 'E') {
        stringBuilder.append('E');
      }
      if (changer.charAt(i) == 'F') {
        stringBuilder.append('F');
      }
      if (changer.charAt(i) == 'G') {
        stringBuilder.append('C');
      }
      if (changer.charAt(i) == 'H') {
        stringBuilder.append('H');
      }
      if (changer.charAt(i) == 'I') {
        stringBuilder.append('I');
      }
      if (changer.charAt(i) == 'J') {
        stringBuilder.append('J');
      }
      if (changer.charAt(i) == 'K') {
        stringBuilder.append('K');
      }
      if (changer.charAt(i) == 'L') {
        stringBuilder.append('L');
      }
      if (changer.charAt(i) == 'M') {
        stringBuilder.append('M');
      }
      if (changer.charAt(i) == 'N') {
        stringBuilder.append('N');
      }
      if (changer.charAt(i) == 'O') {
        stringBuilder.append('O');
      }
      if (changer.charAt(i) == 'P') {
        stringBuilder.append('P');
      }
      if (changer.charAt(i) == 'Q') {
        stringBuilder.append('Q');
      }
      if (changer.charAt(i) == 'R') {
        stringBuilder.append('R');
      }
      if (changer.charAt(i) == 'S') {
        stringBuilder.append('S');
      }
      if (changer.charAt(i) == 'T') {
        stringBuilder.append('A');
      }
      if (changer.charAt(i) == 'U') {
        stringBuilder.append('U');
      }
      if (changer.charAt(i) == 'V') {
        stringBuilder.append('V');
      }
      if (changer.charAt(i) == 'W') {
        stringBuilder.append('W');
      }
      if (changer.charAt(i) == 'X') {
        stringBuilder.append('X');
      }
      if (changer.charAt(i) == 'Y') {
        stringBuilder.append('Y');
      }
      if (changer.charAt(i) == 'Z') {
        stringBuilder.append('Z');
      }
    }
    String output = stringBuilder.toString();
    return output;
  }

}
