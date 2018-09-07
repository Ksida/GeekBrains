package K3L2;

public class Main {

    public static void main(String[] args) {

        String[][] arrayWrongSize = new String[2][2];

        arrayWrongSize[0][0] = "J";
        arrayWrongSize[0][1] = "A";
        arrayWrongSize[1][0] = "V";
        arrayWrongSize[1][1] = "A";

        try{

            System.out.println(Converter.convert(arrayWrongSize));

        }catch (MyArraySizeException e){

            e.printStackTrace();

        }catch (MyArrayDataException e){

            e.printStackTrace();
        }

        String[][] arrayWrongData = {

                {"1", "2", "3", "4"},
                {"J", "A", "V", "A"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try{

            System.out.println(Converter.convert(arrayWrongData));

        }catch (MyArraySizeException e){

            e.printStackTrace();

        }catch (MyArrayDataException e){

            e.printStackTrace();
        }

        String[][] arrayCorrect = {

                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try{

            System.out.println(Converter.convert(arrayCorrect));

        }catch (MyArraySizeException e){

            e.printStackTrace();

        }catch (MyArrayDataException e){

            e.printStackTrace();
        }
    }
}
