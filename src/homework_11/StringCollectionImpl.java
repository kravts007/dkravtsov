package homework_11;

import java.util.Arrays;

public class StringCollectionImpl implements StringCollection {

    private String[] array = new String[0];

    @Override
    public String get(int index) {
        return array[index];
    }


    @Override
    public boolean add(String str) {
        String[] newArr = Arrays.copyOf(array, array.length + 1);
        newArr[newArr.length - 1] = str;
        this.array = newArr;
        return true;
    }

    @Override
    public boolean add(int index, String str) {
        if (index > array.length + 1 || index < 0) {
            return false;
        } else {
            String[] newArr = new String[array.length + 1];
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArr[k] = array[i];
                    k++;
                } else {
                    newArr[k] = str;
                    newArr[k + 1] = array[i];
                    k += 2;
                }
            }
            array = newArr;
            return true;
        }
    }

    @Override
    public boolean delete(String str) {
        if (contains(str)) {
            String[] newArr = new String[array.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                int k = i;
                if (array[i].equals(str)) {
                    k++;
                }
                newArr[i] = array[k];
            }
            array = newArr;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(StringCollection collection) {
        if (collection.size() == array.length) {
            for (int i = 0; i < collection.size(); i++) {
                if (!collection.get(i).equals(array[i])) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean clear() {
        array = new String[0];
        return true;
    }

    @Override
    public int size() {
        return this.array.length;
    }
}
