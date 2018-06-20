public class BinaryGap {
    public int solution(int N) {
      int i = startingPoint(N);
      return findMaximumGap(N, Integer.toBinaryString(N).split("1"), i);
    }

  private int startingPoint(int N) {
    int i =0;
    if ( Integer.toBinaryString(N).startsWith("0")) {
      i++;
    }
    return i;
  }

  private int findMaximumGap(int N, String[] binariesArray, int i) {
    int max = 0;
    while (i< maximumLength(N, binariesArray)) {
      if (binariesArray[i].length() > max) {
        max = binariesArray[i].length();
      }
      i++;
    }
    ;
    return max;
  }

  private int maximumLength(int N, String[] binariesArray) {
    return Integer.toBinaryString(N).endsWith("1") ? binariesArray.length : binariesArray.length -1;
  }
}
