package refacotring.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarCheckerTest {


    @Test
    void test_calcPoint(){
        SimilarChecker sc = new SimilarChecker();
        //alphabet 50 + length 50 = 100점
        assertEquals(100, sc.calcSimilarPoint("ABCDE", "ABCDE"));
        //alphabet 0 + length 50 = 100점
        assertEquals(50, sc.calcSimilarPoint("ASD", "QWE"));
        //alphabet 40 + length 30 = 80점
        assertEquals(70, sc.calcSimilarPoint("ABCDE", "ABCD"));
        //alphabet 30 + length 20 = 50점
        assertEquals(50, sc.calcSimilarPoint("ABCDE", "ABC"));
        //alphabet 20 + length 0 = 20점
        assertEquals(20, sc.calcSimilarPoint("ABCDE", "AB"));

    }

    @Test
    void test_calcLength(){
        SimilarChecker sc = new SimilarChecker();
        assertEquals(50, sc.calcLengthPoint("ASD", "QWE"));
        assertEquals(0, sc.calcLengthPoint("A", "BB"));
        //부분점수
        //2배미만 ~ 1.75배이상 10점 - 1.83
        assertEquals(10, sc.calcLengthPoint("AAAAAA", "BBBBBBBBBBB"));
        //1.75배미만 ~ 1.5배이상 20점 - 1.66
        assertEquals(20, sc.calcLengthPoint("AAAAAA", "BBBBBBBBBB"));
        //1.5배미만 ~ 1.25배이상 30점 - 1.42
        assertEquals(30, sc.calcLengthPoint("AAAAAAA", "BBBBBBBBBB"));
        //1.25배미만 ~ 1배초과 40점 - 1.11
        assertEquals(40, sc.calcLengthPoint("AAAAAAAAA", "BBBBBBBBBB"));

    }

    @Test
    void test_calcAlphabet(){
        SimilarChecker sc = new SimilarChecker();
        assertEquals(50, sc.calcAlphabetPoint("AABBB", "AB"));
        assertEquals(0, sc.calcAlphabetPoint("AB", "CD"));
        // 부분점수 - 같은 갯수의 비율
        // 100%미만 ~ 75%이상 - 40점 - 80%
        assertEquals(40, sc.calcAlphabetPoint("ABCDE", "ABCD"));
        // 75%미만 ~ 50%이상 - 30점
        assertEquals(30, sc.calcAlphabetPoint("ABCDE", "ABC"));
        // 50%미만 ~ 25%이상 - 20점
        assertEquals(20, sc.calcAlphabetPoint("ABCDE", "AB"));
        // 25%미만 ~ 0% 초과 - 10점
        assertEquals(10, sc.calcAlphabetPoint("ABCDE", "A"));
    }

}