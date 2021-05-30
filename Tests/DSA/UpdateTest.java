package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UpdateTest {
    Update update;

    @BeforeEach
    void setUp() {
        update = new Update();

    }
    @Test
    void sumOfElementsInAnArray(){

        int [] array = {1,2,3,4,5,6,7,8,9,10};
        update.sum(array);

        assertEquals(55,update.getTotal());
    }


    @Test
    void searchingAnArray(){

        int [] array = {1,2,3,4,5,6,7,8,9,10};  //searching can be done in 2 ways, either the index or the value itself ;
        int number = 5;
        int index = update.search(array,number);

        assertEquals(4, index);
    }

    @Test
    void insertIntoAnArray(){

        int [] array = {1,2,3,4,6,7,8,9,10};

        assertEquals(7, update.search(array,9));

        int numberToInsert = 5;

        int position = 4;

        int[] newArr = update.insert(array, numberToInsert, position);

        assertEquals(8, update.search(newArr,9));
    }

    @Test
    void deleteAnElement(){

        int [] array = {1,2,3,4,5,6,7,8,9,10};

        assertEquals(8, update.search(array,9));

        int numberToDelete = 5;

        int[] newArr = update.delete(array, numberToDelete);
        System.out.println(Arrays.toString(newArr));

        assertEquals(7, update.search(newArr,9));
    }

    @Test
    void updateAnElement(){

        int [] array = {1,2,3,4,5,6,7,8,9,10};

        assertEquals(8, update.search(array,9));

        int numberToUpdate = 5;

        int[] newArr = update.delete(array, numberToUpdate);
        System.out.println(Arrays.toString(newArr));

        assertEquals(7, update.search(newArr,9));

    }

    }






