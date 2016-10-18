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
	public void shouldConvert25toZ() {
		assertEquals("Z", spreadsheet.indexToColumn(25));
	}
}
