package com.epam.task3.data;

import com.epam.task3.enums.TypesOfDataAcquirers;
import com.epam.task3.exceptions.NoSuchRealizationOfInterfaceException;

public class DataAcquirerFactory {
    private static final String FILENAME = "src/main/resources/input.txt";

    public static DataAcquirer createDataAcquirer(TypesOfDataAcquirers types) throws NoSuchRealizationOfInterfaceException {
        DataAcquirer acquirerToReturn = null;
        switch (types) {
            case CONSOLE:
                acquirerToReturn = new ConsoleDataAcquirer();
                break;
            case FILE:
                acquirerToReturn = new FileDataAcquirer(FILENAME);
                break;
            default:
                throw new NoSuchRealizationOfInterfaceException("No such Data Acquirer");
        }
        return acquirerToReturn;
    }
}
