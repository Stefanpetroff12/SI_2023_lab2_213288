import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<User> users = new ArrayList<User>();


    @Test
    void EveryBranchTest() {
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, allUsers()););
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, allUsers()););
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, allUsers()););
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, allUsers()););
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

    }
}