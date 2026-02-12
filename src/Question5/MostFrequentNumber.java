package Question5;

public class MostFrequentNumber {

    public int mostFrequentNumber(int[] numbers){
        int frequnetNumber=numbers[0];
        int countForFrequentNumber=1;
        for (int number : numbers) {
            int count=1;
            for (int innerNumber : numbers) {
                if (innerNumber==number){
                    count++;
                }

            }
            if (countForFrequentNumber<count){
                frequnetNumber=number;
                countForFrequentNumber=count;
            }
        }
        return frequnetNumber;
    }
}
