//create a new project where you iterate over an array of integers and update each position of this array by multiplying that value by the value of the next position. The last positicion must be multiplied by the first position of the array.
//Example
//input: [5, 4, 3, 2, 1]
//output: [20, 12, 6, 2, 5] // Explanation 5*4, 4*3, 3*2, 2*1, 1*5
//(editado)
//09:51
//in the same project create a method to invert an array
//Example
//input: [1, 2, 3, 4, 5]
//output: [5, 4, 3, 2, 1]

package clases;

class main1 {

    public static void main (String[] args) {

        int[] numList = {5, 4, 3, 2, 1};
        int first = numList[0];

        for (int i =0; i<numList.length; i++){
            if (i+1 == numList.length) {
                numList[i] = numList[i] * first;
            }
            else {
                numList[i] = numList[i] * numList[i + 1];
            }
        }

        for (int i =0; i<numList.length; i++) {
            System.out.println(numList[i]);
        }

        int [] arrayEx2 = {1,2,3,4,5};

        for (int i=arrayEx2.length-1; i >= 0 ; i--){
            System.out.println (arrayEx2[i]);
        }
    }

}

