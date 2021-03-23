//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:54:32 AM IST 
//


package com.txodds;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.txodds package. 
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

    private final static QName _Matches_QNAME = new QName("", "matches");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.txodds
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link Matches }
     * 
     */
    public Matches createMatches() {
        return new Matches();
    }

    /**
     * Create an instance of {@link Match }
     * 
     */
    public Match createMatch() {
        return new Match();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link Odd }
     * 
     */
    public Odd createOdd() {
        return new Odd();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link Resultstatus }
     * 
     */
    public Resultstatus createResultstatus() {
        return new Resultstatus();
    }

    /**
     * Create an instance of {@link Odds }
     * 
     */
    public Odds createOdds() {
        return new Odds();
    }

    /**
     * Create an instance of {@link Bookmaker }
     * 
     */
    public Bookmaker createBookmaker() {
        return new Bookmaker();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Results.Periods }
     * 
     */
    public Results.Periods createResultsPeriods() {
        return new Results.Periods();
    }

    /**
     * Create an instance of {@link Results.Scorers }
     * 
     */
    public Results.Scorers createResultsScorers() {
        return new Results.Scorers();
    }

    /**
     * Create an instance of {@link Period.Detail }
     * 
     */
    public Period.Detail createPeriodDetail() {
        return new Period.Detail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Matches }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matches")
    public JAXBElement<Matches> createMatches(Matches value) {
        return new JAXBElement<Matches>(_Matches_QNAME, Matches.class, null, value);
    }

}