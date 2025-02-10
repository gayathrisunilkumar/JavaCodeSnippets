public class Sort {
    public static void main(String[] args) {
        int[] array = {6,4,5,9,8,112,100,343};
        int arrLen = array.length;

        //using 2 loops
        /* for(int i=0;i< arrLen-1;i++) {
            for(int j=0; j<arrLen-i-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }
            }
        } */

        //using single loop
        int start = 0;
        int end = array.length;
        while (start<end) {
            for(int i=start;i<end-1;i++) {
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i]= array[i+1];
                    array[i+1] = temp;
                }
            }
        start++;
        end--;
        }

        for(int i=0;i<arrLen;i++){
            System.out.println(array[i]);
        }

    }
}
