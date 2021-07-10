package com.vaadin.tutorial.crm.ui.views.ordering;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.testbench.parallel.ParallelTest;
import com.vaadin.tutorial.crm.backend.service.KundeService;
import com.vaadin.tutorial.crm.backend.service.LieferungService;
import com.vaadin.tutorial.crm.backend.service.MahlzeitService;
import com.vaadin.tutorial.crm.it.AbstractTest;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import com.vaadin.flow.component.UI;
import static org.junit.jupiter.api.Assertions.*;

class BestellungenOrderViewTest extends ParallelTest{

    @Test
    public void testConstructorInitialization(){
        KundeService kundeService = Mockito.mock(KundeService.class);
        BestellungenOrderView bestellungenOrderView = Mockito.mock(BestellungenOrderView.class);
        MahlzeitService mahlzeitService = Mockito.mock(MahlzeitService.class);
        LieferungService lieferungService = Mockito.mock(LieferungService.class);
       //DatePicker datePicker = Mockito.mock(DatePicker.class);
        //Mockito.when(new DatePicker()).thenReturn(datePicker);
        UI ui =Mockito.mock(UI.class);
        MockedStatic<UI> ui1 = Mockito.mockStatic(UI.class);
        //Mockito.when(UI.getCurrent()).thenReturn(ui);
        Mockito.when(UI.getCurrent()).thenReturn(ui);
        BestellungenOrderView bestellungenOrderView1 = new BestellungenOrderView(kundeService, mahlzeitService, lieferungService);

        assertNotNull(bestellungenOrderView1);
    }
}