package com.jadenzhang.test;

import org.apache.poi.xwpf.usermodel.*;

import java.util.HashMap;
import java.util.Map;

public enum Abcd {
    A("1"),
    B("2"),
    C("3"),;

    private String id;
    private Abcd(String id) {
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}
class test{
    public static void main(String[] args) {
        XWPFDocument xwpfDocument = new XWPFDocument();
        XWPFParagraph paragraph = xwpfDocument.createParagraph();
        XWPFRun run = paragraph.createRun();
        XWPFTable table = xwpfDocument.createTable();
        XWPFTableRow row = table.createRow();
        row.getCell(0).setText("");

    }
}


