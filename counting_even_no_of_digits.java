public class counting_even_no_of_digits {
    public static void main(String[] args) {
        int[] arr = {12, 458, 475, 36985, 1245};

        System.out.println(count_even_numbers(arr));
    }

   
    public static int count_even_numbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (has_even_number_of_digits(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean has_even_number_of_digits(int num) {
        int count = count_digits(num);
        return count % 2 == 0;
    }


    public static int count_digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}

