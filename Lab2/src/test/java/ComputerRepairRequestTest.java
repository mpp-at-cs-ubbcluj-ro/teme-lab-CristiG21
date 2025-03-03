import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Test 1")
    public void test1() {
        ComputerRepairRequest request = new ComputerRepairRequest(1, "A A", "Address A", "072222", "Asus", "13/10/2020", "Broken display");
        assertEquals(1, request.getID());
        assertEquals("A A", request.getOwnerName());
        assertEquals("Address A", request.getOwnerAddress());
        assertEquals("072222", request.getPhoneNumber());
        assertEquals("Asus", request.getModel());
        assertEquals("13/10/2020", request.getDate());
        assertEquals("Broken display", request.getProblemDescription());
    }

    @Test
    @DisplayName("Test 2")
    public void test2(){
        ComputerRepairRequest request = new ComputerRepairRequest();
        request.setID(2);
        request.setOwnerName("B B");
        request.setOwnerAddress("Address B");
        request.setPhoneNumber("072222");
        request.setModel("Acer");
        request.setDate("10/10/2020");
        request.setProblemDescription("Faulty keyboard");
        assertEquals(2, request.getID());
        assertEquals("B B", request.getOwnerName());
        assertEquals("Address B", request.getOwnerAddress());
        assertEquals("072222", request.getPhoneNumber());
        assertEquals("Acer", request.getModel());
        assertEquals("10/10/2020", request.getDate());
        assertEquals("Faulty keyboard", request.getProblemDescription());
    }
}
