
package com.zc.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zc.service.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetNewStringResponse_QNAME = new QName("http://impl.service.zc.com/", "getNewStringResponse");
    private final static QName _GetName_QNAME = new QName("http://impl.service.zc.com/", "getName");
    private final static QName _GetNameResponse_QNAME = new QName("http://impl.service.zc.com/", "getNameResponse");
    private final static QName _GetNewString_QNAME = new QName("http://impl.service.zc.com/", "getNewString");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zc.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNewString }
     * 
     */
    public GetNewString createGetNewString() {
        return new GetNewString();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetNewStringResponse }
     * 
     */
    public GetNewStringResponse createGetNewStringResponse() {
        return new GetNewStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.zc.com/", name = "getNewStringResponse")
    public JAXBElement<GetNewStringResponse> createGetNewStringResponse(GetNewStringResponse value) {
        return new JAXBElement<GetNewStringResponse>(_GetNewStringResponse_QNAME, GetNewStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.zc.com/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.zc.com/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.zc.com/", name = "getNewString")
    public JAXBElement<GetNewString> createGetNewString(GetNewString value) {
        return new JAXBElement<GetNewString>(_GetNewString_QNAME, GetNewString.class, null, value);
    }

}
