package Important;

public class Solution {
	
	public static void main(String[] args) {
        int[] arr = {1, 5, 7, 6, 8, 5, 7, 6, 5, 7, 7, 5, 5, 7};
        print(arr, arr.length, 5, 7);


	}


    public static void print(int arr[], int n, int X, int Y) {

        // counters for X and Y

        int nx = 0, ny = 0;


        int result = -1;
        int count = 0;
        int resultCount = 0;

        for (int i = 0; i < n; i++) {

            // If value is equal to X increment counter of X

            if (arr[i] == X)

                nx++;


            // If value is equal to X increment counter of X

            if (arr[i] == Y)

                ny++;


            // If counters are equal(but not zero) save

            // the result as i

            if ((nx == ny) && (nx != 0 && ny != 0)) {
                count = nx;
                result = i;
            }

        }

        nx = 0;
        ny = 0;
        resultCount = count;
        count = 2 * count;
        int start = -1;
        for (int i = result; i >= 0; i--) {

            if (arr[i] == X) {
                count--;
                nx++;
            }

            if (arr[i] == Y) {
                count--;
                ny++;
            }

            if (nx == ny)
                start = i;

            if (count == 0)
                break;

        }

        System.out.println("s : " + start + " end " + result + " total count : " + resultCount);


    }
}
