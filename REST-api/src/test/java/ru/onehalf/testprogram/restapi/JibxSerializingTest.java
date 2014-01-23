package ru.onehalf.testprogram.restapi;

import org.hamcrest.Matchers;
import org.junit.Test;
import ru.onehalf.testprogram.restapi.jibxstubs.Tests;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class JibxSerializingTest {

    private final JibxSerializing instance = new JibxSerializing();

    @Test
    public void testJibxSerializing() throws Exception {
        Tests result = instance.unmarshal(getClass().getResourceAsStream("example.xml"), Tests.class);
        assertThat(result, is(notNullValue()));
        assertThat(result.getTestList(), Matchers.hasSize(2));
    }

}
