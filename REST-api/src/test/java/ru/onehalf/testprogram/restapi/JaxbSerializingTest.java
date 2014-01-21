package ru.onehalf.testprogram.restapi;

import org.hamcrest.Matchers;
import ru.onehalf.testprogram.restapi.stubs.Tests;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class JaxbSerializingTest {

    private final JaxbSerializing instance = new JaxbSerializing();

    @org.junit.Test
    public void testJaxbSerializing() throws Exception {
        Tests result = instance.unmarshal(getClass().getResourceAsStream("example.xml"), Tests.class);
        assertThat(result, is(notNullValue()));
        assertThat(result.getTest(), Matchers.hasSize(2));
    }

}
