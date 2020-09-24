package com.epam.task3.view;

import com.epam.task3.enums.TypesOfResultPrinters;
import com.epam.task3.exceptions.NoSuchRealizationOfInterfaceException;

public class ResultPrinterFactory {
    private static final String FILENAME = "src/main/resources/output.txt";

    public static ResultPrinter createResultPrinter(TypesOfResultPrinters types) throws NoSuchRealizationOfInterfaceException {
        ResultPrinter printerToReturn = null;
        switch (types) {
            case CONSOLE:
                printerToReturn = new ConsoleResultPrinter();
                break;
            case FILE:
                printerToReturn = new FileResultPrinter(FILENAME);
                break;
            default:
                throw new NoSuchRealizationOfInterfaceException("No such Data Acquirer");
        }
        return printerToReturn;
    }
}
