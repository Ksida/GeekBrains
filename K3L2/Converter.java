package K3L2;

public class Converter {

    public static int convert(String[][] arr) throws MyArrayDataException, MyArraySizeException {

        int summ = 0;

        if(arr.length != 4) throw new MyArraySizeException();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].length != 4) throw new MyArraySizeException();

            for (int j = 0; j < arr.length; j++){

                try{
                    summ += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return summ;
    }
}
