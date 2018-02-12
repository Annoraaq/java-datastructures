package JavaDatastructures;

public class MinHeap {
  private int[] heap;
  private int last;

  public MinHeap() {
    heap = new int[1024];
    last = 0;
  }

  public void insert(int data) {
    heap[last] = data;
    bubbleUp();
    last++;
  }

  public int getMin() {
    return heap[0];
  }

  public void dropMin() {
    if (last == 1) {
      heap[last] = -1;
      last = 0;
    } else if (last > 1) {
      heap[0] = heap[last-1];
      last--;
      bubbleDown();
    }
  }
  private void bubbleDown() {
    int pos = 0;
    while (pos < last) {
      int leftPos = pos*2+1;
      int rightPos = pos*2+2;
      int left = heap[leftPos];
      int right = heap[rightPos];

      if (leftPos > size()-1) {
        break; 
      }

      if ((rightPos > size()-1) || left < right) {
        // swap with left child
        if (left < heap[pos]) {
          swap(pos, leftPos);
          pos = leftPos;
        } else {
          break;
        }
      } else {
        // swap with right child
        if (right < heap[pos]) {
          swap(pos, rightPos);
          pos = rightPos;
        } else {
          break;
        }
      }

    }
  }

  private void bubbleUp() {
    int pos = last;
    while (pos > 0) {
      if (heap[parent(pos)] > heap[pos] ) {
        swap(pos, parent(pos));
        pos = parent(pos);
      } else {
        break;
      }
    }
  }


  private int parent(int pos) {
    if (pos <= 0) return -1;
    return (pos+1)/2-1;
  }

  public int size() {
    return last;
  }

  private void swap(int pos1, int pos2) {
    int temp = heap[pos1];
    heap[pos1] = heap[pos2];
    heap[pos2] = temp;
  }
}
