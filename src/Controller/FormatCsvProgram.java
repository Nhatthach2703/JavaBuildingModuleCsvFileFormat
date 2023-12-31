/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CSV;
import Repository.FormatCsvRepository;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author Xuan Vinh
 */
public class FormatCsvProgram extends Menu<String>{
    static String[] mc = {"Import CSV", "Format Address", "Format Name", "Export CSV", "Exit"};
    FormatCsvRepository program;
    ArrayList<CSV> list;

    public FormatCsvProgram() {
        super("\nFormat CSV Program", mc);
        program = new FormatCsvRepository();
        list = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.importFile(list);
                program.print(list);
                break;
            case 2:
                program.formatAddress(list);
                program.print(list);
                break;
            case 3:
                program.formatName(list);
                program.print(list);
                break;
            case 4:
                program.exportFile(list);
                break;
            case 5:
                System.exit(0);
        }
    }
}
