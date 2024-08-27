
        public class Main {
            public static void main(String[] args) {
                String[][] validArray = {
                        {"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };

                String[][] invalidArray = {
                        {"1", "2", "3", "4"},
                        {"5", "six", "7", "8"}, // здесь ошибка
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };

                // Вызываем метод суммирования и обработки массива
                try {
                    int sum = processArray(validArray);
                    System.out.println("Сумма элементов массива: " + sum);
                } catch (MyArraySizeException | MyArrayDataException e) {
                    System.err.println(e.getMessage());
                }

                // Пример с массивом с ошибками в данных
                try {
                    int sum = processArray(invalidArray);
                    System.out.println("Сумма элементов массива: " + sum);
                } catch (MyArraySizeException | MyArrayDataException e) {
                    System.err.println(e.getMessage()); // здесь будет ошибка
                }
            }

            public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
                if (array.length != 4 || array[0].length != 4) {
                    throw new MyArraySizeException("Размер массива должен быть 4х4");
                }

                int sum = 0;

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        try {
                            sum += Integer.parseInt(array[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException("Ошибка в данных массива на ячейке [" + i + "][" + j + "]: " + array[i][j]);
                        }
                    }
                }

                return sum;
            }
        }