package ru.onehalf.testprogram.restapi;

import org.jibx.runtime.JiBXException;
import org.springframework.oxm.jibx.JibxMarshaller;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
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
public class JibxSerializing {

    private final JibxMarshaller jibx2Marshaller;

    public JibxSerializing() throws JiBXException {
        jibx2Marshaller = new JibxMarshaller();
        jibx2Marshaller.setTargetPackage("ru.onehalf.testprogram.restapi.jibxstubs");
        jibx2Marshaller.afterPropertiesSet();
    }

    public String marshal(Object object) throws IOException {
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        jibx2Marshaller.marshal(object, result);
        return writer.toString();
    }

    public <T> T unmarshal(InputStream inputStream, Class<T> clazz) throws IOException {
        return clazz.cast(jibx2Marshaller.unmarshal(new StreamSource(inputStream)));
    }

}
