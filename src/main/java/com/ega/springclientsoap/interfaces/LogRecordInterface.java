/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ega.springclientsoap.interfaces;

import com.ega.springclientsoap.models.LogRecord;

/**
 *
 * @author sa
 * Це інтерфейс для класа логування запитів
 */
public interface LogRecordInterface {
    public Boolean addRecord(LogRecord record);
    
}
