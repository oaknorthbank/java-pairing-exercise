package org.oaknorth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class InvoiceConsumer {
    public List<Invoice> readInvoices(File file) throws IOException {

        List<Invoice>invoiceList=new ArrayList<>();
        //TODO:add code to read invoices from file
        return invoiceList;
    }



    public File getInvoiceFile(String fileName) throws FileNotFoundException, URISyntaxException {
        URL resource = getClass().getClassLoader().getResource(fileName);
        if (resource == null) {
            throw new FileNotFoundException("file not found!");
        } else {
            return new File(resource.toURI());
        }
    }
}
