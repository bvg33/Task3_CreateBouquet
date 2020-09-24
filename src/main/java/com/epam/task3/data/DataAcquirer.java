package com.epam.task3.data;

import com.epam.task3.exceptions.DataException;

public interface DataAcquirer {
    int getNumber() throws DataException;
}