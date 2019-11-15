package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
//        return Arrays.stream(array).filter(
//                i -> Collections.frequency(Arrays.asList(array), i) < maxNumberOfDuplications)
//                .toArray(Integer[]::new);

        return Arrays.stream(array).filter(x -> getOccurrence(x) < maxNumberOfDuplications).toArray(Integer[]::new);

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

//        return Arrays.stream(array).filter(
//                i -> Collections.frequency(Arrays.asList(array), i) != exactNumberOfDuplications).toArray(Integer[]::new);

        return Arrays.stream(array).filter(x -> getOccurrence(x) != exactNumberOfDuplications).toArray(Integer[]::new);

    }

    public long getOccurrence(Integer integer){
        return Arrays.stream(array).filter(x -> x == integer).count();

    }
}
