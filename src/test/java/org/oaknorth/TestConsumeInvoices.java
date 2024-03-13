package org.oaknorth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

public class TestConsumeInvoices {

    @Test
    public void testReadAllInvoices() throws IOException, URISyntaxException {
        InvoiceConsumer consumer=new InvoiceConsumer();
        //TODO: assert for get list of invoices with number of items in csv file
    }

    @Test
    public void testIfInvoiceFileNotExists() throws FileNotFoundException, URISyntaxException {
      assertThrows(FileNotFoundException.class,new Executable() {
          @Override
          public void execute() throws Throwable {
              InvoiceConsumer consumer=new InvoiceConsumer();
              consumer.getInvoiceFile("invoice.csv");
          }
      });

    }

}
