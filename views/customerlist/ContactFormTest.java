package com.vaadin.tutorial.crm.ui.views.customerlist;

import com.vaadin.tutorial.crm.backend.entity.Adresse;
import com.vaadin.tutorial.crm.backend.entity.Kunde;
import com.vaadin.tutorial.crm.backend.service.AllergeneService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for @{@link ContactForm} class.
 */
class ContactFormTest {

    private Kunde kunde;

    /**
     * set up stage to be called before each executing each test.
     */
    @BeforeEach
    void setUp() {
        kunde = new Kunde();
        Adresse adresse = new Adresse();
        this.kunde.setVorname("testVorname");
        this.kunde.setNachname("testNachname");
        this.kunde.setZusatzinfos("Zusatzinfos");
        this.kunde.setTelefonnummer("12454657");
        adresse.setHausnummer("56");
        adresse.setStrasse("testStrasse");
        adresse.setOrt("testOrt");
        adresse.setPlz("testPlz");
        this.kunde.setAdresse(adresse);
    }

    /**
     * Unit test for constructor initialization and object creation of @{@link ContactForm} class.
     */
    @Test
    public void testConstructorInitialization(){
        AllergeneService allergeneService = Mockito.mock(AllergeneService.class);
        ContactForm contactForm = new ContactForm(allergeneService);
        assertNotNull(contactForm);
    }

    /**
     * Unit test for setCustomer method.
     */
    @Test
    public void testSetCustomer() {
        AllergeneService allergeneService = Mockito.mock(AllergeneService.class);
        ContactForm contactForm = new ContactForm(allergeneService);
        contactForm.setCustomer(kunde);
        assertEquals("testVorname", contactForm.vorname.getValue());
        assertEquals("testNachname", contactForm.nachname.getValue());
        assertEquals("Zusatzinfos", contactForm.zusatzinfos.getValue());
        assertEquals("12454657", contactForm.telefonnummer.getValue());
        assertEquals("56", contactForm.hausnummer.getValue());
        assertEquals("testStrasse", contactForm.strasse.getValue());
        assertEquals("testOrt", contactForm.ort.getValue());
        assertEquals("testPlz", contactForm.plz.getValue());
    }

}