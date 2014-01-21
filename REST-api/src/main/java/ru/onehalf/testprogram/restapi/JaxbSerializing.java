package ru.onehalf.testprogram.restapi;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.io.StringWriter;

/**
 * <p/>
 * <p/>
 * Created: 21.01.14 0:12
 * <p/>
 *
 * @author OneHalf
 */
public class JaxbSerializing {

    private final Jaxb2Marshaller jaxb2Marshaller;

    public JaxbSerializing() {
        jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan(new String[]{"ru.onehalf.testprogram.restapi.stubs"});
    }

    public String marshal(Object object) {
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        jaxb2Marshaller.marshal(object, result);
        return writer.toString();
    }

    public <T> T unmarshal(InputStream inputStream, Class<T> clazz) {
        return clazz.cast(jaxb2Marshaller.unmarshal(new StreamSource(inputStream)));
    }

}
