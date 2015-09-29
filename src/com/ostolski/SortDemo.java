package com.ostolski;

public class SortDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Erzeugen des Arrays
		int[] array = new int[100];
		
		//Fuettern des Arrays mit Randommzahlen
		for(int z = 0; z < array.length ;z++){
		array[z] = random();
		}
		//ausgabe(array);
		insertionSort(array);
		//ausgabe(array);
	
		
		}
	

	public static void ausgabe(int array[]){
		
		Integer item;
		System.out.println("");
		for (int i = 0; i < array.length; i++){
			   item = array[i];
			   System.out.println("Item " + i + " : " + item);
			}

	}
	
	public static int random(){
		
		int r = (int) (Math.random() *1000 -1);
		
		return r;
		
	}
	
	public static int[] insertionSort(int[] sortieren) {
		int temp;
		for (int i = 1; i < sortieren.length; i++) {
			temp = sortieren[i];
			int j = i;
			while (j > 0 && sortieren[j - 1] > temp) {
				sortieren[j] = sortieren[j - 1];
				j--;
			}
			sortieren[j] = temp;
			ausgabe(sortieren);
		}
		return sortieren;
	}

	public static int[] bubbleSort(int[] array){
		for (int t = 0;t < array.length; t++){
			for (int z = 0; z < array.length-1; z++){
				if (array[z] > array[z+1]){
					int tauschen = array[z];
					array[z]=array[z+1];
					array[z+1]=tauschen;
			}
			
		}
		
		}
		return array;
	}

}
