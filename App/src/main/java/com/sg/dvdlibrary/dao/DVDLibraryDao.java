/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author janlee
 */
public interface DVDLibraryDao {
    
    DVD AddDVD(String title, DVD dvd) throws DVDLibraryDaoException;
    
    DVD RemoveDVD(String title) throws DVDLibraryDaoException;
    
    DVD EditDVD(String title) throws DVDLibraryDaoException;
    
    DVD DisplayDVDDetails(String title) throws DVDLibraryDaoException;
    
    List<DVD> ListAllDVD() throws DVDLibraryDaoException;

    public void addDVD(String title, DVD newDVD);
}
