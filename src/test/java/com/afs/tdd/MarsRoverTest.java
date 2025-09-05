package com.afs.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    public static Stream<Arguments> provideTestCasesForMoveCommand() {
        return Stream.of(
                Arguments.of(0,0,Direction.N,0,1,Direction.N),
                Arguments.of(0,0,Direction.S,0,-1,Direction.S),
                Arguments.of(0,0,Direction.E,1,0,Direction.E),
                Arguments.of(0,0,Direction.W,-1,0,Direction.W)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesForMoveCommand")
    public void Should_return_MarsRoverLocation_when_execute_command_given_command_M(
            int initialLocationX, int initialLocationY, Direction initialDirection,
            int expectedLocationX, int expectedLocationY, Direction expectedDirection) {
        //given
        String command="M";
        Location location = new Location(initialLocationX,initialLocationY,initialDirection);
        MarsRover result = new MarsRover(location);

        //when
        result.executeCommand(command);

        //then
        assertEquals(expectedLocationX,result.getLocationX());
        assertEquals(expectedLocationY,result.getLocationY());
        assertEquals(expectedDirection,result.getDirection());
    }


}
