package json.serialization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonSerializationTest {

    @Test
    public void testJsonSerialization() {
        Person person = new Person();
        person.setName("Name");
        person.setDateOfBirth("01/01/2001");
        person.setSex(Sex.SHIM);
        person.setPhoneNumber("09023456789");

        String json =  JsonSerializer.serialize(person);
        String expected = "{\"name\":\"Name\",\"dateOfBirth\":\"01/01/2001\",\"phoneNumber\":\"09023456789\",\"sex\":\"SHIM\"}";
        assertEquals(expected, json);
    }

}
