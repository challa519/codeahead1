package com.challa.codeahead1.array;

import java.util.Arrays;

public class MaxHeap {
    int[] heap;
    int size;

    public MaxHeap(int[] heap) {
        this.size = heap.length;
        this.heap = Arrays.copyOf(heap, size);
    }
    public void maxHeapify(int index) {
        int largest = index;
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        if (leftIndex < size && heap[index] < heap[leftIndex]) {
            largest = leftIndex;
        }
        if (rightIndex < size && heap[largest] < heap[rightIndex]) {
            largest = rightIndex;
        }

        if (largest != index) {
            swap(index, largest);
            maxHeapify(largest);
        }
    }
    private void swap(int firstIndex, int secondIndex) {
        int temp = heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = temp;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
    // what is the max substring is Palindrome
   
 }
