package json.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static json.serialization.JsonSerializer.deserialize;
import static json.serialization.JsonSerializer.serialize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JsonSerializationTest {

    @Test
    public void testJsonSerialization() {
        Person person = new Person();
        person.setName("Name");
        person.setDateOfBirth(LocalDate.parse("2001-01-01"));
        person.setSex(Sex.SHIM);
        person.setPhoneNumber("09023456789");

        String json =  serialize(person);
        System.out.println(json);
        String expected = "{\"name\":\"Name\",\"phoneNumber\":\"09023456789\",\"sex\":\"SHIM\",\"dob\":[2001,1,1]}";
        assertEquals(expected, json);
    }


    @Test
    public void testDeserialization() throws JsonProcessingException {
        Person person = new Person();
        person.setName("Name");
        person.setDateOfBirth(LocalDate.parse("2001-01-01"));
        person.setSex(Sex.SHIM);
        person.setPhoneNumber("09023456789");

        String json =  serialize(person);
        Person deserialize = deserialize(json);
        assertNotNull(deserialize);
        assertEquals("Name", deserialize.getName());
        assertEquals(LocalDate.parse("2001-01-01"), deserialize.getDateOfBirth());
        assertEquals("09023456789", deserialize.getPhoneNumber());
        assertEquals(Sex.SHIM, deserialize.getSex());
    }

}
