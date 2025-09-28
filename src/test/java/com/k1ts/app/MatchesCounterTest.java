package com.k1ts.app;

class MatchesCounterTest {

    public static void main(String[] args) {
        MatchesCounterTest testEnv = new MatchesCounterTest();

        System.out.println("Running tests...");
        testEnv.testThatSingleSquareRequires4Matches();
        testEnv.testThatTwoSquaresRequire7Matches();
        testEnv.testThatThreeSquaresRequire10Matches();
        testEnv.testThatFourSquaresRequire12Matches();
        testEnv.testThatFiveSquaresRequire15Matches();
        testEnv.testThatSixSquaresRequire17Matches();
    }

    private void testThatSingleSquareRequires4Matches() {
        int expected = 4;
        int actual = new MatchesCounter(1).countMatches();
        assert expected == actual : "Test failed, expected: " + expected + ", but actual: " + actual;
    }

    private void testThatTwoSquaresRequire7Matches() {
        int expected = 7;
        int actual = new MatchesCounter(2).countMatches();
        assert expected == actual : "Test failed, expected: " + expected + ", but actual: " + actual;
    }

    private void testThatThreeSquaresRequire10Matches() {
        int expected = 10;
        int actual = new MatchesCounter(3).countMatches();
        assert expected == actual : "Test failed, expected: " + expected + ", but actual: " + actual;
    }

    private void testThatFourSquaresRequire12Matches() {
        int expected = 12;
        int actual = new MatchesCounter(4).countMatches();
        assert expected == actual : "Test failed, expected: " + expected + ", but actual: " + actual;
    }

    private void testThatFiveSquaresRequire15Matches() {
        int expected = 15;
        int actual = new MatchesCounter(5).countMatches();
        assert expected == actual : "Test failed, expected: " + expected + ", but actual: " + actual;
    }

    private void testThatSixSquaresRequire17Matches() {
        int expected = 17;
        int actual = new MatchesCounter(6).countMatches();
        assert expected == actual : "Test failed, expected: " + expected + ", but actual: " + actual;
    }
}