package com.techvantage.corejava.beginner.variables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class TestLearningVariables {

    LearningVariables learningVariables;

    @BeforeEach
    void setup(){
        learningVariables=new LearningVariables();

    }

    @Test
    @DisplayName("Checking the variable name is correct")
    void checkVariables() throws NoSuchFieldException {
        Class obj= learningVariables.getClass();
        Field variable=obj.getField("numberofFriends");
//        Assertions.assertEquals("numberofFriends",objnumberofFriends);
    }

}
