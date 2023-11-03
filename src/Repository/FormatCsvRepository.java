/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.FormatCsvDAO;
import Model.CSV;
import java.util.ArrayList;

/**
 *
 * @author Xuan Vinh
 */
public class FormatCsvRepository implements IFormatCsvRepository{
    
    @Override
    public void importFile(ArrayList<CSV> list) {
        FormatCsvDAO.Instance().importFile(list);
    }

    @Override
    public void formatAddress(ArrayList<CSV> list) {
        FormatCsvDAO.Instance().formatAddress(list);
    }

    @Override
    public void formatName(ArrayList<CSV> list) {
        FormatCsvDAO.Instance().formatName(list);
    }

    @Override
    public void exportFile(ArrayList<CSV> list) {
        FormatCsvDAO.Instance().exportFile(list);
    }

    @Override
    public void print(ArrayList<CSV> list) {
        FormatCsvDAO.Instance().print(list);
    }
    
}
