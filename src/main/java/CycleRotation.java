public class CycleRotation {
  public int[] solution(int[] A, int K) {
    if (A.length == 0) {
      return A;
    }
    int numberOfRealRotation = K % (A.length);

    int startingIndexOfElementsToMove = A.length - numberOfRealRotation;
    int[] elementsToSave = saveElements(A, numberOfRealRotation);

    for (int i = 0, j = 0; i < A.length; i++) {

      if (i < numberOfRealRotation) {
        A[i] = A[startingIndexOfElementsToMove + i];
      }
      else {
        A[i] = elementsToSave[j];
        j++;
      }
    }
    return A;
  }

  private int[] saveElements(int[] A, int rotations) {
    int[] returnArray = new int[A.length - rotations];
    for (int i = 0; i < returnArray.length; i++) {
      returnArray[i] = A[i];
    }
    return returnArray;

  }

}
