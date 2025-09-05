package com.afs.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0, N, 0, 1, N",
            "0, 0, S, 0, -1, S",
            "0, 0, W, -1, 0, W",
            "0, 0, E, 1, 0, E"
    })
    public void Should_return_MarsRoverLocation_when_execute_command_given_command_M(
            int initialLocationX, int initialLocationY, Direction initialDirection,
            int expectedLocationX, int expectedLocationY, Direction expectedDirection) {
        //given
        String command="M";
        MarsRover result = new MarsRover(initialLocationX,initialLocationY,initialDirection);

        //when
        result.executeCommand(command);

        //then
        assertEquals(expectedLocationX,result.getLocationX());
        assertEquals(expectedLocationY,result.getLocationY());
        assertEquals(expectedDirection,result.getDirection());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, N, 0, 0, W",
            "0, 0, S, 0, 0, E",
            "0, 0, W, 0, 0, S",
            "0, 0, E, 0, 0, N"
    })
    public void Should_return_MarsRoverLocation_when_execute_command_given_command_L(
            int initialLocationX, int initialLocationY, Direction initialDirection,
            int expectedLocationX, int expectedLocationY, Direction expectedDirection) {
        //given
        String command="L";
        MarsRover result = new MarsRover(initialLocationX,initialLocationY,initialDirection);

        //when
        result.executeCommand(command);

        //then
        assertEquals(expectedLocationX,result.getLocationX());
        assertEquals(expectedLocationY,result.getLocationY());
        assertEquals(expectedDirection,result.getDirection());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, N, 0, 0, E",
            "0, 0, S, 0, 0, W",
            "0, 0, W, 0, 0, N",
            "0, 0, E, 0, 0, S"
    })
    public void Should_return_MarsRoverLocation_when_execute_command_given_command_R(
            int initialLocationX, int initialLocationY, Direction initialDirection,
            int expectedLocationX, int expectedLocationY, Direction expectedDirection) {
        //given
        String command="R";
        MarsRover result = new MarsRover(initialLocationX,initialLocationY,initialDirection);

        //when
        result.executeCommand(command);

        //then
        assertEquals(expectedLocationX,result.getLocationX());
        assertEquals(expectedLocationY,result.getLocationY());
        assertEquals(expectedDirection,result.getDirection());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, N, 0, -1, N",
            "0, 0, S, 0, 1, S",
            "0, 0, W, 1, 0, W",
            "0, 0, E, -1, 0, E"
    })
    public void Should_return_MarsRoverLocation_when_execute_command_given_command_B(
            int initialLocationX, int initialLocationY, Direction initialDirection,
            int expectedLocationX, int expectedLocationY, Direction expectedDirection) {
        //given
        String command="B";
        MarsRover result = new MarsRover(initialLocationX,initialLocationY,initialDirection);

        //when
        result.executeCommand(command);

        //then
        assertEquals(expectedLocationX,result.getLocationX());
        assertEquals(expectedLocationY,result.getLocationY());
        assertEquals(expectedDirection,result.getDirection());
    }
}
