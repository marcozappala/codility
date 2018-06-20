public class FrogJmp {
    public int solution(int X, int Y, int D) {
      int totalDistance = Y-X;
      if (totalDistance % D == 0 ) {
        return ((Y-X) / D) ;
      }
      return ((Y-X) / D) +1;

    }
}
