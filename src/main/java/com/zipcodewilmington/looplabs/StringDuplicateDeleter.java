package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

//        return Arrays.stream(array).filter(
//                word -> Collections.frequency(Arrays.asList(array), word) < maxNumberOfDuplications)
//                .toArray(String[]::new);
        return Arrays.stream(array).filter(x -> getOccurence(x) < maxNumberOfDuplications).toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
//        return Arrays.stream(array).filter(
//                word -> Collections.frequency(Arrays.asList(array), word) != exactNumberOfDuplications)
//                .toArray(String[]::new);
        return Arrays.stream(array).filter(x -> getOccurence(x) != exactNumberOfDuplications).toArray(String[]::new);
    }

    public long getOccurence(String number){
        return Arrays.stream(array).filter(i -> i.equals(number)).count();
    }
}
