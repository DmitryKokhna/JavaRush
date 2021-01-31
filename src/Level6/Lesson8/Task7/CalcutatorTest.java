package Level6.Lesson8.Task7;

// тесты для методов / в задании не было

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalcutatorTest {

    @Test
    void plus() {
        Calcutator calcutator=new Calcutator();
        int actual=calcutator.plus(2,4);
        int expected=6;
        assertEquals(expected,actual);

    }

    @Test
    void minus() {
    }

    @Test
    void multyply() {
    }

    @Test
    void devision() {
    }

    @Test
    void percent() {
    }

    @Test
    void main() {
    }
}