/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.CSV;
import java.util.ArrayList;

/**
 *
 * @author Xuan Vinh
 */
public interface IFormatCsvRepository {
    void importFile(ArrayList<CSV> lits);

    void formatAddress(ArrayList<CSV> lits);

    void formatName(ArrayList<CSV> lits);

    void exportFile(ArrayList<CSV> lits);

    void print(ArrayList<CSV> lits);
}
