package com.vaadin.tutorial.crm.ui.views.driver;

import com.vaadin.tutorial.crm.backend.service.KundeService;
import com.vaadin.tutorial.crm.backend.service.LieferungService;
import com.vaadin.tutorial.crm.ui.views.customerlist.ListView;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for @{@link DriverView} class
 */
class DriverViewTest {

    /**
     * Unit test for constructor initialization and object creation of @{@link ListView} class.
     */
    @Test
    public void testConstructorInitialization(){
        KundeService kundeService = Mockito.mock(KundeService.class);
        LieferungService lieferungService = Mockito.mock(LieferungService.class);
        DriverView driverView = new DriverView(lieferungService, kundeService);
        assertNotNull(driverView);
    }

}