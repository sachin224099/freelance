package com.vaadin.tutorial.crm.ui.views.customerlist;

import com.vaadin.tutorial.crm.backend.service.AllergeneService;
import com.vaadin.tutorial.crm.backend.service.KundeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for @{@link ListView} class.
 */
class ListViewTest {

    /**
     * Unit test for constructor initialization and object creation of @{@link ListView} class.
     */
    @Test
    public void testConstructorInitialization(){
        KundeService kundeService = Mockito.mock(KundeService.class);
        AllergeneService allergeneService = Mockito.mock(AllergeneService.class);
        ListView listView = new ListView(kundeService, allergeneService);

        assertNotNull(listView);
    }

}