public class verify_Roman {
    public void initializeRoman(String stringRoman)
    {
        char roman[] = {' ', 'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int valor[] = {0, 1, 5, 10, 50, 100, 500, 1000};
        int beforeNumber = 0;
        int sum = 0;
        char letter = ' ';

        for (int i = 0; i < stringRoman.length(); i++) {
            letter = stringRoman.charAt(i);
            for (int j = 0; j < roman.length; j++) {
                if (letter == roman[j]) {
                    sum = sum + valor[j];
                    if (beforeNumber < valor[j]) {
                        sum = sum - beforeNumber * 2;
                        beforeNumber = valor[j];
                    } else {
                        beforeNumber = valor[j];
                    }
                }
            }
        }
        System.out.print(sum);
    }

    public boolean checkEqualNumbers() {
        return true;
    }
}
