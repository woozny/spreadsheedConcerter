// ***************************************************************************
// Copyright (c) 2016, Industrial Logic, Inc., All Rights Reserved.
//
// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
// used by students during Industrial Logic's workshops or by individuals
// who are being coached by Industrial Logic on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Industrial Logic, Inc.
// ****************************************************************************

import static org.junit.Assert.*;

import org.junit.Test;


public class SpreadsheetTest {

    private Spreadsheet spreadsheet = new Spreadsheet();

    @Test
    public void shouldConvert0toA() {
        assertEquals("A", spreadsheet.indexToColumn(0));
    }

    @Test
    public void shouldConvert1toB() {
        assertEquals("B", spreadsheet.indexToColumn(1));
    }

    @Test
    public void shouldConvert2toC() {
        assertEquals("C", spreadsheet.indexToColumn(2));
    }

    @Test
    public void shouldConvert25toZ() {
        assertEquals("Z", spreadsheet.indexToColumn(25));
    }

    @Test
    public void shouldConvert26toAA() {
        assertEquals("AA", spreadsheet.indexToColumn(26));
    }

    @Test
    public void shouldConvert28toAC() {
        assertEquals("AC", spreadsheet.indexToColumn(28));
    }

    @Test
    public void shouldConvert51toAZ() {
        assertEquals("AZ", spreadsheet.indexToColumn(51));
    }

    @Test
    public void shouldConvert52toBA() {
        assertEquals("BA", spreadsheet.indexToColumn(52));
    }

    @Test
    public void shouldConvert701toZZ() {
        assertEquals("ZZ", spreadsheet.indexToColumn(701));
    }

    @Test
    public void shouldConvert702toAAA() {
        assertEquals("AAA", spreadsheet.indexToColumn(702));
    }

    @Test
    public void shouldConvertAto0() {
        assertEquals(0, spreadsheet.columnToIndex("A"));
    }

    @Test
    public void shouldConvertBto1() {
        assertEquals(1, spreadsheet.columnToIndex("B"));
    }

    @Test
    public void shouldConvertZto25() {
        assertEquals(25, spreadsheet.columnToIndex("Z"));
    }

}
