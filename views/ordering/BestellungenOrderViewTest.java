package com.vaadin.tutorial.crm.ui.views.ordering;

import com.vaadin.tutorial.crm.backend.service.KundeService;
import com.vaadin.tutorial.crm.backend.service.LieferungService;
import com.vaadin.tutorial.crm.backend.service.MahlzeitService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.vaadin.flow.component.UI;



import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class BestellungenOrderViewTest{

    /**
     * Unit test for constructor initialization and object creation of @{@link BestellungenOrderView} class.
     */
    @Test
    public void testConstructorInitialization()  {
        KundeService kundeService = Mockito.mock(KundeService.class);
        MahlzeitService mahlzeitService = Mockito.mock(MahlzeitService.class);
        LieferungService lieferungService = Mockito.mock(LieferungService.class);
        UI ui = new UI();
        ui.setLocale(Locale.GERMAN);
        UI.setCurrent(ui);
        BestellungenOrderView bestellungenOrderView = new BestellungenOrderView(kundeService, mahlzeitService, lieferungService);
        assertNotNull(bestellungenOrderView);
    }
}