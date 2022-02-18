package school.lesson6;

public class Method {
    static int method (String[][] array) throws MyArraySizeException, MyArrayDataException {
        if(array.length == 4 && array[0].length == 4 && array[1].length == 4 && array[2].length == 4 && array[3].length == 4) {
            System.out.println("Передан подхдящий массив");
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                   try {
                        sum = sum + Integer.parseInt(array[i][j]);
                   } catch (NumberFormatException e) {
                       throw new MyArrayDataException(i, j);
                   }
                }
            } return sum;
        } else {
            throw new MyArraySizeException();
        }
    }
}
